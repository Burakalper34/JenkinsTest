package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class Packages extends BaseTest {
	
	@Test(priority = 0, description = "Empty Add Package")

		public void EmptyAddPackage(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Empty Add Package");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .EmptyAddPackage()
            .LogoutPage();
        	Thread.sleep(2000);
        
    }
	
	@Test(priority = 1, description = "Add Package")
    public void AddPackage(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Package");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .AddPackage()
            .LogoutPage();
        	Thread.sleep(3000);
    }

	@Test(priority = 2, description = "Add Invalid Package")
    public void InvalidAddPackage(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Invalid Package");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .InvalidAddPackage()
            .LogoutPage();
        	Thread.sleep(3000);
    }

	


}
