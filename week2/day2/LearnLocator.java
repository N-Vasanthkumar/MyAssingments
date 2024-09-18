package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocator {

	public static void main(String[] args) {
		
		//launch the browser
		
	ChromeDriver driver=new ChromeDriver();
	
	// load the url
	
	driver.get("https://www.facebook.com/");
	
	// maximise the window
	
	driver.manage().window().maximize();
	
	//find the element
	driver.findElement(By.id("email")).sendKeys("Testleaf.2023@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Tuna@321");
	driver.findElement(By.name("login")).click();
	driver.findElement(By.partialLinkText("Find")).click();
	
	
	
	}

}
