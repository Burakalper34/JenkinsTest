package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class LoadingDuration extends BaseTest {
	
	@Test(priority = 0, description = "Empty Add LoadingDuration")
    public void EmptyAddGroup(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Empty Add Loading Duration");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .EmptyAddLoadingDuration()
            .LogoutPage();
        	Thread.sleep(3000);
        
    }
	
	@Test(priority = 1, description = "Add Loading Duration")
    public void AddLoadingDuration(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Loading Duration");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .AddLoadingDuration()
            .LogoutPage();
        	Thread.sleep(3000);
    }

	@Test(priority = 2, description = "Add Invalid Loading Duration")
    public void InvalidAddLoadingDuration(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Invalid Loading Duration");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .InvalidAddLoadingDuration()
            .LogoutPage();
        	Thread.sleep(3000);
    }

	

}
