

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import helpers.Helpers;
import pages.PageLogin;
import pages.PageLogon;
import pages.PageReservation;

 
@Test
public class Tests {
	
	private WebDriver driver;     
	 
    
	@BeforeMethod
	public void setUp() { 
    	DesiredCapabilities caps = DesiredCapabilities.chrome();
    	System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");        
       
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://newtours.demoaut.com/");
        
        try {
        	Thread.sleep(5000);
        }catch(InterruptedException e) {        	
        	e.printStackTrace();
        }
    }
    
	@Test
    public void pruebaUno() {    	
    	PageLogin pageLogin = new PageLogin(driver);
    	PageLogon pageLogon = new PageLogon(driver);    	
    	pageLogin.login("user", "user");
    	pageLogon.assertLogonPage();     	
    }
    
    @Test
    public void pruebaDos() {    	
    	PageLogin pageLogin = new PageLogin(driver);
     	PageReservation pageReservation = new PageReservation(driver);
    	pageLogin.login("mercury", "mercury");
     	pageReservation.assertPage();   
    }
    
    @Test
    public void pruebaTres() {
    	PageLogin pageLogin = new PageLogin(driver);
     	PageReservation pageReservation = new PageReservation(driver);
    	pageLogin.login("mercury", "mercury");
    	pageReservation.selectPassengers(2);
    	pageReservation.selectFromPort(3);    	
    	pageReservation.selectToPort("London");
    }
    
    
	@AfterMethod
	public void tearDown() {
		
		driver.close();
		
	}
	 

}

