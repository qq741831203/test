package test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.vividsolutions.jts.geom.Geometry;
import org.geotools.geojson.geom.GeometryJSON;

import java.io.*;

public class OladJson {
    public static void main(String[] args){
        String json=ReadFile("C:\\Users\\灰灰\\Desktop\\yumengxian(3).json");
        JSONObject geoObj = JSON.parseObject(json);
        json=geoObj.getString("features");
        JSONArray arr= JSON.parseArray(json);
        for (int i =0;i<arr.size();i++){
            String wkt= geoJsonToWKT(arr.get(i).toString());
            JSONObject pp=(JSONObject)arr.get(i);
            pp=JSONObject.parseObject(pp.getString("properties"));
            pp.put("cityzb",wkt);
            System.out.println(pp);
          //  System.out.println(geoJsonToWKT(arr.getet(i).toString()));

        }
       // json=geoJsonToWKT(json);

    }
    public static String geoJsonToWKT(String geoJson){
        //处理geoJson
        JSONObject geoObj = JSON.parseObject(geoJson);
        String geometryStr = geoObj.getString("geometry");
        String wkt = "";
        GeometryJSON gjson = new GeometryJSON();
        InputStream is =new ByteArrayInputStream(geometryStr.getBytes())  ;
        try{
            Geometry geometry = gjson.read(is);
            wkt = geometry.toText();
        }catch(IOException e){
            e.printStackTrace();
        }
        return wkt;
    }
    public static String ReadFile(String path){
        String laststr="";
        File file=new File(path);// 打开文件
        BufferedReader reader=null;
        try{
            FileInputStream in = new FileInputStream(file);
            reader=new BufferedReader(new InputStreamReader(in,"UTF-8"));// 读取文件
            String tempString=null;
            while((tempString=reader.readLine())!=null){
                laststr=laststr+tempString;
            }
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(reader!=null){
                try{
                    reader.close();
                }catch(IOException el){
                }
            }
        }
        return laststr;
    }
}
