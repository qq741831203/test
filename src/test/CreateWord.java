package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dw.dao.bgbz.BGBZ_BDZ;
import com.dw.dao.bgbz.BGBZ_DWJG;
import com.dw.dao.bgbz.BGBZ_JJSH;
import com.dw.dao.bgbz.BGBZ_XL;
import com.dw.dao.bgbz.BGBZ_ZYSB;
import com.xy.pdgh.dto.Been;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class CreateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Object> dataMap = new HashMap<String,Object>();
		//封面
		dataMap.put("year", new Date().getYear()+1900);//封面年份
		//2.1
		List<BGBZ_JJSH> jjshlist =new ArrayList<BGBZ_JJSH>();//数据库所有year_1年的经济社会发展数据(只有一条)
		if (jjshlist.size()!=0) {
			dataMap.put("jjsh", jjshlist.get(0));
		}
		//2.2
		dataMap.put("year_1", new Date().getYear()+1900-1);//报告年份
		//3.3   110Kv  电网变电站
		List<BGBZ_BDZ> bdzlist=new ArrayList<BGBZ_BDZ>();//数据库所有year_1年的电网变电站数据
		for (BGBZ_BDZ bgbz_BDZ : bdzlist) {
			if ("合计".equals(bgbz_BDZ.getLx()) && "110".equals(bgbz_BDZ.getDydj())) {
				dataMap.put("bdzts110", bgbz_BDZ.getBdzzsgy());
				dataMap.put("zbts110", bgbz_BDZ.getZbtsgy());
				dataMap.put("bdrl110", bgbz_BDZ.getBdrlgy());
			}
			if ("合计".equals(bgbz_BDZ.getLx()) && "35".equals(bgbz_BDZ.getDydj())) {
				dataMap.put("bdzts35", bgbz_BDZ.getBdzzsgy());
				dataMap.put("zbts35", bgbz_BDZ.getZbtsgy());
				dataMap.put("bdrl35", bgbz_BDZ.getBdrlgy());
				dataMap.put("zybdzts35", bgbz_BDZ.getBdzzszy());
				dataMap.put("zyzbts35", bgbz_BDZ.getZbtszy());
				dataMap.put("zybdrl35", bgbz_BDZ.getBdrlzy());
			}
		}
		dataMap.put("bdzs", bdzlist);
		//线路情况
		List<BGBZ_XL> xllist =new ArrayList<BGBZ_XL>();//数据库所有year_1年的线路情况数据
		for (BGBZ_XL bgbz_XL : xllist) {
			if ("合计".equals(bgbz_XL.getLx()) && "110".equals(bgbz_XL.getDydj())) {
				dataMap.put("xlzts110", bgbz_XL.getXlzts());
				dataMap.put("xlzcd110", bgbz_XL.getXlzcd());
				dataMap.put("jkxlcd110", bgbz_XL.getJkxlcd());
				dataMap.put("dlxlcd110", bgbz_XL.getDlxlcd());
			}
			if ("合计".equals(bgbz_XL.getLx()) && "35".equals(bgbz_XL.getDydj())) {
				dataMap.put("xlzts35", bgbz_XL.getXlzts());
				dataMap.put("xlzcd35", bgbz_XL.getXlzcd());
				dataMap.put("jkxlcd35", bgbz_XL.getJkxlcd());
				dataMap.put("dlxlcd35", bgbz_XL.getDlxlcd());
				dataMap.put("dlhl35", bgbz_XL.getDlhl());
			}
		}
		dataMap.put("xls", xllist);
		//电网结构
		List<BGBZ_DWJG> dwjglist=new ArrayList<BGBZ_DWJG>();//数据库所有year_1年的电网结构数据
		dataMap.put("dwjgs", dwjglist);
		//主要设备运行年限
		List<BGBZ_ZYSB> zysblist=new ArrayList<BGBZ_ZYSB>();//数据库所有year_1年的主要设备运行年限数据
		dataMap.put("zysbs", zysblist);
		
		System.out.println(dataMap);
		
		
		
		
		
	}
	public static void word() throws IOException, TemplateException {
		Map<String,Object> dataMap = new HashMap<String,Object>();
//		dataMap.put("name", "Tom1");
//		dataMap.put("age", "201");
//		dataMap.put("province", "江苏2");
//		dataMap.put("path", "江苏3");
		Been been=new Been();
		been.setBddlq("1");
		been.setBdzbsl("1");
		been.setDydj("110");
		been.setHb("1");
		been.setLx("市辖供电区");
		been.setNx("0-5年");
		been.setXldlcd("1");
		been.setXljkcd("1");
		Been been2=new Been();
		been2.setBddlq("2");
		been2.setBdzbsl("2");
		been2.setDydj("110");
		been2.setHb("2");
		been2.setLx("市辖供电区");
		been2.setNx("6-10年");
		been2.setXldlcd("2");
		been2.setXljkcd("2");
		Been been3=new Been();
		been3.setBddlq("3");
		been3.setBdzbsl("3");
		been3.setDydj("110");
		been3.setHb("3");
		been3.setLx("市辖供电区");
		been3.setNx("11-20年");
		been3.setXldlcd("3");
		been3.setXljkcd("3");
		Been been4=new Been();
		been4.setBddlq("4");
		been4.setBdzbsl("4");
		been4.setDydj("110");
		been4.setHb("4");
		been4.setLx("市辖供电区");
		been4.setNx("21-30年");
		been4.setXldlcd("4");
		been4.setXljkcd("4");
		Been been5=new Been();
		been5.setBddlq("5");
		been5.setBdzbsl("5");
		been5.setDydj("110");
		been5.setHb("5");
		been5.setLx("市辖供电区");
		been5.setNx("30年以上");
		been5.setXldlcd("5");
		been5.setXljkcd("5");
		
		List<Been> list=new ArrayList<Been>();
		list.add(been);
		list.add(been2);
		list.add(been3);
		list.add(been4);
		list.add(been5);
		
		dataMap.put("list", list);  
		Configuration configuration = new Configuration();
		configuration.setDefaultEncoding("utf-8");
		configuration.setDirectoryForTemplateLoading(new File("mb"));
		// 输出文档路径及名称
		File outFile = new File("mb\\test-22.doc");
		//以utf-8的编码读取ftl文件
		Template t =  configuration.getTemplate("muban.xml","utf-8");
		Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile), "utf-8"),10240);
		t.process(dataMap, out);
		out.close();
	}
	
}
