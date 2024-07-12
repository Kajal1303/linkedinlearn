[1mdiff --git a/MyFirstSeleniumTest.java b/MyFirstSeleniumTest.java[m
[1mdeleted file mode 100644[m
[1mindex 5765afb..0000000[m
[1m--- a/MyFirstSeleniumTest.java[m
[1m+++ /dev/null[m
[36m@@ -1,70 +0,0 @@[m
[31m-package scripts;[m
[31m-[m
[31m-import org.openqa.selenium.By;[m
[31m-import org.openqa.selenium.WebDriver;[m
[31m-import org.openqa.selenium.WebElement;[m
[31m-import org.openqa.selenium.chrome.ChromeDriver;[m
[31m-import org.openqa.selenium.firefox.FirefoxDriver;[m
[31m-[m
[31m-[m
[31m-public class MyFirstSeleniumTest {[m
[31m-[m
[31m-	public static void main(String[] args) {[m
[31m-		// TODO Auto-generated method stub[m
[31m-	   /*[m
[31m-	    * 1. Go to the url - https://nichethyself.com/tourism/home.html[m
[31m-	    * 2. Type username as "stc123"[m
[31m-	    * 3. Type password as "12345"[m
[31m-	    * 4. Submit the form[m
[31m-	    * 5. Verify that after login the page title is "My account"[m
[31m-	    * [m
[31m-	    */[m
[31m-		[m
[31m-		//It opens Chrome Browser.[m
[31m-        WebDriver driver;//WebDriver is an interface.[m
[31m-        String name;[m
[31m-        int age;[m
[31m-        [m
[31m-        driver = new ChromeDriver();[m
[31m-        driver.manage().window().maximize();[m
[31m-        [m
[31m- // driver = new FirefoxDriver();[m
[31m-  //driver.manage().window().maximize();[m
[31m-        [m
[31m- //     driver = new EdgeDriver();[m
[31m-        [m
[31m- //     driver = new SafariDriver();[m
[31m-        [m
[31m-        //1. Go to the url - https://nichethyself.com/tourism/home.html [m
[31m-        driver.get("https://nichethyself.com/tourism/home.html");[m
[31m-        [m
[31m-        //2. Type username as "stc123"[m
[31m-        WebElement user = driver.findElement(By.name("username"));[m
[31m-        user.sendKeys("stc123");[m
[31m-        [m
[31m-     //3. Type password as "12345"[m
[31m-        driver.findElement (By.name("password")).sendKeys("12345");[m
[31m-        [m
[31m-        [m
[31m-     // driver.findElement (By.name("password")).submit();[m
[31m-        //4. Submit the form[m
[31m-        user.submit();[m
[31m-        [m
[31m-        String expectedTitle = "My account";[m
[31m-        String actualTitle = driver.getTitle();[m
[31m-        [m
[31m-        if (expectedTitle.equals(actualTitle)) {[m
[31m-        	System.out.println("Test Passed");[m
[31m-        } else {[m
[31m-        	System.out.println("Test Failed");[m
[31m-        	[m
[31m-        }[m
[31m-        [m
[31m-       [m
[31m-        //close the browser[m
[31m-        driver.quit();[m
[31m-        [m
[31m-	[m
[31m-[m
[31m- }[m
[31m-}[m
\ No newline at end of file[m
