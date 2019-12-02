package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class Driver extends BaseTest {
	
	@Test(priority = 0, description = "Empty Add Driver")
    public void EmptyAddDriver(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Empty Add Driver");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .EmptyAddDrivers()
            .LogoutPage();
        	Thread.sleep(3000);
        
    }
	
	@Test(priority = 1, description = "Add Driver")
    public void AddDriver(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Driver");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .AddDrivers()
            .LogoutPage();
        	Thread.sleep(3000);
    }


	@Test(priority = 2, description = "Add Invalid Driver")
    public void InvalidAddDriver(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Invalid Driver");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .InvalidAddDrivers()
            .LogoutPage();
        	Thread.sleep(3000);
    }

	

	
}
