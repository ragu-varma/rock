package org.base;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static WebElement a;
	static Robot r;
	static Actions act;
	static Select se;
	 static JavascriptExecutor jav;
	public static WebDriver launch() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ragu-SJ\\eclipse-workspace\\org.selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	public static void enterUrl(String url) {
		driver.get(url);
	}
	public static void max() {
		driver.manage().window().maximize();
	}
	public static WebElement findElmtId(String y) {
		 a = driver.findElement(By.id(y));
		 return a;
	}
	public static WebElement findElmtCls(String y) {
		  a = driver.findElement(By.className(y));
		 return a;
	}
	public static WebElement findElmtName(String y) {
		 a = driver.findElement(By.name(y));
		 return a;
	}
	public static void ky(String s) {
		a.sendKeys(s);
	}
	public static void clickBtn() {
		a.click();
	}
	  public static void twoClick() {

		 act = new Actions(driver);
		act.doubleClick(a);
		}
	  public static String conToStr(int a , int b) throws IOException {
			File fi = new File("C:\\Users\\Ragu-SJ\\eclipse-workspace\\Rockers\\excel\\document.xls");
			FileInputStream d = new FileInputStream(fi);
			Workbook w = new HSSFWorkbook(d);
			Sheet s =w.getSheet("Sheet1");
			
				

			
				Row r =s.getRow(a);
				
				Cell c =r.getCell(b);
				String value = null;
				if(c.getCellType()==1) {
					 value = c.getStringCellValue();
				}
				else if(DateUtil.isCellDateFormatted(c)) {
					SimpleDateFormat dat = new SimpleDateFormat("dd-MM-yyyy");
					 value = dat.format(c);
				}
				else {
					double dol=c.getNumericCellValue();
					long l =(long)dol;
					  value = String.valueOf(l);
				}
				return value;
				}}
	 