package com.vimalselvam.cucumber.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Snap {
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	public void setExcelFile( String excelFilePath, String SheetName) throws IOException {
		// TODO Auto-generated method stub
		File file=new File(excelFilePath);
		FileInputStream Inputstream=new FileInputStream(file);
		workbook =new XSSFWorkbook(Inputstream);
		sheet =workbook.getSheet(SheetName);

	}
	public String getCellData(int rowNumber,int cellNumber) {
		cell =sheet.getRow(rowNumber).getCell(cellNumber);
		return cell.getStringCellValue();
		// TODO Auto-generated method stub

	}
	public int getROwCountInsheet() {
		// TODO Auto-generated method stub
		int rowcount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		return rowcount;

	}
	public void setCellValue(int rowNum,int cellNum, String cellValue, String excelFilePath) throws IOException {
		// TODO Auto-generated method stub
		sheet.getRow(rowNum).createCell(cellNum).setCellValue(excelFilePath);
		FileOutputStream outputsream=new FileOutputStream(excelFilePath);
		workbook.write(outputsream);

	}
	public void setcellvalue(int rowNum, int cellNum, String cellValue, String excelFilePath) {
		// TODO Auto-generated method stub
		
	}

}
