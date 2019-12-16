package test.test;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class App 
{
	
	public static WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
    	System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void afterClass() {
        driver.quit();
    }

    @Test
    public void verifySearchButton() {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("http://localdevweb.rainsoftfn.com/");

        driver.findElement(By.id("btnsubmithomepage")).click();
        
        String title = driver.getTitle();
        
        System.out.println("Title ="+title);
        	
        Assert.assertEquals(title, "Start Your Mortgage Application | Texas Trust Home Loans");      
     
    }
}
