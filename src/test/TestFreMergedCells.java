package test;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.util.CellRangeAddress;
//测试复杂的单元格合并
public class TestFreMergedCells {

    public static void main(String[] args) throws IOException {
                HSSFWorkbook wb = new HSSFWorkbook();     
                HSSFSheet sheet = wb.createSheet("new sheet");     
                HSSFRow row = sheet.createRow(0);     
                HSSFCell cell = row.createCell(0);  
                //HSSFRow row = sheet.createRow(0);     
                //HSSFCell cell = row.createCell(1);   cell.setCellValue("value");  这个代表设置值为（0，1）第1行第二列
                //设置值是（0，0）代表第1行第1列，如果你想到的是我既然合并了第一列的第一行和第二行，我是否可以设置（1，0,
                //你可以测试下，这个显然是不行的
                cell.setCellValue("第一行第二行合并，第一列");  
                sheet.addMergedRegion(new CellRangeAddress(0, 1, 0, 0));
                
                //合并第二列的第一行第二行
                sheet.addMergedRegion(new CellRangeAddress(0, 1, 1, 1));
                
                //1.生成字体对象  
                HSSFFont font = wb.createFont();  
                font.setFontHeightInPoints((short) 10);  
                font.setFontName("黑体");  
                font.setColor(HSSFColor.BLUE.index);  
                font.setBoldweight((short) 0.8);  
                //2.生成样式对象  
                HSSFCellStyle style = wb.createCellStyle();  
                style.setAlignment(HSSFCellStyle.ALIGN_CENTER);  
                style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);  
                style.setFont(font); //调用字体样式对象  
                style.setWrapText(true);  
                //增加表格边框的样式 例子  
               style.setBorderTop(HSSFCellStyle.BORDER_DOUBLE);  
               style.setBorderLeft(HSSFCellStyle.BORDER_DOUBLE);  
               style.setTopBorderColor(HSSFColor.GOLD.index);  
               style.setLeftBorderColor(HSSFColor.PLUM.index);  
               
                //3.单元格应用样式  
                cell.setCellStyle(style);  
                //行：合并第一行，第二行，第三行
                //列说明：列也是从0开始的，0代表第一列；
                //列：合并第五列，第六列，第七列，第八列，第九列
                HSSFRow rowOther = sheet.createRow(0);  
                HSSFCell cellOther = rowOther.createCell(4);
                cellOther.setCellValue("多行多列合并");
                sheet.addMergedRegion(new CellRangeAddress(0, 2, 4, 9));
                //一下代码表示在D4 cell 插入一段字符串  
                HSSFRow row2 = sheet.createRow(3);  
                HSSFCell cell2 = row2.createCell(3);   
                cell2.setCellValue("只是一个数据而已");  
      
                 // Write the output to a file     
                 FileOutputStream fileOut = new FileOutputStream("E:\\test.xls");     
                 wb.write(fileOut);     
                 fileOut.close();     
             }     
    }