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

import freemarker.core.ReturnInstruction.Return;

public class Exelutils2 {
	
		private static  XSSFWorkbook workbook;
	    private static XSSFSheet sheet;
	    private static  XSSFRow row;
	    private static XSSFCell cell;

	  
	   public void setExcelFile(String excelfilepath,String Sheetname) throws IOException {
		   // TODO Auto-generated method stub
		   File file=new File(excelfilepath);
		   FileInputStream inputstream=new FileInputStream(file);
		   workbook =new XSSFWorkbook(inputstream);
		   sheet =workbook.getSheet(Sheetname);
		   

	}
	    public String getcellData(int rowNumbar,int cellNumber) {
			// TODO Auto-generated method stub
	    	cell =sheet.getRow(rowNumbar).getCell(cellNumber);
	    	return cell.getStringCellValue();

		} 
	   public int getRowCountInSheet(){
	       int rowcount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	       return rowcount;
	    }
	   public void setCellValue(int rowNum,int cellNum,String cellValue,String excelFilePath) throws IOException {
	    	sheet.getRow(rowNum).createCell(cellNum).setCellValue(cellValue);
	        
	    	FileOutputStream outputStream = new FileOutputStream(excelFilePath);
	    	workbook.write(outputStream);
	    }
	}



	
