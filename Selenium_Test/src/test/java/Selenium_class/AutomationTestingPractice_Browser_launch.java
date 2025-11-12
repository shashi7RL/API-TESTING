package Selenium_class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTestingPractice_Browser_launch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();  
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        WebElement name=driver.findElement(By.id("name"));
        name.sendKeys("Shashi");
        WebElement email_id=driver.findElement(By.className("form-control"));
        email_id.sendKeys("sai@gmail.com");
        WebElement Phonenumber=driver.findElement(By.id("phone"));
        Phonenumber.sendKeys("9988774455");
        driver.findElement(By.className("form-check-input")).click();
        
      //  List<WebElement> obj =driver.findElements(null);
        String ss ="sa s i kumar sk";
           String[] s2= ss.split(" ");
		
	}

}
