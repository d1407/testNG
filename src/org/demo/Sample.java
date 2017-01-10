package org.demo;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class Sample {
	WebDriver driver;
	
    @Test
    public void doTest1(){
    	
    	String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        
    	WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement go = driver.findElement(By.xpath("//input[@name='btnSignIn']"));
        
        userName.clear();
        password.clear();
        
        userName.sendKeys("ahscaremanager");
        password.sendKeys("Test@123");
        
        go.click();
        
        System.out.println("UserName: " + userName.getText());
        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page witht the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
    }
    
    
    @Test
    public void doTest2(){
        System.out.println("Hello from Test 2");
    }
    @Test
    public void doTest3(){
        System.out.println("Hello from Test 3");
    }
    @Test
    public void doTest4(){
        System.out.println("Hello from Test 4");
    }
    @Test
    public void doTest5(){
        System.out.println("Hello from Test 5");
    }
    
    @BeforeTest
    public void beforeTest() {
  	  	System.setProperty("webdriver.gecko.driver", "/home/parimal/Downloads/geckoDriver/geckodriver");
  		
        driver = new FirefoxDriver();
        String baseUrl = "http://192.168.1.42:8090/texturehealth/#/signIn";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";
        
        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);
    }

    @AfterTest
    public void afterTest() {
  	  driver.close();
  	     // driver.quit();
        System.exit(0);
    }
}
