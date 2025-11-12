package Selenium_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OHRM_Browser_launch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();  
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(3000); 
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Admin");
        WebElement  password = driver.findElement(By.name("password"));
        password.sendKeys("admin123");
       // driver.findElement(By.//button[@type="submit"])
 
 
	}
		
		
		
	}
	
	

