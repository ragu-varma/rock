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
	private void test() {
		launch();
		enterUrl("https://www.facebook.com/");
		System.out.println("completed");
	}
	
		public static void main(String[] args) {

			Rock r = new Rock();
			r.test();
			

			
			
			
			}
			
			}
		
	
	
	
	
	
	
	

