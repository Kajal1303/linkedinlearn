package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2twittercom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;//WebDriver is an interface.

		String name;
		int age;


		driver = new ChromeDriver();
		driver.manage().window().maximize();



		//1. Go to the url -  
		driver.get("https://x.com/");

		  List<WebElement> divElements = driver.findElements(By.xpath("//div"));

	        // Print the number of div elements
	        System.out.println("Number of div elements: " + divElements.size());

	        // Close the WebDriver
	        driver.quit();
		}



}

