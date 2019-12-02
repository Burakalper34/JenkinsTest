package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class Group extends BaseTest {

	@Test(priority = 0, description = "Empty Add Group")
    public void EmptyAddGroup(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Empty Add Group");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .EmptyAddGroup()
            .LogoutPage();
        	Thread.sleep(2000);
        
    }
	
	@Test(priority = 1, description = "Add Group")
    public void AddGroup(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Group");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .AddGroup()
            .LogoutPage();
        	Thread.sleep(3000);
    }

	@Test(priority = 2, description = "Add Invalid Group")
    public void InvalidAddGroup(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Invalid Group");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .InvalidAddGroup()
            .LogoutPage();
        	Thread.sleep(2000);
    }


}
