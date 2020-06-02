package com.qa.apilearning;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClass {
	
	@Test
	
	RestAssured.get()
	
	
	
	
	
	@BeforeMethod
	public void before() throws IOException {
	
		Properties properties = new Properties();
			
		InputStream io = new FileInputStream("C:\\mySelenium\\projects\\apilearning\\src\\main\\resources\\com\\qa\\config\\config.properties");
		properties.load(io);
		String URI = (String) properties.get("URL");
		System.out.println(URI);
	
	}
	
	@AfterMethod
	public static void after() throws IOException {
		System.out.println("Complete");
	
	}

}
