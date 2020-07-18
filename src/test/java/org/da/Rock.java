package org.da;
import java.io.IOException;
import java.util.List;

import org.base.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Rock extends BaseClass {
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Ragu-SJ\\eclipse-workspace\\org.selenium\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://toolsqa.com/automation-practice-table/");
			List<WebElement> tRows = driver.findElements(By.tagName("tr"));
			for(WebElement rows:tRows){
			List<WebElement> tData = driver.findElements(By.tagName("td"));
			for(WebElement data:tData){
			System.out.println(data.getText());
			}
			}
			}
		
	}
	
	
	
	
	
	

