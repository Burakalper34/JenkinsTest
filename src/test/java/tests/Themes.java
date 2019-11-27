package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class Themes extends BaseTest{
	
	@Test(priority = 0, description = "Empty Add Theme")
    public void EmptyAddTheme(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Empty Add Theme");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .EmptyAddTheme()
            .LogoutPage();
        	Thread.sleep(2000);
        
    }
	@Test(priority = 1, description = "Add Invalid Theme")
    public void InvalidAddTheme(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Invalid Theme");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .InvalidAddTheme()
            .LogoutPage();
        
        	Thread.sleep(2000);
    }

	@Test(priority = 2, description = "Add Theme")
    public void AddTheme(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Theme");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .AddTheme();
        	Thread.sleep(2000);
    }


}
