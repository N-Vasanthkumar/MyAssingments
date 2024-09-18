package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdowns {
	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		// Launch the ChromeBrowser
		
        ChromeDriver driver1 = new ChromeDriver();
        
        //Load the URL  - .get
        driver1.get("http://leaftaps.com/opentaps/control/main");
        
        //Maximize window
        driver1.manage().window().maximize();
        
        //Enter the username
        
        driver1.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
        
        //Enter the password

       driver1.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

       //Click Login Button
        driver1.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
   
       //Click crmsfa
        driver1.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
        
        //Click Leads link
        driver1.findElement(By.xpath("//a[text()='Leads']")).click();
        
        //Click Create Lead
        driver1.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
        
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vasanth");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
        
        
       WebElement dd1= driver.findElement(By.id("createLeadForm_dataSourceId"));
       WebElement dd2= driver.findElement(By.id("createLeadForm_ownershipEnumId"));
       WebElement dd3= driver.findElement(By.id("createLeadForm_marketingCampaignId"));
       
       Select dropdown1= new Select(dd1);
       Select dropdown2= new Select(dd2);
       Select dropdown3= new Select(dd3);
       
       dropdown1.selectByIndex(5);
       dropdown2.selectByValue("OWN_CCORP");
       dropdown3.selectByVisibleText("Automobile");
       
	driver.findElement(By.className("smallSubmit"));
	driver.close();
	
	
	}

}
