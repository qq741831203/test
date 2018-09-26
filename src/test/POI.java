package test;

import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.DVConstraint;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDataValidation;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.XSSFDataValidation;
import org.apache.poi.xssf.usermodel.XSSFDataValidationConstraint;
import org.apache.poi.xssf.usermodel.XSSFDataValidationHelper;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 * POI建立有下拉框的excel单元格示例代码
 * @author 灰灰
 *
 */
public class POI {

	public static void main(String [] args) throws Exception{  
		  
		String [] list={"东软","华信","SAP","海辉"};  
		  
		//new POI().createListBox(list);  
		POI.dropDownList42007("qw");  
		return ;
    }

	public void createListBox (String [] list){  
  
  //文件初始化  

  HSSFWorkbook wb = new HSSFWorkbook();  
  
  HSSFSheet sheet = wb.createSheet("new sheet");  
  
  //在第一行第一个单元格，插入下拉框  
 
   HSSFRow row = sheet.createRow(4);  
  
   HSSFCell cell = row.createCell(4);  
  
  //普通写入操作  
    cell.setCellValue(list[0]);//这是实验  
  
   //生成下拉列表  
  
   //只对（0，0）单元格有效  
  
    CellRangeAddressList regions = new CellRangeAddressList(4,4,4,4);  
  
    //生成下拉框内容  
  
    DVConstraint constraint = DVConstraint.createExplicitListConstraint(list);  
  
    //绑定下拉框和作用区域  
  
    HSSFDataValidation data_validation = new HSSFDataValidation(regions,constraint);  
  
    //对sheet页生效  
  
    sheet.addValidationData(data_validation);  
  
    //写入文件  

    FileOutputStream fileOut;  
  
    try {  
  
    fileOut = new FileOutputStream("E:\\workbook.xls");  
  
    wb.write(fileOut);  
  
    fileOut.close();  
  
    } catch (Exception e) {  
  
    // TODO Auto-generated catch block  
 
    e.printStackTrace();  
  
    }
  
    //结束  
  
    System.out.println("Over");
   }
	//XSSF下拉框
	public static void dropDownList42007(String filePath)
	        throws Exception {
	    XSSFWorkbook workbook = new XSSFWorkbook();
	    XSSFSheet sheet = workbook.createSheet("下拉列表测试");
	    String[] datas = new String[] {"维持","恢复","调整"};
	    XSSFDataValidationHelper dvHelper = new XSSFDataValidationHelper(sheet);
	    XSSFDataValidationConstraint dvConstraint = (XSSFDataValidationConstraint) dvHelper.createExplicitListConstraint(datas);
	    CellRangeAddressList addressList = null;
	    XSSFDataValidation validation = null;
	    for (int i = 0; i < 100; i++) {
	        addressList = new CellRangeAddressList(i, i, 0, 0);
	        validation = (XSSFDataValidation) dvHelper.createValidation(dvConstraint, addressList);
	        // 07默认setSuppressDropDownArrow(true);
	        // validation.setSuppressDropDownArrow(true);
	        // validation.setShowErrorBox(true);
	        sheet.addValidationData(validation);
	    }
	    FileOutputStream stream = new FileOutputStream(filePath);
	    workbook.write(stream);
	    stream.close();
	    addressList = null;
	    validation = null;
	}
	
	
}