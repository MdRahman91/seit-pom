package automationFramework;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.Home_Page;

public class POM_TC {
	
	 private static WebDriver driver = null;

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 File file = new File("resources");
		 String absolutePath = file.getAbsolutePath();
		 	 
	     driver.get(absolutePath + "\\index.html");
	     
	     String third_elem = Home_Page.find_3rd_element(driver);
	     String fifth_elem = Home_Page.find_5th_element(driver);
	     
	     System.out.println(third_elem + "\n" + fifth_elem);
	     
	     System.out.println();
	     
	     Home_Page.store_In_Map(driver);

	}

}
