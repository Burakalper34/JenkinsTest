package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class Countries extends BaseTest{
	
	@Test(priority = 0, description = "Empty Add Countries")
    public void EmptyAddCountries(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Empty Add Countries");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .EmptyAddCountry()
            .LogoutPage();
        	Thread.sleep(3000);
        
    }

	@Test(priority = 1, description = "Add Country")
    public void AddCountry(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Country");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .AddCountry()
            .LogoutPage();
        	Thread.sleep(3000);
    }

	@Test(priority = 2, description = "Add Invalid Country")
    public void InvalidAddCountry(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Invalid Country");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .InvalidAddCountry()
            .LogoutPage();
        	Thread.sleep(3000);
    }

	

}
