package Selenium_class;

//import java.awt.List;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();  
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/table.xhtml");
        Thread.sleep(3000);
        driver.manage().window().maximize();
       List<WebElement> trdata= driver.findElements(By.tagName("tr"));
       for (WebElement row : trdata) {
    	   List<WebElement> tddata= row.findElements(By.tagName("td"));
    	   for (WebElement data:tddata) {
    		   System.out.println(data.getText());
    	   }
    	   
       }

	}
	
	

}
