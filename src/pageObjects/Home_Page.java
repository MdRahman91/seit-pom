package pageObjects;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {
	 
    private static WebElement element = null;
 
 public static String find_3rd_element(WebDriver driver){
 
	  List <WebElement> elements = driver.findElements(By.className("title"));
	 
	  String str = elements.get(2).getText();
	  
	  return str;
 
    }
 
 public static String find_5th_element(WebDriver driver){
	 
	  List <WebElement> elements = driver.findElements(By.className("title"));
	 
	  String str = elements.get(4).getText();
   
	  return str;

   }
 
 public static void store_In_Map(WebDriver driver){
	 
	  List <WebElement> titles = driver.findElements(By.className("title"));
	  List <WebElement> descriptions = driver.findElements(By.className("description"));
	 
	  Map<String, String> maps = new LinkedHashMap<String, String>();
  
	  for(int i=0;i<titles.size();i++){
		  
		  maps.put(titles.get(i).getText(),descriptions.get(i).getText() );

	  }
	  
	  Iterator<?> it = maps.entrySet().iterator();
	  
	  while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        System.out.println(pair.getKey() + " = " + pair.getValue());
	       
	    }

  }
 
 
}