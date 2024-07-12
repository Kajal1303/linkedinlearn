package scripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;

public class DragDrop {
	
		
		private WebDriver driver;
		private StringBuffer verificationErrors = new StringBuffer();
		
		@BeforeMethod (alwaysRun = true)
		public void setUp()
		{
			driver = new ChromeDriver();
		}
		
		@Test (priority = 2, description = "This test has sme problems related to Explicit wait", enabled = false)
		public void testDragDrop1() throws InterruptedException {
		}
		
		
		@Test (priority = 1, timeOut =1000, alwaysRun = true, description = " This test checks the drag and drop funtionality", enabled = true)
		public void testDragDrop() throws InterruptedException {
			
			driver.get("http://www.cookbook.seleniumacademy.com/DragDropDemo.html");
			
			WebElement source = driver.findElement(By.id("draggable"));
			WebElement target = driver.findElement(By.id("droppable"));
			Actions builder = new Actions(driver);//Builder design Pattern
			builder.dragAndDrop(source, target).perform();
			
		//	builder.perform();
			Thread.sleep(5000);
			/*
			 * builder.moveToElement(source).dragAndDrop(source,target).contextClick(source)
			 * .build(); builder.contextClick(source).perform(); builder.perform();
			 * builder.perform();
			 */
				   
	/*	
	 * 	
			if () 
				 builder.doubleClick().build();
			else
				builder.click().build();
			builder.perform();
	*/		
			//builder.
		
		/*	builder.dragAndDrop(source, target)
			   .moveToElement(source)
			   .contextClick(source)
			   .click()
			   .sendKeys("niche").build();;*/
			
		/*	builder.click().build();
			builder.dragAndDrop(source, target).build();
			
			builder.perform();
			*/
			

			
			
			try
			{
				System.out.println(target.getText());
				AssertJUnit.assertEquals("Dropped!", target.getText());
				
			} catch (Error e) {
				verificationErrors.append(e.toString());
			}
		}
		@BeforeSuite
		public void beforeSuite() {
			System.out.println("Before Suite in the Drag and drop");
			//Setup of DB connectio
			//Add data to DB
		}
		
		@AfterSuite
		public void afterSuite() {
			System.out.println("After Suite in teh Drag and Drop ");
		}
		
		@BeforeTest
		public void beforeTest() {
			System.out.println("Before Test in Drag and Drop test");
			//Before Regression group do some setup
		}
		
		@AfterTest
		public void afterTest() {
			System.out.println("After Test in the Drag and Drop test");
		}
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
			String verificationErrorString = verificationErrors.toString();
			if (!"".equals(verificationErrorString)) {
				Assert.fail(verificationErrorString);
			}
		}
}


