package com.vimalselvam.cucumber.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ticket {
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@SuppressWarnings("unused")
	public void SetExelFile(String excelfilepath,String Sheetname) throws IOException {
		// TODO Auto-generated method stub
		File file= new File(excelfilepath);
		FileInputStream inputstream=new FileInputStream(Sheetname);
		workbook=new XSSFWorkbook(inputstream);
		sheet=workbook.getSheet(Sheetname);

	}
	public String getcellData(int rowNumbar,int cellNumber){
		// TODO Auto-generated method stub
		cell =sheet.getRow(rowNumbar).getCell(cellNumber);
		return cell.getStringCellValue();
		

	}
	public int getRowCountInsheet() {
		int rowcount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		return rowcount;
	}
	public void Setcellvalue(int rowNum,int cellNum, String cellvalue, String excelFilepath) throws IOException {
		// TODO Auto-generated method stub
		sheet.getRow(rowNum).createCell(cellNum).setCellValue(excelFilepath);
		FileOutputStream outputstream=new FileOutputStream(excelFilepath);
		workbook.write(outputstream);

	}  
	


}
