package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class enum1 {
	 public static String txt2String(File file){
	        StringBuilder result = new StringBuilder();
	        try{
	            BufferedReader br = new BufferedReader(new FileReader(file));//����һ��BufferedReader������ȡ�ļ�
	            String s = null;
	            while((s = br.readLine())!=null){//ʹ��readLine������һ�ζ�һ��
	                result.append(System.lineSeparator()+s);
	            }
	            br.close();    
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	        return result.toString();
	    }
	  public static void main(String[] args){
	        File file = new File("E:/������Ŀ����/111/DLD.txt");
	        String aa=txt2String(file);
	        writeToFile2(aa);
	    }
	  public static void writeToFile2(String content){    
		    try {
		        File file = new File("E:/������Ŀ����/111/DLD111.txt");
		        //�ļ�������ʱ�����������ļ���
		        if(!file.exists()){
		            file.createNewFile();
		        }
		        FileWriter fw = new FileWriter(file,false);
		        BufferedWriter bw = new BufferedWriter(fw);
		        bw.write(content);
		        bw.close(); fw.close();
		        System.out.println("test2 done!");
		         
		    } catch (Exception e) {
		        // TODO: handle exception
		    }
		}
}
