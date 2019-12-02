package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class Languages extends BaseTest{
	
	@Test(priority = 0, description = "Empty Add Language")
    public void EmptyAddLanguage(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Empty Add Language");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .EmptyAddLanguage()
            .LogoutPage();
        	Thread.sleep(2000);
        
    }
	
	@Test(priority = 1, description = "Add Language")
    public void AddLanguage(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Language");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .AddLanguage()
            .LogoutPage();
        	Thread.sleep(3000);
    }

	@Test(priority = 2, description = "Add Invalid Language")
    public void InvalidAddLanguage(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Language");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .InvalidAddLanguage()
            .LogoutPage();
        	Thread.sleep(3000);
    }
	



}
