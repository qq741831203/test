package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.xy.pdgh.dto.GC_BDZGZGC_110;
import com.xy.pdgh.dto.GC_BDZGZGC_35;
import com.xy.pdgh.dto.GC_XKJGC_110;
import com.xy.pdgh.dto.GC_XKJGC_35;
import com.xy.pdgh.dto.GC_XLGZGC_110;
import com.xy.pdgh.dto.GC_XLGZGC_35;

public class TableTop {
	/**
	 * 35新扩建  参数 List<GC_XKJGC_35>
	 * @param list
	 */
	public static void table35xkj(List<GC_XKJGC_35> list){
		String name  ="35新扩建";
		List<Map<String,Object>> headlist=new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> bodylist=new ArrayList<Map<String,Object>>();
		String[] arr1={"行政区划","供电区域分类","所属企业","工程名称","项目编码","电压等级(千伏)","建设类型","变电站类型","配电装置型式","变电站占地面积(平方米)","变电台数(台)","新增容量(兆伏安)","无功补偿容性容量(兆乏)","无功补偿感性容量(兆乏)","变电投资(万元)","新建、扩建10千伏间隔(个)","线路条数(条)","线路总长度(千米)","电缆线路长度(千米)","电缆型号","架空线路长度(千米)","架空线型号","线路投资(万元)","总投资(万元)","中央计划（%）","公司自筹（%）","县级供电企业自筹（%）","用户投资（%）","其他（%）","资产属性","规划投产时间(年)","满足新增负荷供电要求-重要性","变电站配套送出-重要性","解决设备重载、过载-重要性","消除设备安全隐患-重要性","加强网架结构-重要性","电源接入-重要性","无电地区供电-重要性","加强与主网联系-重要性","孤网运行县域电网联网-重要性","其他-重要性","电源送出类别","是否农网项目 ","农网建设性质1","农网建设性质2","农网建设性质3","项目阶段","是否业扩项目","业扩申请编号","业扩性质"};
		String[] arr2={"AREA_ID","GDQYFL","ORG_ID","GCMC","XMBM","DYDJ","JSLX","BDZZX","PDZZXS","XZBDZZDMJ","XZZBTS","XZZBRL","WGBCRXRL","WGBCGXRL","BDTZ","XKJJG10","XLTS","XLZCD","DLCD","DLXH","JKCD","JKXXH","XLTZ","GCZTZ","ZYJH","GSZC","QYZC","YH","QT","ZCSX","YEAR","GCSX_ZYX_FH","GCSX_ZYX_BDZ","GCSX_ZYX_SB","GCSX_ZYX_AQ","GCSX_ZYX_WJ","GCSX_ZYX_DY","GCSX_ZYX_WD","GCSX_ZYX_ZW","GCSX_ZYX_XY","GCSX_ZYX_QT","DYSCLB","SFNWXM","NWJSXZ4","NWJSXZ5","NWJSXZ6","XMJD","BUSINESS_TYPE","APP_NO","BUSINESS_CODE"};
		for (int i=0;i<arr1.length;i++) {
			Map<String,Object> headmap=new HashMap<String,Object>();
			headmap.put("comments", arr1[i]);
			headmap.put("top", arr2[i]);
			headlist.add(headmap);
		}
		for (GC_XKJGC_35 entity : list) {
			Map<String,Object> bodymap=new HashMap<String,Object>();
			bodymap.put("AREA_ID", entity.getXzqh());
			bodymap.put("GDQYFL", entity.getGdqufl());
			bodymap.put("ORG_ID", entity.getSsqy());
			bodymap.put("GCMC", entity.getGcmc());
			bodymap.put("XMBM", entity.getXmbm());
			bodymap.put("DYDJ", entity.getDydj());
			bodymap.put("JSLX", entity.getJslx());
			bodymap.put("BDZZX", entity.getBdzlx());
			bodymap.put("PDZZXS", entity.getPdzzxs());
			bodymap.put("XZBDZZDMJ", entity.getBdzzdmj());
			bodymap.put("XZZBTS", entity.getBdts());
			bodymap.put("XZZBRL", entity.getXzrl());
			bodymap.put("WGBCRXRL", entity.getWgbcrxrl());
			bodymap.put("WGBCGXRL", entity.getWgbcgxrl());
			bodymap.put("BDTZ", entity.getBdtz());
			bodymap.put("XKJJG10", entity.getXjkj10qfjg());
			bodymap.put("XLTS", entity.getXlts());
			bodymap.put("XLZCD", entity.getXlzcd());
			bodymap.put("DLCD", entity.getDlxlcd());			
			bodymap.put("DLXH", entity.getDlxh());			
			bodymap.put("JKCD", entity.getJkxlcd());			
			bodymap.put("JKXXH", entity.getJkxxh());			
			bodymap.put("XLTZ", entity.getXltz());			
			bodymap.put("GCZTZ", entity.getZtz());			
			bodymap.put("ZYJH", entity.getZyjh());			
			bodymap.put("GSZC", entity.getGszc());			
			bodymap.put("QYZC", entity.getXjgdqyzc());			
			bodymap.put("YH", entity.getYhtz());			
			bodymap.put("QT", entity.getQt());			
			bodymap.put("ZCSX", entity.getZcsx());			
			bodymap.put("YEAR", entity.getGhtcsj());			
			bodymap.put("GCSX_ZYX_FH", entity.getMzxzfhgdyqzyx());			
			bodymap.put("GCSX_ZYX_BDZ", entity.getBdzptsczyx());			
			bodymap.put("GCSX_ZYX_SB", entity.getJjsbczgzzyx());			
			bodymap.put("GCSX_ZYX_AQ", entity.getXcsbaqyhzyx());			
			bodymap.put("GCSX_ZYX_WJ", entity.getJqwjjgzyx());			
			bodymap.put("GCSX_ZYX_DY", entity.getDyjrzyx());			
			bodymap.put("GCSX_ZYX_WD", entity.getWddqgdzyx());			
			bodymap.put("GCSX_ZYX_ZW", entity.getJqyzwlxzyx());			
			bodymap.put("GCSX_ZYX_XY", entity.getGwyxxydwlwzyx());			
			bodymap.put("GCSX_ZYX_QT", entity.getQtzyx());			
			bodymap.put("DYSCLB", entity.getDysclb());			
			bodymap.put("SFNWXM", entity.getSfnwxm());			
			bodymap.put("NWJSXZ4", entity.getNwjsxz1());			
			bodymap.put("NWJSXZ5", entity.getNwjsxz2());			
			bodymap.put("NWJSXZ6", entity.getNwjsxz3());			
			bodymap.put("XMJD", entity.getXmjd());			
			bodymap.put("BUSINESS_TYPE", entity.getSfykxm());			
			bodymap.put("APP_NO", entity.getYksqbh());			
			bodymap.put("BUSINESS_CODE", entity.getYkxz());			
			
			bodylist.add(bodymap);
		}
		Test35kuojian.daochu35(name, headlist, bodylist);
	}

	/**
	 * 35线路改造   参数 List<GC_XLGZGC_35>
	 * @param list
	 */
	public static void table35xlgz(List<GC_XLGZGC_35> list){
		String name  ="35线路改造";
		List<Map<String,Object>> headlist=new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> bodylist=new ArrayList<Map<String,Object>>();
		String[] arr1={"行政区划","供电区域分类","所属企业","工程名称","项目编码","电压等级(千伏)","架空线路长度(千米)","其中:耐热导线(千米)","架空线路投资(万元)","电缆线路长度(千米)","沟道长度(千米)","电缆投资(万元)","其它项","其它项投资(万元)","总投资(万元)","中央计划（%）","公司自筹（%）","县级供电企业自筹（%）","用户投资（%）","其他（%）","资产属性","改造完成时间(年)","满足新增负荷供电要求-重要性","变电站配套送出-重要性","解决设备重载、过载-重要性","消除设备安全隐患-重要性","加强网架结构-重要性","电源接入-重要性","无电地区供电-重要性","加强与主网联系-重要性","孤网运行县域电网联网-重要性","其他-重要性","电源送出类别","是否农网项目","农网建设性质1","农网建设性质2","农网建设性质3","项目阶段","是否业扩项目","业扩申请编号","业扩性质"};
		String[] arr2={"AREA_ID","GDQYFL","ORG_ID","GCMC","XMBM","DYDJ","DXCD","QZFRDX","JKXLTZ","DLCD","GDCD","DLTZ","QTX","QTXTZ","ZTZ","ZYJH","GSZC","QYZC","YH","QT","ZCSX","YEAR","GCSX_ZYX_FH","GCSX_ZYX_BDZ","GCSX_ZYX_SB","GCSX_ZYX_AQ","GCSX_ZYX_WJ","GCSX_ZYX_DY","GCSX_ZYX_WD","GCSX_ZYX_ZW","GCSX_ZYX_XY","GCSX_ZYX_QT","DYSCLB","SFNWXM","NWJSXZ4","NWJSXZ5","NWJSXZ6","XMJD","BUSINESS_TYPE","APP_NO","BUSINESS_CODE"};
		for (int i=0;i<arr1.length;i++) {
			Map<String,Object> headmap=new HashMap<String,Object>();
			headmap.put("comments", arr1[i]);
			headmap.put("top", arr2[i]);
			headlist.add(headmap);
		}
		for (GC_XLGZGC_35 entity : list) {
			Map<String,Object> bodymap=new HashMap<String,Object>();
			bodymap.put("AREA_ID", entity.getXzqh());
			bodymap.put("GDQYFL", entity.getGdqufl());
			bodymap.put("ORG_ID", entity.getSsqy());
			bodymap.put("GCMC", entity.getGcmc());
			bodymap.put("DXCD", entity.getJkxlcd());
			bodymap.put("QZFRDX", entity.getQznrdx());
			bodymap.put("DYDJ", entity.getDydj());
			bodymap.put("XMBM", entity.getXmbm());
			bodymap.put("DLCD", entity.getDlxlcd());
			bodymap.put("ZTZ", entity.getZtz());
			bodymap.put("ZYJH", entity.getZyjh());
			bodymap.put("GSZC", entity.getGszc());
			bodymap.put("QYZC", entity.getXjgdqyzc());
			bodymap.put("YH", entity.getYhtz());
			bodymap.put("QT", entity.getQt());
			bodymap.put("ZCSX", entity.getZcsx());
			bodymap.put("GCSX_ZYX_FH", entity.getMzxzfhgdyqzyx());
			bodymap.put("GCSX_ZYX_BDZ", entity.getBdzptsczyx());			
			bodymap.put("GCSX_ZYX_SB", entity.getJjsbczgzzyx());			
			bodymap.put("GCSX_ZYX_AQ", entity.getXcsbaqyhzyx());			
			bodymap.put("GCSX_ZYX_WJ", entity.getJqwjjgzyx());			
			bodymap.put("GCSX_ZYX_DY", entity.getDyjrzyx());			
			bodymap.put("GCSX_ZYX_WD", entity.getWddqgdzyx());			
			bodymap.put("GCSX_ZYX_ZW", entity.getJqyzwlxzyx());			
			bodymap.put("GCSX_ZYX_XY", entity.getGwyxxydwlwzyx());			
			bodymap.put("GCSX_ZYX_QT", entity.getQtzyx());			
			bodymap.put("DYSCLB", entity.getDysclb());			
			bodymap.put("SFNWXM", entity.getSfnwxm());			
			bodymap.put("NWJSXZ4", entity.getNwjsxz1());			
			bodymap.put("NWJSXZ5", entity.getNwjsxz2());			
			bodymap.put("NWJSXZ6", entity.getNwjsxz3());			
			bodymap.put("XMJD", entity.getXmjd());			
			bodymap.put("BUSINESS_TYPE", entity.getSfykxm());			
			bodymap.put("APP_NO", entity.getYksqbh());			
			bodymap.put("BUSINESS_CODE", entity.getYkxz());		
			bodymap.put("JKXLTZ", entity.getJkxltz());		
			bodymap.put("GDCD", entity.getGdcd());		
			bodymap.put("DLTZ", entity.getDltz());		
			bodymap.put("QTX", entity.getQtx());		
			bodymap.put("QTXTZ", entity.getQtxtz());		
			bodymap.put("YEAR", entity.getGzwcsj());			
			
			bodylist.add(bodymap);
		}
		Test35kuojian.daochu35(name, headlist, bodylist);
	}

	
	/**
	 * 35变电站改造   参数 List<GC_BDZGZGC_35>
	 * @param list
	 */
	public static void table35bdzgz(List<GC_BDZGZGC_35> list){
		String name  ="35变电站改造";
		List<Map<String,Object>> headlist=new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> bodylist=new ArrayList<Map<String,Object>>();
		String[] arr1={"行政区划","供电区域分类","所属企业","工程名称","项目编码","电压等级(千伏)","架空线路长度(千米)","其中:耐热导线(千米)","架空线路投资(万元)","电缆线路长度(千米)","沟道长度(千米)","电缆投资(万元)","其它项","其它项投资(万元)","总投资(万元)","中央计划（%）","公司自筹（%）","县级供电企业自筹（%）","用户投资（%）","其他（%）","资产属性","改造完成时间(年)","满足新增负荷供电要求-重要性","变电站配套送出-重要性","解决设备重载、过载-重要性","消除设备安全隐患-重要性","加强网架结构-重要性","电源接入-重要性","无电地区供电-重要性","加强与主网联系-重要性","孤网运行县域电网联网-重要性","其他-重要性","电源送出类别","是否农网项目","农网建设性质1","农网建设性质2","农网建设性质3","项目阶段","是否业扩项目","业扩申请编号","业扩性质"};
		String[] arr2={"AREA_ID","GDQYFL","ORG_ID","GCMC","XMBM","DYDJ","DXCD","QZFRDX","JKXLTZ","DLCD","GDCD","DLTZ","QTX","QTXTZ","ZTZ","ZYJH","GSZC","QYZC","YH","QT","ZCSX","YEAR","GCSX_ZYX_FH","GCSX_ZYX_BDZ","GCSX_ZYX_SB","GCSX_ZYX_AQ","GCSX_ZYX_WJ","GCSX_ZYX_DY","GCSX_ZYX_WD","GCSX_ZYX_ZW","GCSX_ZYX_XY","GCSX_ZYX_QT","DYSCLB","SFNWXM","NWJSXZ4","NWJSXZ5","NWJSXZ6","XMJD","BUSINESS_TYPE","APP_NO","BUSINESS_CODE"};
		for (int i=0;i<arr1.length;i++) {
			Map<String,Object> headmap=new HashMap<String,Object>();
			headmap.put("comments", arr1[i]);
			headmap.put("top", arr2[i]);
			headlist.add(headmap);
		}
		for (GC_BDZGZGC_35 entity : list) {
			Map<String,Object> bodymap=new HashMap<String,Object>();
			bodymap.put("AREA_ID", entity.getXzqh());
			bodymap.put("GDQYFL", entity.getGdqufl());
			bodymap.put("ORG_ID", entity.getSsqy());
			bodymap.put("DYDJ", entity.getDydj());
			bodymap.put("GCMC", entity.getGcmc());
			bodymap.put("XMBM", entity.getXmbm());
			bodymap.put("ZTZ", entity.getZtz());
			bodymap.put("ZYJH", entity.getZyjh());
			bodymap.put("GSZC", entity.getGszc());
			bodymap.put("QYZC", entity.getXjgdqyzc());
			bodymap.put("YH", entity.getYhtz());
			bodymap.put("QT", entity.getQt());
			bodymap.put("ZCSX", entity.getZcsx());
			bodymap.put("GCSX_ZYX_FH", entity.getMzxzfhgdyqzyx());
			bodymap.put("GCSX_ZYX_BDZ", entity.getBdzptsczyx());			
			bodymap.put("GCSX_ZYX_SB", entity.getJjsbczgzzyx());			
			bodymap.put("GCSX_ZYX_AQ", entity.getXcsbaqyhzyx());			
			bodymap.put("GCSX_ZYX_WJ", entity.getJqwjjgzyx());			
			bodymap.put("GCSX_ZYX_DY", entity.getDyjrzyx());			
			bodymap.put("GCSX_ZYX_WD", entity.getWddqgdzyx());			
			bodymap.put("GCSX_ZYX_ZW", entity.getJqyzwlxzyx());			
			bodymap.put("GCSX_ZYX_XY", entity.getGwyxxydwlwzyx());			
			bodymap.put("GCSX_ZYX_QT", entity.getQtzyx());			
			bodymap.put("DYSCLB", entity.getDysclb());			
			bodymap.put("SFNWXM", entity.getSfnwxm());			
			bodymap.put("NWJSXZ4", entity.getNwjsxz1());			
			bodymap.put("NWJSXZ5", entity.getNwjsxz2());			
			bodymap.put("NWJSXZ6", entity.getNwjsxz3());			
			bodymap.put("XMJD", entity.getXmjd());			
			bodymap.put("BUSINESS_TYPE", entity.getSfykxm());			
			bodymap.put("APP_NO", entity.getYksqbh());			
			bodymap.put("BUSINESS_CODE", entity.getYkxz());		
			bodymap.put("QTX", entity.getQtx());		
			bodymap.put("QTXTZ", entity.getQtxtz());		
			bodymap.put("YEAR", entity.getGzwcsj());		
			bodymap.put("GZBYQBH1", entity.getGzbyqbh1());		
			bodymap.put("GZBYQBH2", entity.getGzbyqbh2());		
			bodymap.put("BYQGZTS", entity.getByqgzts());		
			bodymap.put("XZZBLR", entity.getXzzbrl());		
			bodymap.put("GZHZBRL", entity.getGzhzbrl());		
			bodymap.put("DLQ", entity.getDlq());		
			
			
			bodylist.add(bodymap);
		}
		Test35kuojian.daochu35(name, headlist, bodylist);
	}
	
	/**
	 * 110新扩建  参数 List<GC_XKJGC_110>
	 * @param list
	 */
	public static void table110xkj(List<GC_XKJGC_110> list){
		String name  ="110扩建";
		List<Map<String,Object>> headlist=new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> bodylist=new ArrayList<Map<String,Object>>();
		String[] arr11={"行政区划","供电区域分类","所属企业","工程名称","项目编码","建设类型","变电站类型","配电装置型式","变电站占地面积(平方米)","变电台数(台)","新增容量(兆伏安)","无功补偿容性容量(兆乏)","无功补偿感性容量(兆乏)","变电投资(万元)","新建、扩建10千伏间隔(个)","线路条数(条)","线路总长度(千米)","电缆线路长度(千米)","电缆型号","架空线路长度(千米)","架空线型号","线路投资(万元)","总投资(万元)","中央计划（%）","公司自筹（%）","县级供电企业自筹（%）","用户投资（%）","其他（%）","资产属性","规划投产时间(年)","满足新增负荷供电要求-重要性","变电站配套送出-重要性","解决设备重载、过载-重要性","消除设备安全隐患-重要性","加强网架结构-重要性","电源接入-重要性","无电地区供电-重要性","加强与主网联系-重要性","孤网运行县域电网联网-重要性","其他-重要性","电源送出类别","是否农网项目 ","农网建设性质1","农网建设性质2","农网建设性质3","项目阶段","是否业扩项目","业扩申请编号","业扩性质"};
		String[] arrgc={"项目类型","项目所在地","站名/电厂名称/牵引站名","电压等级(kV)","补充描述"};
		String[] arr12={"AREA_ID","GDQYFL","ORG_ID","","XMBM","JSLX","BDZZX","PDZZXS","XZBDZZDMJ","XZZBTS","XZZBRL","WGBCRXRL","WGBCGXRL","BDTZ","XKJJG10","XLTS","XLZCD","DLCD","DLXH","JKCD","JKXXH","XLTZ","GCZTZ","ZYJH","GSZC","QYZC","YH","QT","ZCSX","YEAR","GCSX_ZYX_FH","GCSX_ZYX_BDZ","GCSX_ZYX_SB","GCSX_ZYX_AQ","GCSX_ZYX_WJ","GCSX_ZYX_DY","GCSX_ZYX_WD","GCSX_ZYX_ZW","GCSX_ZYX_XY","GCSX_ZYX_QT","DYSCLB","SFNWXM","NWJSXZ4","NWJSXZ5","NWJSXZ6","XMJD","BUSINESS_TYPE","APP_NO","BUSINESS_CODE"};
		String[] arrcg={"GCMCXMLX","GCMCXMSZD","GCMCZM","DYDJ","GCMCBCMS"};
		
		for (int i=0;i<arr11.length;i++) {
			Map<String,Object> headmap=new HashMap<String,Object>();
			if("工程名称".equals(arr11[i])){
				headmap.put("comments", arr11[i]);
				int j=0;
				List<Map<String,Object>> top1=new ArrayList<Map<String,Object>>();
				for (String string : arrgc) {
					Map<String,Object> headtop=new HashMap<String,Object>();
					headtop.put("comments", string);
					headtop.put("top", arrcg[j]);
					j++;
					top1.add(headtop);
				}
				headmap.put("top", top1);
			}else {
				headmap.put("comments", arr11[i]);
				headmap.put("top", arr12[i]);
			}
			headlist.add(headmap);
		}
		for (GC_XKJGC_110 entity : list) {
			Map<String,Object> bodymap=new HashMap<String,Object>();
			bodymap.put("AREA_ID", entity.getXzqh());
			bodymap.put("GDQYFL", entity.getGdqufl());
			bodymap.put("ORG_ID", entity.getSsqy());
			bodymap.put("GCMCXMLX", entity.getXmlx());
			bodymap.put("GCMCXMSZD", entity.getXmszd());
			bodymap.put("GCMCZM", entity.getZmdcmcqyzm());
			bodymap.put("DYDJ", entity.getDydj());
			bodymap.put("GCMCBCMS", entity.getBcsm());
			bodymap.put("XMBM", entity.getXmbm());
			bodymap.put("JSLX", entity.getJslx());
			bodymap.put("BDZZX", entity.getBdzlx());
			bodymap.put("PDZZXS", entity.getPdzzxs());
			bodymap.put("XZBDZZDMJ", entity.getBdzzdmj());
			bodymap.put("XZZBTS", entity.getBdts());
			bodymap.put("XZZBRL", entity.getXzrl());
			bodymap.put("WGBCRXRL", entity.getWgbcrxrl());
			bodymap.put("WGBCGXRL", entity.getWgbcgxrl());
			bodymap.put("BDTZ", entity.getBdtz());
			bodymap.put("XKJJG10", entity.getXjkj10qfjg());
			bodymap.put("XLTS", entity.getXlts());
			bodymap.put("XLZCD", entity.getXlzcd());
			bodymap.put("DLCD", entity.getDlxlcd());
			bodymap.put("DLXH", entity.getDlxh());
			bodymap.put("JKCD", entity.getJkxlcd());
			bodymap.put("JKXXH", entity.getJkxxh());
			bodymap.put("XLTZ", entity.getXltz());
			bodymap.put("GCZTZ", entity.getZtz());
			bodymap.put("ZYJH", entity.getZyjh());
			bodymap.put("GSZC", entity.getGszc());
			bodymap.put("QYZC", entity.getXjgdqyzc());
			bodymap.put("YH", entity.getYhtz());
			bodymap.put("QT", entity.getQt());
			bodymap.put("ZCSX", entity.getZcsx());
			bodymap.put("YEAR", entity.getGhtcsj());
			bodymap.put("GCSX_ZYX_FH", entity.getMzxzfhgdyqzyx());
			bodymap.put("GCSX_ZYX_BDZ", entity.getBdzptsczyx());			
			bodymap.put("GCSX_ZYX_SB", entity.getJjsbczgzzyx());			
			bodymap.put("GCSX_ZYX_AQ", entity.getXcsbaqyhzyx());			
			bodymap.put("GCSX_ZYX_WJ", entity.getJqwjjgzyx());			
			bodymap.put("GCSX_ZYX_DY", entity.getDyjrzyx());			
			bodymap.put("GCSX_ZYX_WD", entity.getWddqgdzyx());			
			bodymap.put("GCSX_ZYX_ZW", entity.getJqyzwlxzyx());			
			bodymap.put("GCSX_ZYX_XY", entity.getGwyxxydwlwzyx());			
			bodymap.put("GCSX_ZYX_QT", entity.getQtzyx());			
			bodymap.put("DYSCLB", entity.getDysclb());			
			bodymap.put("SFNWXM", entity.getSfnwxm());			
			bodymap.put("NWJSXZ4", entity.getNwjsxz1());			
			bodymap.put("NWJSXZ5", entity.getNwjsxz2());			
			bodymap.put("NWJSXZ6", entity.getNwjsxz3());			
			bodymap.put("XMJD", entity.getXmjd());			
			bodymap.put("BUSINESS_TYPE", entity.getSfykxm());			
			bodymap.put("APP_NO", entity.getYksqbh());			
			bodymap.put("BUSINESS_CODE", entity.getYkxz());		
			
			bodylist.add(bodymap);
		}
		
		  Test35kuojian.daochu110(name, headlist, bodylist);
	}
	
	
	/**
	 * 110线路改造  参数 List<GC_XLGZGC_110>
	 * @param list
	 */
	public static void table110xlgz(List<GC_XLGZGC_110> list){
		String name  ="110线路改造";
		List<Map<String,Object>> headlist=new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> bodylist=new ArrayList<Map<String,Object>>();
		String[] arr11={"行政区划","供电区域分类","所属企业","工程名称","项目编码","架空线路长度(千米)","其中:耐热导线(千米)","架空线路投资(万元)","电缆线路长度(千米)","沟道长度(千米)","电缆投资(万元)","其他项","其他项投资(万元)","总投资(万元)","中央计划（%）","公司自筹（%）","县级供电企业自筹（%）","用户投资（%）","其他（%）","资产属性","改造完成时间(年)","满足新增负荷供电要求-重要性","变电站配套送出-重要性","解决设备重载、过载-重要性","消除设备安全隐患-重要性","加强网架结构-重要性","电源接入-重要性","无电地区供电-重要性","加强与主网联系-重要性","孤网运行县域电网联网-重要性","其他-重要性","电源送出类别","是否农网项目","农网建设性质1","农网建设性质2","农网建设性质3","项目阶段","是否业扩项目","业扩申请编号","业扩性质"};
		String[] arrgc={"项目类型","项目所在地","站名/电厂名称/牵引站名","电压等级(kV)","补充描述"};
		String[] arr12={"AREA_ID","GDQYFL","ORG_ID","","XMBM","DXCD","QZFRDX","JKXLTZ","DLCD","GDCD","DLTZ","QTX","QTXTZ","ZTZ","ZYJH","GSZC","QYZC","YH","QT","ZCSX","YEAR","GCSX_ZYX_FH","GCSX_ZYX_BDZ","GCSX_ZYX_SB","GCSX_ZYX_AQ","GCSX_ZYX_WJ","GCSX_ZYX_DY","GCSX_ZYX_WD","GCSX_ZYX_ZW","GCSX_ZYX_XY","GCSX_ZYX_QT","DYSCLB","SFNWXM","NWJSXZ4","NWJSXZ5","NWJSXZ6","XMJD","BUSINESS_TYPE","APP_NO","BUSINESS_CODE"};
		String[] arrcg={"GCMCXMLX","GCMCXMSZD","GCMCZM","DYDJ","GCMCBCMS"};
		
		for (int i=0;i<arr11.length;i++) {
			Map<String,Object> headmap=new HashMap<String,Object>();
			if("工程名称".equals(arr11[i])){
				headmap.put("comments", arr11[i]);
				int j=0;
				List<Map<String,Object>> top1=new ArrayList<Map<String,Object>>();
				for (String string : arrgc) {
					Map<String,Object> headtop=new HashMap<String,Object>();
					headtop.put("comments", string);
					headtop.put("top", arrcg[j]);
					j++;
					top1.add(headtop);
				}
				headmap.put("top", top1);
			}else {
				headmap.put("comments", arr11[i]);
				headmap.put("top", arr12[i]);
			}
			headlist.add(headmap);
		}
		for (GC_XLGZGC_110 entity : list) {
			Map<String,Object> bodymap=new HashMap<String,Object>();
			bodymap.put("AREA_ID", entity.getXzqh());
			bodymap.put("GDQYFL", entity.getGdqufl());
			bodymap.put("ORG_ID", entity.getSsqy());
			bodymap.put("GCMCXMLX", entity.getXmlx());
			bodymap.put("DXCD", entity.getJkxlcd());
			bodymap.put("GCMCXMSZD", entity.getXmszd());
			bodymap.put("QZFRDX", entity.getQznrdx());
			bodymap.put("GCMCZM", entity.getZmdcmcqyzm());
			bodymap.put("DYDJ", entity.getDydj());
			bodymap.put("GCMCBCMS", entity.getBcsm());
			bodymap.put("XMBM", entity.getXmbm());
			bodymap.put("DLCD", entity.getDlxlcd());
			bodymap.put("ZTZ", entity.getZtz());
			bodymap.put("ZYJH", entity.getZyjh());
			bodymap.put("GSZC", entity.getGszc());
			bodymap.put("QYZC", entity.getXjgdqyzc());
			bodymap.put("YH", entity.getYhtz());
			bodymap.put("QT", entity.getQt());
			bodymap.put("ZCSX", entity.getZcsx());
			bodymap.put("GCSX_ZYX_FH", entity.getMzxzfhgdyqzyx());
			bodymap.put("GCSX_ZYX_BDZ", entity.getBdzptsczyx());			
			bodymap.put("GCSX_ZYX_SB", entity.getJjsbczgzzyx());			
			bodymap.put("GCSX_ZYX_AQ", entity.getXcsbaqyhzyx());			
			bodymap.put("GCSX_ZYX_WJ", entity.getJqwjjgzyx());			
			bodymap.put("GCSX_ZYX_DY", entity.getDyjrzyx());			
			bodymap.put("GCSX_ZYX_WD", entity.getWddqgdzyx());			
			bodymap.put("GCSX_ZYX_ZW", entity.getJqyzwlxzyx());			
			bodymap.put("GCSX_ZYX_XY", entity.getGwyxxydwlwzyx());			
			bodymap.put("GCSX_ZYX_QT", entity.getQtzyx());			
			bodymap.put("DYSCLB", entity.getDysclb());			
			bodymap.put("SFNWXM", entity.getSfnwxm());			
			bodymap.put("NWJSXZ4", entity.getNwjsxz1());			
			bodymap.put("NWJSXZ5", entity.getNwjsxz2());			
			bodymap.put("NWJSXZ6", entity.getNwjsxz3());			
			bodymap.put("XMJD", entity.getXmjd());			
			bodymap.put("BUSINESS_TYPE", entity.getSfykxm());			
			bodymap.put("APP_NO", entity.getYksqbh());			
			bodymap.put("BUSINESS_CODE", entity.getYkxz());		
			bodymap.put("JKXLTZ", entity.getJkxltz());		
			bodymap.put("GDCD", entity.getGdcd());		
			bodymap.put("DLTZ", entity.getDltz());		
			bodymap.put("QTX", entity.getQtx());		
			bodymap.put("QTXTZ", entity.getQtxtz());		
			bodymap.put("YEAR", entity.getGzwcsj());	
			
			bodylist.add(bodymap);
		}
		
		  Test35kuojian.daochu110(name, headlist, bodylist);
	}
	
	/**
	 * 110变电站改造  参数 List<GC_BDZGZGC_110>
	 * @param list
	 */
	public static void table110bdzgz(List<GC_BDZGZGC_110> list){
		String name  ="110变电站改造";
		List<Map<String,Object>> headlist=new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> bodylist=new ArrayList<Map<String,Object>>();
		String[] arr11={"行政区划","供电区域分类","所属企业","工程名称","项目编码","变压器改造台数(台)","改造变压器编号1","改造变压器编号2","现状主变容量(兆伏安)","改造后主变容量(兆伏安)","断路器(台)","其他项","其它项投资(万元)","总投资(万元)","中央计划（%）","公司自筹（%）","县级供电企业自筹（%）","用户投资（%）","其它（%）","资产属性","改造完成时间(年)","满足新增负荷供电要求-重要性","变电站配套送出-重要性","解决设备重载、过载-重要性","消除设备安全隐患-重要性","加强网架结构-重要性","电源接入-重要性","无电地区供电-重要性","加强与主网联系-重要性","孤网运行县域电网联网-重要性","其他-重要性","电源送出类别","是否农网","农网建设性质1","农网建设性质2","农网建设性质3","项目阶段","是否业扩项目","业扩申请编号","业扩性质"};
		String[] arrgc={"项目类型","项目所在地","站名/电厂名称/牵引站名","电压等级(kV)","补充描述"};
		String[] arr12={"AREA_ID","GDQYFL","ORG_ID","","XMBM","BYQGZTS","GZBYQBH1","GZBYQBH2","XZZBRL","GZHZBRL","DLQ","QTX","QTXTZ","ZTZ","ZYJH","GSZC","QYZC","YH","QT","ZCSX","YEAR","GCSX_ZYX_FH","GCSX_ZYX_BDZ","GCSX_ZYX_SB","GCSX_ZYX_AQ","GCSX_ZYX_WJ","GCSX_ZYX_DY","GCSX_ZYX_WD","GCSX_ZYX_ZW","GCSX_ZYX_XY","GCSX_ZYX_QT","DYSCLB","SFNWXM","NWJSXZ4","NWJSXZ5","NWJSXZ6","XMJD","BUSINESS_TYPE","APP_NO","BUSINESS_CODE"};
		String[] arrcg={"GCMCXMLX","GCMCXMSZD","GCMCZM","DYDJ","GCMCBCMS"};
		
		for (int i=0;i<arr11.length;i++) {
			Map<String,Object> headmap=new HashMap<String,Object>();
			if("工程名称".equals(arr11[i])){
				headmap.put("comments", arr11[i]);
				int j=0;
				List<Map<String,Object>> top1=new ArrayList<Map<String,Object>>();
				for (String string : arrgc) {
					Map<String,Object> headtop=new HashMap<String,Object>();
					headtop.put("comments", string);
					headtop.put("top", arrcg[j]);
					j++;
					top1.add(headtop);
				}
				headmap.put("top", top1);
			}else {
				headmap.put("comments", arr11[i]);
				headmap.put("top", arr12[i]);
			}
			headlist.add(headmap);
		}
		for (GC_BDZGZGC_110 entity : list) {
			Map<String,Object> bodymap=new HashMap<String,Object>();
			bodymap.put("AREA_ID", entity.getXzqh());
			bodymap.put("GDQYFL", entity.getGdqufl());
			bodymap.put("ORG_ID", entity.getSsqy());
			bodymap.put("GCMCXMLX", entity.getXmlx());
			bodymap.put("GCMCXMSZD", entity.getXmszd());
			bodymap.put("GCMCZM", entity.getZmdcmcqyzm());
			bodymap.put("DYDJ", entity.getDydj());
			bodymap.put("GCMCBCMS", entity.getBcsm());
			bodymap.put("XMBM", entity.getXmbm());
			bodymap.put("ZTZ", entity.getZtz());
			bodymap.put("ZYJH", entity.getZyjh());
			bodymap.put("GSZC", entity.getGszc());
			bodymap.put("QYZC", entity.getXjgdqyzc());
			bodymap.put("YH", entity.getYhtz());
			bodymap.put("QT", entity.getQt());
			bodymap.put("ZCSX", entity.getZcsx());
			bodymap.put("GCSX_ZYX_FH", entity.getMzxzfhgdyqzyx());
			bodymap.put("GCSX_ZYX_BDZ", entity.getBdzptsczyx());			
			bodymap.put("GCSX_ZYX_SB", entity.getJjsbczgzzyx());			
			bodymap.put("GCSX_ZYX_AQ", entity.getXcsbaqyhzyx());			
			bodymap.put("GCSX_ZYX_WJ", entity.getJqwjjgzyx());			
			bodymap.put("GCSX_ZYX_DY", entity.getDyjrzyx());			
			bodymap.put("GCSX_ZYX_WD", entity.getWddqgdzyx());			
			bodymap.put("GCSX_ZYX_ZW", entity.getJqyzwlxzyx());			
			bodymap.put("GCSX_ZYX_XY", entity.getGwyxxydwlwzyx());			
			bodymap.put("GCSX_ZYX_QT", entity.getQtzyx());			
			bodymap.put("DYSCLB", entity.getDysclb());			
			bodymap.put("SFNWXM", entity.getSfnwxm());			
			bodymap.put("NWJSXZ4", entity.getNwjsxz1());			
			bodymap.put("NWJSXZ5", entity.getNwjsxz2());			
			bodymap.put("NWJSXZ6", entity.getNwjsxz3());			
			bodymap.put("XMJD", entity.getXmjd());			
			bodymap.put("BUSINESS_TYPE", entity.getSfykxm());			
			bodymap.put("APP_NO", entity.getYksqbh());			
			bodymap.put("BUSINESS_CODE", entity.getYkxz());		
			bodymap.put("QTX", entity.getQtx());		
			bodymap.put("QTXTZ", entity.getQtxtz());		
			bodymap.put("YEAR", entity.getGzwcsj());		
			bodymap.put("GZBYQBH1", entity.getGzbyqbh1());		
			bodymap.put("GZBYQBH2", entity.getGzbyqbh2());		
			bodymap.put("BYQGZTS", entity.getByqgzts());		
			bodymap.put("XZZBLR", entity.getXzzbrl());		
			bodymap.put("GZHZBRL", entity.getGzhzbrl());		
			bodymap.put("DLQ", entity.getDlq());		
			
			bodylist.add(bodymap);
		}
		
		  Test35kuojian.daochu110(name, headlist, bodylist);
	}
	
	public static void tablebdz(){
		List<Map<String,Object>> headlist=new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> bodylist=new ArrayList<Map<String,Object>>();
		String[] arr11={"变电站名称","所属乡镇","	市辖县级","电压等级（kV）","变电站属性","供电分区","变比","主变编号","主变容量（MVA)","建设形式","全年最大负荷","年最大负荷时刻负荷","	年供电量（万kwh）","变电站负载率（%）","主变负载率（%）","10（20）出线间隔情况（个）","无功补偿配置","主变投运时间","容量构成（MVA）","容量（MVA）","主变投运年限","是否单线变","主变是否满足n-1","主变负载率分布区间"};
		String[] arrnzdfh={"变电站负荷（MW）","主变负荷（MW）"};//全年最大负荷
		String[] arrzdskfh={"变电站负荷（MW）","主变负荷（MW）"};//年最大负荷时刻负荷
		String[] arrjgqk={"现状总数","规划总数","现状已用间隔"};//10（20）出线间隔情况（个）
		String[] arrbcpz={"现状补偿容量（Mvar）","规划补偿容量（Mvar）"};//无功补偿配置
		String[] arr12={"AREA_ID","GDQYFL","ORG_ID","","XMBM","BYQGZTS","GZBYQBH1","GZBYQBH2","XZZBRL","GZHZBRL","DLQ","QTX","QTXTZ","ZTZ","ZYJH","GSZC","QYZC","YH","QT","ZCSX","YEAR","GCSX_ZYX_FH","GCSX_ZYX_BDZ","GCSX_ZYX_SB","GCSX_ZYX_AQ","GCSX_ZYX_WJ","GCSX_ZYX_DY","GCSX_ZYX_WD","GCSX_ZYX_ZW","GCSX_ZYX_XY","GCSX_ZYX_QT","DYSCLB","SFNWXM","NWJSXZ4","NWJSXZ5","NWJSXZ6","XMJD","BUSINESS_TYPE","APP_NO","BUSINESS_CODE"};
		String[] arrcg={"GCMCXMLX","GCMCXMSZD","GCMCZM","DYDJ","GCMCBCMS"};
	}
	
}
