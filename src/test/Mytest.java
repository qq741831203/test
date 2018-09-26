package test;

import com.dw.dao.bgbz.BGBZ_BDZ;

public class Mytest   {
    public static void main(String args[]) {
    	BGBZ_BDZ a = new BGBZ_BDZ();
    	a.setId("1");
    	BGBZ_BDZ b = a;
    	a.setId("3");
    	System.out.println(b.getId());
    }
  
	

}
