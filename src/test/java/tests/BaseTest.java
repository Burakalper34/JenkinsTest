package tests;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import pages.HomePage;
 
public class BaseTest {
    public WebDriver driver;
    public HomePage homePage;
 
    public WebDriver getDriver() {
        return driver;
    }
 
    @BeforeClass
    @Parameters("browser")
    public void verifypageTitle(String browserName) {
    	if (browserName.equalsIgnoreCase("firefox")) {
    		System.setProperty("webdriver.gecko.driver", "C:\\Uygulamalar\\geckodriver.exe");
            
    		driver =new FirefoxDriver();
    	}
    	else if (browserName.equalsIgnoreCase("chrome")) {
        	
    	System.setProperty("webdriver.chrome.driver", "C:\\Uygulamalar\\chromedriver.exe");
        driver = new ChromeDriver();
    	}
    	else if (browserName.equalsIgnoreCase("internet")) {
    		System.setProperty("webdriver.ie.driver", "C:\\Uygulamalar\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
    	}
    	
    }
 
    @BeforeMethod
    public void methodLevelSetup() {
        homePage = new HomePage(driver);
    }
 
    @AfterClass
    public void teardown() {
        driver.quit();
    }
}