package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class Region extends BaseTest {
	
	@Test(priority = 0, description = "Empty Add Region")
    public void EmptyAddRegion(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Empty Add Region");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .EmptyAddRegion()
            .LogoutPage();
        	Thread.sleep(2000);
 
    }
	
	@Test(priority = 1, description = "Invalid Add Region")
    public void InvalidAddRegion(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Invalid Add Region");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .InvalidAddRegion()
            .LogoutPage();
        	Thread.sleep(2000);
        
    }

	@Test(priority = 2, description = "Add Region")
    public void AddRegion(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Region");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .AddRegion()
            .LogoutPage();
        	Thread.sleep(2000);
        
    }

}
