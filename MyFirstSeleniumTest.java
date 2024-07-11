package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MyFirstSeleniumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   /*
	    * 1. Go to the url - https://nichethyself.com/tourism/home.html
	    * 2. Type username as "stc123"
	    * 3. Type password as "12345"
	    * 4. Submit the form
	    * 5. Verify that after login the page title is "My account"
	    * 
	    */
		
		//It opens Chrome Browser.
        WebDriver driver;//WebDriver is an interface.
        String name;
        int age;
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
 // driver = new FirefoxDriver();
  //driver.manage().window().maximize();
        
 //     driver = new EdgeDriver();
        
 //     driver = new SafariDriver();
        
        //1. Go to the url - https://nichethyself.com/tourism/home.html 
        driver.get("https://nichethyself.com/tourism/home.html");
        
        //2. Type username as "stc123"
        WebElement user = driver.findElement(By.name("username"));
        user.sendKeys("stc123");
        
     //3. Type password as "12345"
        driver.findElement (By.name("password")).sendKeys("12345");
        
        
     // driver.findElement (By.name("password")).submit();
        //4. Submit the form
        user.submit();
        
        String expectedTitle = "My account";
        String actualTitle = driver.getTitle();
        
        if (expectedTitle.equals(actualTitle)) {
        	System.out.println("Test Passed");
        } else {
        	System.out.println("Test Failed");
        	
        }
        
       
        //close the browser
        driver.quit();
        
	

 }
}