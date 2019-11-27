package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class Permission extends BaseTest {
	
	@Test(priority = 0, description = "Empty Add Permission")
    public void EmptyAddPermission(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Empty Add Permission");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .EmptyAddPermission()
            .LogoutPage();
        	Thread.sleep(2000);
        
    }
	@Test(priority = 1, description = "Add Invalid Permission")
    public void InvalidAddPermission(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Invalid Permission");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .InvalidAddPermission()
            .LogoutPage();
        	Thread.sleep(2000);
    }

	@Test(priority = 2, description = "Add Permission")
    public void AddPermission(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Permission");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .AddPermission();
        	Thread.sleep(2000);
    }

}
