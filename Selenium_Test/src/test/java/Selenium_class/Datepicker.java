package Selenium_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker {

	public static void main(String[] args) throws InterruptedException {
		
		
                WebDriverManager.chromedriver().setup(); 
                ChromeDriver driver = new  ChromeDriver();
			    driver.get("https://jqueryui.com/datepicker/");
			    Thread.sleep(3000); 
			    driver.manage().window().maximize();
			   WebElement iframe= driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
			    driver.switchTo().frame(iframe);
			    Thread.sleep(3000);
			    driver.findElement(By.id("datepicker")).click();
			    
			    Thread.sleep(3000);
			     
			    String exp_date="10";
			    String exp_mon="September";
			    String exp_yr="2025";
			    
			    String act_month =driver.findElement(By.xpath("//*[@class='ui-datepicker-month']")).getText();	
			    String act_year =driver.findElement(By.xpath("//*[@class='ui-datepicker-year']")).getText();			     

			     if (act_year.equals(exp_yr) && (act_month.equals(exp_mon))) {
			    	 
			    	 
			    	 List<WebElement> trdata= driver.findElements(By.tagName("tr"));
			         for (WebElement row : trdata) {
			      	   List<WebElement> tddata= row.findElements(By.tagName("td"));
			      	   for (WebElement data:tddata) {
			      		   String all_dates=data.getText();
			      		   if (all_dates.equals(exp_date)) {
			      			 data.click();
			      		   }else {
			      			   
			      			   
			      			   
			      		   }
			      	   }
			         }
			    	 
			     }
			     
			     
			     
			     driver.close();

	}
			     }


