package com.vimalselvam.cucumber.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Swiggy1 {
	 private static XSSFWorkbook  workbook;
	 private static XSSFSheet sheet;
	 private static XSSFRow row;
	 private static XSSFCell cell;
	 
	 public void setExcelFile(String excelfilepath,String Sheetname) throws IOException {
		// TODO Auto-generated method stub
		 File file=new File(excelfilepath);
		 FileInputStream inputstream=new FileInputStream(file);
		 workbook =new XSSFWorkbook(inputstream);
		 sheet =workbook.getSheet(Sheetname);

	}
	 public String getcellData(int rowNumber,int cellNumber) {
		// TODO Auto-generated method stub
		cell =sheet.getRow(rowNumber).getCell(cellNumber);
		return cell.getStringCellValue();
		

	} public double getcellNumericValue(int rowNumber,int cellNumber) {
		// TODO Auto-generated method stub
		cell =sheet.getRow(rowNumber).getCell(cellNumber);
		return cell.getNumericCellValue();
	}
		

	 public int getRowCountInSheet() {
		// TODO Auto-generated method stub
		 int rowcount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		 return rowcount;

	}
	 public void setCellValue(int rowNum,int cellNum,String cellValue,String excelFilepath) throws IOException {
		
		// TODO Auto-generated method stub
		 sheet.getRow(rowNum).createCell(cellNum).setCellValue(cellValue);
		 FileOutputStream outputStream=new FileOutputStream(excelFilepath);
		 workbook.write(outputStream);
		 

	}
	

}
