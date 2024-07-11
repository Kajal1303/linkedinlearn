package scripts;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A1Orangehrm {
	


		private static final String String = null;
		WebDriver driver;//WebDriver is an interface.
		//WebDriverWait wait;

		@Test
	 
		public void logintoOrangeHRMWebsite() throws InterruptedException {
		//1. Go to the url - https://opensource-demo.orangehrmlive.com/web/index.php/auth/login 
	      driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	      Thread.sleep(2000);
	      
	      //2. Type username as "Admin"
	      WebElement user = driver.findElement(By.name("username"));
	      user.sendKeys("Admin");
	      
	      WebElement pass = driver.findElement (By.name("password"));
	      pass.sendKeys("admin123");

	      
	      WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
	      button.click();
	      Thread.sleep(2000);
	      
	     // WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));	
	     // assertEquals(button.getText(), "Hello World!");
	      
	    
	  }
	  @BeforeMethod
	  public void goToAdmintab() {
		  
	     
	      
          driver = new ChromeDriver();
	      
	      
	     // driver = new FirefoxDriver();
	      driver.manage().window().maximize();
	      
	     // wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(2500));
	     // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }

	  @AfterMethod
	  public void afterMethod() {
		  //close the browser
	      driver.quit();

	  }
}
