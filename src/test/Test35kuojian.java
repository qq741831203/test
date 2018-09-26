package test;

import java.awt.Color;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFDataValidation;
import org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint;
import org.apache.poi.xssf.usermodel.XSSFDataValidationHelper;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.xy.pdgh.dto.GC_XKJGC_110;
import com.xy.pdgh.dto.GC_XKJGC_35;

public class Test35kuojian {

	//测试
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	TableTop.table35xkj(new ArrayList<GC_XKJGC_35>());
	TableTop.table110xkj(new ArrayList<GC_XKJGC_110>());
	}

	
	/**
	 * 110新扩建表
	 * @param name    表名  
	 * @param headlist  表头  comments=中文注释   top=英文字段命
	 * @param bodylist   表内容  若有下拉框这数据用String[]的形式
	 */
	public static void daochu110(String name ,List<Map<String,Object>> headlist,List<Map<String,Object>> bodylist){
		  XSSFWorkbook wb = new XSSFWorkbook();  
		  XSSFSheet sheet = wb.createSheet("new sheet");  
//		  sheet.setColumnWidth(0, 5000);
//		  sheet.setColumnWidth(1, 5000);
//		  sheet.setColumnWidth(2, 5000);
//		  sheet.setColumnWidth(7, 5000);
//		  sheet.setColumnWidth(8, 5000);
		  XSSFRow row = sheet.createRow(0);
		  row.setHeightInPoints(35); //设置行高
		  if(headlist.size()>0){
			  XSSFCell cell= row.createCell(0);
			  XSSFCellStyle style = wb.createCellStyle();  
			  XSSFCellStyle topstyle = wb.createCellStyle();  
			  
			  XSSFCellStyle tople = wb.createCellStyle();  //表名样式
			  
			  //设置颜色
			  Color colort=new Color(204,255,204);
			  XSSFColor xssfcolort =new XSSFColor(colort);
			  tople.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);
			  tople.setAlignment(XSSFCellStyle.ALIGN_CENTER);
			  tople.setFillForegroundColor(xssfcolort);
			  tople.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
			  
			  // 设置字体
		        XSSFFont fontt = wb.createFont();
		        //设置字体大小
		        fontt.setFontHeightInPoints((short)17);
		        //字体加粗
		        fontt.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
		        //设置字体名字
		        fontt.setFontName("宋体");
		        //设置字体颜色
		        //fontt.setColor(HSSFColor.WHITE.index);
		        
		        tople.setFont(fontt);
		        
			  style.setAlignment(XSSFCellStyle.ALIGN_CENTER);
			  style.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
			  style.setBorderBottom(XSSFCellStyle.BORDER_THIN);
			  style.setBorderLeft(XSSFCellStyle.BORDER_THIN);
			  style.setBorderRight(XSSFCellStyle.BORDER_THIN);
			  style.setBorderTop(XSSFCellStyle.BORDER_THIN);// 创建一个居中格式

			  //设置颜色
			  Color color=new Color(51,153,102);
			  XSSFColor xssfcolor =new XSSFColor(color);
			  topstyle.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);
			  topstyle.setFillForegroundColor(xssfcolor);
			  // 设置字体
		        XSSFFont font = wb.createFont();
		        //设置字体大小
		        font.setFontHeightInPoints((short)10);
		        //字体加粗
		       // font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
		        //设置字体名字
		        font.setFontName("宋体");
		        //设置字体颜色
		        font.setColor(HSSFColor.WHITE.index);
		        
		        topstyle.setFont(font);
			  
			  topstyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
			  topstyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
			  topstyle.setBorderBottom(XSSFCellStyle.BORDER_THIN);
			  topstyle.setBorderLeft(XSSFCellStyle.BORDER_THIN);
			  topstyle.setBorderRight(XSSFCellStyle.BORDER_THIN);
			  topstyle.setBorderTop(XSSFCellStyle.BORDER_THIN);// 创建一个居中格式
			  
				 cell.setCellValue(name);//表名
				 cell.setCellStyle(tople);
				 sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, headlist.size()+3));
				
		        row=sheet.createRow(1);
		        int k=0;
		        int jj=0;
//		        for(Map<String,Object> map:headlist){
//		        	int len=map.get("comments").toString().getBytes().length*256>map.get("top").toString().getBytes().length*256?map.get("comments").toString().getBytes().length*256:map.get("top").toString().getBytes().length*256;
//		        	sheet.setColumnWidth(jj++, len+1000);
//		        }
		        List<Map<String,Object>> toplist=new ArrayList<Map<String,Object>>();
		       for(Map<String,Object> map:headlist){
		    	   
		        	//ws.setColumnWidth(k++, 8000);
		    	  // row.setRowStyle(topstyle);
		        	cell = row.createCell(k++);
		        	if(map.get("comments")!=null){
		        	String comments=(String) map.get("comments");
		        	cell.setCellValue(comments);
		        	if ("工程名称".equals(comments)) {
		        		sheet.addMergedRegion(new CellRangeAddress(1, 1, k-1, k+3));
		        		cell.setCellStyle(topstyle);
		        		List<Map<String,Object>> topm=(List<Map<String,Object>>)map.get("top");
		        		XSSFRow row1 = sheet.createRow(2);
					       for (int i = 0; i < 53; i++) {
					    	   cell = row1.createCell(i);
					    	   cell.setCellStyle(style);
						}
		        		//row1.setRowStyle(style);
		        		for (Map<String, Object> map2 : topm) {
		        			 cell= row1.createCell(k-1);
		        			k++;
		        			String comments1=(String) map2.get("comments");
		        			
		        			cell.setCellValue(comments1);
		        			cell.setCellStyle(topstyle);
						}k--;
					}else {
						cell.setCellStyle(topstyle);
						sheet.addMergedRegion(new CellRangeAddress(1, 2, k-1, k-1));
					}
		        	}
			        
		        }
		      
		       //row=sheet.createRow(3);
		       int jk=0;
		     
		       for(Map<String,Object> map:headlist){
		    	   
		        	//ws.setColumnWidth(k++, 8000);
		        	//cell = row.createCell(jk++);
		        	if(map.get("comments")!=null){
		        		if (map.get("top") instanceof List){
		        			List<Map<String,Object>> topm=(List<Map<String,Object>>)map.get("top");
		        			for (Map<String, Object> map2 : topm) {
		        				String top=(String) map2.get("top");
		        				//把所有的TOP值保存起来
		        				Map<String,Object> topp=new HashMap<String,Object>();
		        				topp.put("top", top);
		        				toplist.add(topp);
		        				
//		        				cell.setCellValue(top);
//		        				cell.setCellStyle(topstyle);
//		        				cell = row.createCell(jk++);
							}jk--;
						}else {
							String top=(String) map.get("top");
							//把所有的TOP值保存起来
							Map<String,Object> topp=new HashMap<String,Object>();
	        				topp.put("top", top);
	        				toplist.add(topp);
	        				
//							cell.setCellValue(top);
//							cell.setCellStyle(topstyle);
						}
		        	}
			        
		        }
		       for(Map<String,Object> map:toplist){
		        	//int len=map.get("comments").toString().getBytes().length*256>map.get("top").toString().getBytes().length*256?map.get("comments").toString().getBytes().length*256:map.get("top").toString().getBytes().length*256;
		        	sheet.setColumnWidth(jj++, 7000);
		        }
		        if(bodylist.size()>0){
		        	int i=3;
		        	for(Map<String,Object> map:bodylist){
		        		row = sheet.createRow(i++); 
		        		int j=0;
		        		for(Map<String,Object> headmap:toplist){
		        			cell = row.createCell(j++);
		        			if( map.get(headmap.get("top"))!=null){
		        				Object obj=map.get(headmap.get("top"));
//		        				boolean re=obj instanceof String[];//如果数据是数组就建立下拉框
//		        				if(re){
//		        					 String[] os;
//		        					if (obj.getClass().isArray()) {
//		        					    int length = Array.getLength(obj);
//		        					     os = new String[length];
//		        					    for (int ii = 0; ii < os.length; ii++) {
//		        					        os[ii] = (String)Array.get(obj, ii);
//		        					    }
//		        					    cell.setCellValue(os[0]);//这是实验  
//		        					  
//		        					   //生成下拉列表  
//		        					  
//		        					   //只对（0，0）单元格有效  
//		        					  
//		        					    CellRangeAddressList regions = new CellRangeAddressList(i-1,i-1,j-1,j-1);  
//		        					  
//		        					    //生成下拉框内容  
//		        					    XSSFDataValidationHelper dvHelper = new XSSFDataValidationHelper(sheet);
//		        					    XSSFDataValidationConstraint constraint = (XSSFDataValidationConstraint)dvHelper.createExplicitListConstraint(os);  
//		        					  
//		        					    //绑定下拉框和作用区域  
//		        					  
//		        					    XSSFDataValidation data_validation = (XSSFDataValidation) dvHelper.createValidation(constraint, regions);  
//		        					  
//		        					    //对sheet页生效  
//		        					  
//		        					    sheet.addValidationData(data_validation);  
//		        					  
//		        				}}else {
		        					cell.setCellValue(obj.toString());
//								}
		                	}
		        	        cell.setCellStyle(style);
		        	        
		                 }
		        		} 
		        	}
		  }
		  
		  //写入文件  

		    FileOutputStream fileOut;  
		  
		    try {  
		  
		    fileOut = new FileOutputStream("E:\\workbook110.xlsx");  
		  
		    wb.write(fileOut);  
		  
		    fileOut.close();  
		  
		    } catch (Exception e) {  
		  
		    // TODO Auto-generated catch block  
		 
		    e.printStackTrace();  
		  
		    }
	}
	/**
	 * 35扩建表
	 * @param name    表名  
	 * @param headlist  表头  comments=中文注释   top=英文字段命
	 * @param bodylist   表内容  若有下拉框这数据用String[]的形式
	 */
	public static void daochu35(String name ,List<Map<String,Object>> headlist,List<Map<String,Object>> bodylist){
		  XSSFWorkbook wb = new XSSFWorkbook();  
		  XSSFSheet sheet = wb.createSheet("new sheet");  
		  
		  XSSFRow row = sheet.createRow(0);
		  row.setHeightInPoints(40); //设置行高
		  if(headlist.size()>0){
			  XSSFCell cell= row.createCell(0);
			  XSSFCellStyle style = wb.createCellStyle();  //body样式
			  XSSFCellStyle topstyle = wb.createCellStyle();  //表头样式
			  XSSFCellStyle tople = wb.createCellStyle();  //表名样式
			  
			  //设置颜色
			  Color colort=new Color(204,255,204);
			  XSSFColor xssfcolort =new XSSFColor(colort);
			  tople.setAlignment(XSSFCellStyle.ALIGN_CENTER);
			  tople.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);
			  tople.setFillForegroundColor(xssfcolort);
			  tople.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
			  // 设置字体
		        XSSFFont fontt = wb.createFont();
		        //设置字体大小
		        fontt.setFontHeightInPoints((short)17);
		        //字体加粗
		        fontt.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
		        //设置字体名字
		        fontt.setFontName("宋体");
		        //设置字体颜色
		        //fontt.setColor(HSSFColor.WHITE.index);
		        
		        tople.setFont(fontt);
			  
			  
			  style.setAlignment(XSSFCellStyle.ALIGN_CENTER);
			  style.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
			  style.setBorderBottom(XSSFCellStyle.BORDER_THIN);
			  style.setBorderLeft(XSSFCellStyle.BORDER_THIN);
			  style.setBorderRight(XSSFCellStyle.BORDER_THIN);
			  style.setBorderTop(XSSFCellStyle.BORDER_THIN);// 创建一个居中格式

			  //设置颜色
			  Color color=new Color(51,153,102);
			  XSSFColor xssfcolor =new XSSFColor(color);
			  topstyle.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);
			  topstyle.setFillForegroundColor(xssfcolor);
			  // 设置字体
		        XSSFFont font = wb.createFont();
		        //设置字体大小
		        font.setFontHeightInPoints((short)10);
		        //字体加粗
		       // font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
		        //设置字体名字
		        font.setFontName("宋体");
		        //设置字体颜色
		        font.setColor(HSSFColor.WHITE.index);
		        
		        topstyle.setFont(font);
		        
			  topstyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
			  topstyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
			  topstyle.setBorderBottom(XSSFCellStyle.BORDER_THIN);
			  topstyle.setBorderLeft(XSSFCellStyle.BORDER_THIN);
			  topstyle.setBorderRight(XSSFCellStyle.BORDER_THIN);
			  topstyle.setBorderTop(XSSFCellStyle.BORDER_THIN);// 创建一个居中格式
			  
				 cell.setCellValue(name);//表名
				 cell.setCellStyle(tople);
				 sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, headlist.size()-1));
				  row=sheet.createRow(1);
				  row.setHeightInPoints(17); //设置行高
		        int k=0;
		        int jj=0;
		        for(Map<String,Object> map:headlist){
		        	int len=map.get("comments").toString().getBytes().length*256>map.get("top").toString().getBytes().length*256?map.get("comments").toString().getBytes().length*256:map.get("top").toString().getBytes().length*256;
		        	sheet.setColumnWidth(jj++, len+1000);
		        }
		       for(Map<String,Object> map:headlist){
		    	   
		        	//ws.setColumnWidth(k++, 8000);
		        	cell = row.createCell(k++);
		        	if(map.get("comments")!=null){
		        	String comments=(String) map.get("comments");
			        cell.setCellValue(comments);
		        	}
			        cell.setCellStyle(topstyle);
			        
		        }
		      // row=sheet.createRow(1);
		      // int jk=0;
		      // for(Map<String,Object> map:headlist){
		    	   
		        	//ws.setColumnWidth(k++, 8000);
		        	//cell = row.createCell(jk++);
//		        	if(map.get("comments")!=null){
//		        	String top=(String) map.get("top");
//			        cell.setCellValue(top);
//		        	}
//			        cell.setCellStyle(topstyle);
			        
		      //  }
		        if(bodylist.size()>0){
		        	int i=2;
		        	for(Map<String,Object> map:bodylist){
		        		row = sheet.createRow(i++); 
		        		int j=0;
		        		for(Map<String,Object> headmap:headlist){
		        			cell = row.createCell(j++);
		        			if( map.get(headmap.get("top"))!=null){
		        				Object obj=map.get(headmap.get("top"));
//		        				boolean re=obj instanceof String[];//如果数据是数组就生成下拉框
//		        				if(re){
//		        					 String[] os;
//		        					if (obj.getClass().isArray()) {
//		        					    int length = Array.getLength(obj);
//		        					     os = new String[length];
//		        					    for (int ii = 0; ii < os.length; ii++) {
//		        					        os[ii] = (String)Array.get(obj, ii);
//		        					    }
//		        					    cell.setCellValue(os[0]);//这是实验  
//		        					  
//		        					   //生成下拉列表  
//		        					  
//		        					   //只对（0，0）单元格有效  
//		        					  
//		        					    CellRangeAddressList regions = new CellRangeAddressList(i-1,i-1,j-1,j-1);  
//		        					  
//		        					    //生成下拉框内容  
//		        					    XSSFDataValidationHelper dvHelper = new XSSFDataValidationHelper(sheet);
//		        					    XSSFDataValidationConstraint constraint = (XSSFDataValidationConstraint)dvHelper.createExplicitListConstraint(os);  
//		        					  
//		        					    //绑定下拉框和作用区域  
//		        					  
//		        					    XSSFDataValidation data_validation = (XSSFDataValidation) dvHelper.createValidation(constraint, regions);  
//		        					  
//		        					    //对sheet页生效  
//		        					  
//		        					    sheet.addValidationData(data_validation);  
//		        					  
//		        				}}else {
		        					cell.setCellValue(obj.toString());
//								}
		                	}
		        	        cell.setCellStyle(style);
		        	        
		                 }
		        		} 
		        	}
		  }
		  
		  //写入文件  

		    FileOutputStream fileOut;  
		  
		    try {  
		  
		    fileOut = new FileOutputStream("E:\\workbook35.xlsx");  
		  
		    wb.write(fileOut);  
		  
		    fileOut.close();  
		  
		    } catch (Exception e) {  
		  
		    // TODO Auto-generated catch block  
		 
		    e.printStackTrace();  
		  
		    }
	}
	
	public static void daochubdz(String name ,List<Map<String,Object>> headlist,List<Map<String,Object>> bodylist){
		  XSSFWorkbook wb = new XSSFWorkbook();  
		  XSSFSheet sheet = wb.createSheet("new sheet");  
//		  sheet.setColumnWidth(0, 5000);
//		  sheet.setColumnWidth(1, 5000);
//		  sheet.setColumnWidth(2, 5000);
//		  sheet.setColumnWidth(7, 5000);
//		  sheet.setColumnWidth(8, 5000);
		  XSSFRow row = sheet.createRow(0);
		  row.setHeightInPoints(35); //设置行高
		  if(headlist.size()>0){
			  XSSFCell cell= row.createCell(0);
			  XSSFCellStyle style = wb.createCellStyle();  
			  XSSFCellStyle topstyle = wb.createCellStyle();  
			  
			  XSSFCellStyle tople = wb.createCellStyle();  //表名样式
			  
			  //设置颜色
			  Color colort=new Color(204,255,204);
			  XSSFColor xssfcolort =new XSSFColor(colort);
			  tople.setAlignment(XSSFCellStyle.ALIGN_CENTER);
			  tople.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);
			  tople.setFillForegroundColor(xssfcolort);
			  tople.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
			  // 设置字体
		        XSSFFont fontt = wb.createFont();
		        //设置字体大小
		        fontt.setFontHeightInPoints((short)17);
		        //字体加粗
		        fontt.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
		        //设置字体名字
		        fontt.setFontName("宋体");
		        //设置字体颜色
		        //fontt.setColor(HSSFColor.WHITE.index);
		        
		        tople.setFont(fontt);
		        
			  style.setAlignment(XSSFCellStyle.ALIGN_CENTER);
			  style.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
			  style.setBorderBottom(XSSFCellStyle.BORDER_THIN);
			  style.setBorderLeft(XSSFCellStyle.BORDER_THIN);
			  style.setBorderRight(XSSFCellStyle.BORDER_THIN);
			  style.setBorderTop(XSSFCellStyle.BORDER_THIN);// 创建一个居中格式

			  //设置颜色
			  Color color=new Color(51,153,102);
			  XSSFColor xssfcolor =new XSSFColor(color);
			  topstyle.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);
			  topstyle.setFillForegroundColor(xssfcolor);
			  // 设置字体
		        XSSFFont font = wb.createFont();
		        //设置字体大小
		        font.setFontHeightInPoints((short)10);
		        //字体加粗
		       // font.setBoldweight(XSSFFont.BOLDWEIGHT_BOLD);
		        //设置字体名字
		        font.setFontName("宋体");
		        //设置字体颜色
		        font.setColor(HSSFColor.WHITE.index);
		        
		        topstyle.setFont(font);
			  
			  topstyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
			  topstyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
			  topstyle.setBorderBottom(XSSFCellStyle.BORDER_THIN);
			  topstyle.setBorderLeft(XSSFCellStyle.BORDER_THIN);
			  topstyle.setBorderRight(XSSFCellStyle.BORDER_THIN);
			  topstyle.setBorderTop(XSSFCellStyle.BORDER_THIN);// 创建一个居中格式
			  
				 cell.setCellValue(name);//表名
				 cell.setCellStyle(tople);
				 sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, headlist.size()+3));
				
		        row=sheet.createRow(1);
		        int k=0;
		        int jj=0;
//		        for(Map<String,Object> map:headlist){
//		        	int len=map.get("comments").toString().getBytes().length*256>map.get("top").toString().getBytes().length*256?map.get("comments").toString().getBytes().length*256:map.get("top").toString().getBytes().length*256;
//		        	sheet.setColumnWidth(jj++, len+1000);
//		        }
		        List<Map<String,Object>> toplist=new ArrayList<Map<String,Object>>();
		       for(Map<String,Object> map:headlist){
		    	   
		        	//ws.setColumnWidth(k++, 8000);
		    	  // row.setRowStyle(topstyle);
		        	cell = row.createCell(k++);
		        	if(map.get("comments")!=null){
		        	String comments=(String) map.get("comments");
		        	cell.setCellValue(comments);
		        	if ("全年最大负荷".equals(comments)||"2016年全年最大负荷时刻负荷".equals(comments)||
		        			"10（20）出线间隔情况（个）".equals(comments)||"无功补偿配置".equals(comments)) {
		        		sheet.addMergedRegion(new CellRangeAddress(1, 1, k-1, k+3));
		        		cell.setCellStyle(topstyle);
		        		List<Map<String,Object>> topm=(List<Map<String,Object>>)map.get("top");
		        		XSSFRow row1 = sheet.createRow(1);
					       for (int i = 0; i < 53; i++) {
					    	   cell = row1.createCell(i);
					    	   cell.setCellStyle(style);
						}
		        		//row1.setRowStyle(style);
		        		for (Map<String, Object> map2 : topm) {
		        			 cell= row1.createCell(k-1);
		        			k++;
		        			String comments1=(String) map2.get("comments");
		        			
		        			cell.setCellValue(comments1);
		        			cell.setCellStyle(topstyle);
						}k--;
					}else {
						cell.setCellStyle(topstyle);
						sheet.addMergedRegion(new CellRangeAddress(1, 2, k-1, k-1));
					}
		        	}
			        
		        }
		      
		     //  row=sheet.createRow(2);
		       int jk=0;
		     
		       for(Map<String,Object> map:headlist){
		    	   
		        	//ws.setColumnWidth(k++, 8000);
		        	//cell = row.createCell(jk++);
		        	if(map.get("comments")!=null){
		        		if (map.get("top") instanceof List){
		        			List<Map<String,Object>> topm=(List<Map<String,Object>>)map.get("top");
		        			for (Map<String, Object> map2 : topm) {
		        				String top=(String) map2.get("top");
		        				//把所有的TOP值保存起来
		        				Map<String,Object> topp=new HashMap<String,Object>();
		        				topp.put("top", top);
		        				toplist.add(topp);
							}jk--;
						}else {
							String top=(String) map.get("top");
							//把所有的TOP值保存起来
							Map<String,Object> topp=new HashMap<String,Object>();
	        				topp.put("top", top);
	        				toplist.add(topp);
						}
		        	}
			        
		        }
		       for(Map<String,Object> map:toplist){
		        	//int len=map.get("comments").toString().getBytes().length*256>map.get("top").toString().getBytes().length*256?map.get("comments").toString().getBytes().length*256:map.get("top").toString().getBytes().length*256;
		        	sheet.setColumnWidth(jj++, 7000);
		        }
		        if(bodylist.size()>0){
		        	int i=3;
		        	for(Map<String,Object> map:bodylist){
		        		row = sheet.createRow(i++); 
		        		int j=0;
		        		for(Map<String,Object> headmap:toplist){
		        			cell = row.createCell(j++);
		        			if( map.get(headmap.get("top"))!=null){
		        				Object obj=map.get(headmap.get("top"));
		        				boolean re=obj instanceof String[];
		        				
		        					cell.setCellValue(obj.toString());
		                	}
		        	        cell.setCellStyle(style);
		        	        
		                 }
		        		} 
		        	}
		  }
		  
		  //写入文件  

		    FileOutputStream fileOut;  
		  
		    try {  
		  
		    fileOut = new FileOutputStream("E:\\workbook110.xlsx");  
		  
		    wb.write(fileOut);  
		  
		    fileOut.close();  
		  
		    } catch (Exception e) {  
		  
		    // TODO Auto-generated catch block  
		 
		    e.printStackTrace();  
		  
		    }
	}
	
	
}
