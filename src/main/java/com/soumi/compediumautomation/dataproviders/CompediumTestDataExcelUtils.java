package com.soumi.compediumautomation.dataproviders;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CompediumTestDataExcelUtils {

	public static Workbook book;
	public static Sheet sheet;

	public static String TESTDATA_SHEET_PATH = "C:\\Users\\Dell\\eclipse-workspace\\CompediumAutomationProject\\src\\main\\resources\\testData\\compendiumdev_TestData.xlsx";

	public static Object[][] getTestData(String sheetName) {
		try {
			FileInputStream fis = new FileInputStream(TESTDATA_SHEET_PATH);
			book = WorkbookFactory.create(fis);
			sheet = book.getSheet(sheetName);

			Object data[][] = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			for(int i=0;i<sheet.getLastRowNum();i++) {
				for(int k=0;k<sheet.getRow(0).getLastCellNum();k++) {
					data[i][k] = sheet.getRow(i+1).getCell(k).toString();
				}
			}
			return data;

		} catch (EncryptedDocumentException | IOException e) {

			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		}
		return null;
	}
}
