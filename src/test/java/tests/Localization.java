package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class Localization extends BaseTest{
	
	@Test(priority = 0, description = "Empty Add Localization")
    public void EmptyAddLocalization(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Empty Add Localization");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .EmptyAddLocalization()
            .LogoutPage();
        	Thread.sleep(3000);
        
    }
	
	@Test(priority = 1, description = "Add Localization")
    public void AddLocalization(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Localization");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .AddLocalization()
            .LogoutPage();
        	Thread.sleep(3000);
    }


	@Test(priority = 2, description = "Add Invalid InLocalization")
    public void InvalidAddLocalization(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Invalid Localization");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .InvalidAddLocalization()
            .LogoutPage();
        	Thread.sleep(3000);
    }

	

}
