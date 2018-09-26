package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.alibaba.fastjson.JSON;

public class JDBC {
		  private static final String URL="jdbc:oracle:thin:@localhost:1521:orcl";
	      private static final String USER="factory";
	      private static final String PASSWORD="factory";
	      
	      //数据库
	      private static final String[][] equipment_bpbj={{"id","VARCHAR"},{"name","VARCHAR"},{"number","VARCHAR"},{"category","VARCHAR"},{"time","DATE"},{"message","VARCHAR"},{"attachment","VARCHAR"}};
	      private static final String[][] equipment_jszl={{"id","VARCHAR"},{"name","VARCHAR"},{"category","VARCHAR"},{"personnel","VARCHAR"},{"time","DATE"},{"message","VARCHAR"},{"attachment","VARCHAR"}};
	      private static final String[][] equipment_jxjl={{"id","VARCHAR"},{"content","VARCHAR"},{"unit","VARCHAR"},{"property","VARCHAR"},{"type","VARCHAR"},{"personnel","VARCHAR"},{"time","DATE"},{"message","VARCHAR"},{"attachment","VARCHAR"}};
	      private static final String[][] equipment_sbdz={{"id","VARCHAR"},{"name","VARCHAR"},{"number","VARCHAR"},{"unit","VARCHAR"},{"personnel","VARCHAR"},{"supervisor","VARCHAR"},{"time","DATE"},{"message","VARCHAR"},{"attachment","VARCHAR"}};
	      private static final String[][] equipment_sbgf={{"id","VARCHAR"},{"name","VARCHAR"},{"number","VARCHAR"},{"personnel","VARCHAR"},{"time","DATE"},{"attachment","VARCHAR"}};
	      private static final String[][] equipment_ydbg={{"id","VARCHAR"},{"content","VARCHAR"},{"category","VARCHAR"},{"state","VARCHAR"},{"proposer","VARCHAR"},{"professional","VARCHAR"},{"personnel","VARCHAR"},{"changetime","DATE"},{"receptiontime","DATE"},{"message","VARCHAR"},{"attachment","VARCHAR"}};
	      private static final String[][] equipment_zdqx={{"id","VARCHAR"},{"condition","VARCHAR"},{"question","VARCHAR"},{"professional","VARCHAR"},{"personnel","VARCHAR"},{"startime","DATE"},{"endtime","DATE"},{"message","VARCHAR"},{"attachment","VARCHAR"}};
	      private static final String[][] equipment_zygj={{"id","VARCHAR"},{"name","VARCHAR"},{"type","VARCHAR"},{"unit","VARCHAR"},{"number","VARCHAR"},{"place","VARCHAR"},{"factory","VARCHAR"},{"stocknumber","VARCHAR"},{"message","VARCHAR"},{"attachment","VARCHAR"}};
	      private static final String[][] equipment_dqgz={{"id","VARCHAR"},{"content","VARCHAR"},{"time","DATE"},{"cycle","VARCHAR"},{"professional","VARCHAR"},{"category","VARCHAR"},{"personnel","VARCHAR"},{"earlywarning","VARCHAR"},{"message","VARCHAR"},{"attachment","VARCHAR"}};
	      private static final String[][] equipment_sbgz={{"id","VARCHAR"},{"name","VARCHAR"},{"message","VARCHAR"},{"proposer","VARCHAR"},{"personnel","VARCHAR"},{"performance","VARCHAR"},{"retroaction","VARCHAR"},{"changetime","DATE"},{"receptiontime","DATE"},{"attachment","VARCHAR"}};
	      private static final String[][] equipment_zdjg={{"id","VARCHAR"},{"name","VARCHAR"},{"unit","VARCHAR"},{"professional","VARCHAR"},{"performance","VARCHAR"},{"acceptance","VARCHAR"},{"personnel","VARCHAR"},{"time","DATE"},{"message","VARCHAR"},{"attachment","VARCHAR"}};
	   

	      
	      
	      private static final Map<String, String[][]> tableMap=new HashMap<String, String[][]>();
	      private static final String[] tables={"equipment-bpbj","equipment-jszl","equipment-jxjl","equipment-sbdz","equipment-sbgf","equipment-ydbg","equipment-zdqx","equipment-zygj","equipment-dqgz","equipment-sbgz","equipment-zdjg"};
	      
	     private static Connection conn=null;
	     
	     static{
	    	 tableMap.put("equipment_bpbj", equipment_bpbj);
	    	 tableMap.put("equipment_jszl", equipment_jszl);
	    	 tableMap.put("equipment_jxjl", equipment_jxjl);
	    	 tableMap.put("equipment_zdqx", equipment_zdqx);
	    	 tableMap.put("equipment_sbdz", equipment_sbdz);
	    	 tableMap.put("equipment_sbgf", equipment_sbgf);
	    	 tableMap.put("equipment_ydbg", equipment_ydbg);
	    	 tableMap.put("equipment_zygj", equipment_zygj);
	    	 tableMap.put("equipment_dqgz", equipment_dqgz);
	    	 tableMap.put("equipment_sbgz", equipment_sbgz);
	    	 tableMap.put("equipment_zdjg", equipment_zdjg);
	     }
	    
	     
	     
	     static {
	         try {
	             //1.加载驱动程序
	             Class.forName("oracle.jdbc.driver.OracleDriver");
	             //2.获得数据库的连接
	             conn=DriverManager.getConnection(URL, USER, PASSWORD);
	         } catch (ClassNotFoundException e) {
	             e.printStackTrace();
	         } catch (SQLException e) {
	             e.printStackTrace();
	         }
	     }
	     //将获得的数据库与java的链接返回（返回的类型为Connection）
	     public static Connection getConnection(){
	         return conn;
	     }
	     
	     public static String txt2String(File file){
		        StringBuilder result = new StringBuilder();
		        try{
		            BufferedReader br = new BufferedReader(new FileReader(file));
		            String s = "";
		            while((s = br.readLine())!=null){
		                result.append(System.lineSeparator()+s);
		            }
		            br.close();    
		        }catch(Exception e){
		            e.printStackTrace();
		        }
		        return result.toString().trim();
		    }
	     
	     
	     
	     public static void main(String[] args){
	    	 String mulu="C:/QQ接收/741831203/FileRecv/json转入数据库的数据/data/";
	    	 PreparedStatement pre = null;
	    	 for (String string : tables) {
	    		 File file = new File(mulu+string+".json");
	    		 string=string.replace("-", "_");
	    		 String sql="insert into "+string+"( ";
	    		 String sql2="";
	    		 String[][] arr=tableMap.get(string);
	    		 for (int i=0;i< arr.length;i++) {
	    			 sql+="\""+arr[i][0]+"\"";
	    			 if ("VARCHAR".equals(arr[i][1])) {
	    				 sql2+="?";
	    			 }
	    			 if ("DATE".equals(arr[i][1])) {
	    				 sql2+="to_date(?,'yyyy-MM-dd HH:mi:ss')";
	    			 }
	    			 if (i<arr.length-1) {
	    				 sql+=",";
	    				 sql2+=",";
					}
				}
	    		 sql+=")values (";
	    		 sql2+=")";
	    		 sql+=sql2;
	    		 String json=txt2String(file);
	    		 Map mapType = JSON.parseObject(json,Map.class);
	    		 List list=(List) mapType.get("data");
	    		 for (Object listobject:list) {
	    			 String rsql=sql;
	    				try {
							pre = conn.prepareStatement(rsql);
							 List list1=(List)listobject;
							 System.out.println(list1);
							 String uuid = UUID.randomUUID().toString().replaceAll("-", "");
							 pre.setString(1,uuid);
							for (int i=0;i<list1.size();i++) {
								pre.setString(i+2, list1.get(i).toString());
							}
							int effectrows=pre.executeUpdate();
							System.out.println(effectrows);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
	    			 
				}
			}
	    	 
		    }

}
