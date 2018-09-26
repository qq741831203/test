package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ColorT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		String[] array={"1","1","2","2","3","3","3","4","4","5","11","14"};
		System.out.println("主分支");
		System.out.println("test分支");
		System.out.println("test分支");
		System.out.println("测试分支加一行");
		System.out.println("测试分支加二行");
		System.out.println("测试分支加三行");
		System.out.println("测试分支加四行");
		System.out.println("测试分支加五行");
		System.out.println("测试分支加六行");
		System.out.println("测试分支加七行");
		System.out.println("测试分支加八行");
		System.out.println("测试分支加九行");
		System.out.println("测试分支加十行");
		System.out.println("==");
		for (String string : array) {
			list.add(string);
			
		}
		bdzrlJs(list);

	}
	
	/**
	 * 变电站容量计算
	 * @param array
	 * @return
	 */
	public static Map<String,Object> bdzrlJs(List<String> list){
		Map<String, Integer> map = new HashMap<String, Integer>();
				for (String string : list) {
					Integer integer = map.get(string);
					map.put(string, integer == null?1:integer+1);
				}
				Set<Entry<String, Integer>> set = map.entrySet();
				String byqrlzc="";
				int byqts=0;
				int byqrl=0;
				for (Entry<String, Integer> entry : set) {
					byqrlzc+=entry.getValue()+"x"+entry.getKey()+"+";
					byqts+=entry.getValue();
					byqrl+=entry.getValue()*Integer.valueOf(entry.getKey());
				}
				byqrlzc=byqrlzc.substring(0, byqrlzc.lastIndexOf("+"));
				Map<String,Object> rmap=new HashMap<String, Object>();
				rmap.put("byqts", byqts);
				rmap.put("byqrl", byqrl);
				rmap.put("byqrlzc", byqrlzc);
				return rmap;
		}

	
}
