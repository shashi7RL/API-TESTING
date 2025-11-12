package Selenium_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoNopCommerce_Browser_launch {

	//public static void main(String[] args) throws InterruptedException {
		/*
		 * WebDriverManager.chromedriver().setup(); ChromeDriver driver = new
		 * ChromeDriver();
		 * driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		 * Thread.sleep(3000); driver.manage().window().maximize(); WebElement
		 * username=driver.findElement(By.className("email"));
		 * username.sendKeys("Shashi"); WebElement
		 * Password=driver.findElement(By.id("Password"));
		 * Password.sendKeys("password");
		 * driver.findElement(By.className("button-1")).click(); /// Doubt --> only
		 * before space will work
		 * 
		 */
		public static String reverseWord(String word) {
	        String reversed = "";
	       
	        for (int i = word.length() - 1; i >= 0; i--) {
	            reversed = reversed + word.charAt(i);
	        }
	        
	        return reversed;
	    }

	    public static void main(String[] args) {
	        String input = "java is a simple programming";
	        String[] words = input.split(" ");

	        String output = "";
		
	        
		for (int i = 0; i < words.length; i++) {
		    if (i % 2 == 1) {  // Reverse words at even positions (2nd, 4th, ...)
		        output = output + reverseWord(words[i]);
		    } else {
		        output = output + words[i];
		    }

		    if (i != words.length - 1) {
		        output = output + " ";
		    }
		}
	}
	    
	    

}
