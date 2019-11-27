package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class Modules extends BaseTest{
	
	@Test(priority = 0, description = "Empty Add Modules")
    public void EmptyAddModules(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Empty Add Modules");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .EmptyAddModule()
            .LogoutPage();
        	Thread.sleep(2000);
        
    }
	@Test(priority = 1, description = "Add Invalid Module")
    public void InvalidAddModules(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Invalid Module");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .InvalidAddModule()
            .LogoutPage();
        	Thread.sleep(2000);
    }

	@Test(priority = 2, description = "Add Module")
    public void AddModules(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Module");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .AddModule();
        	Thread.sleep(2000);
    }


}
