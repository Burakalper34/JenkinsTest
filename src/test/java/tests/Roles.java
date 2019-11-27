package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class Roles extends BaseTest {

	@Test(priority = 0, description = "Empty Add Role")
    public void EmptyAddRole(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Empty Add Role");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .EmptyAddRoles()
            .LogoutPage();
        	Thread.sleep(2000);
        
    }

	@Test(priority = 1, description = "Add Invalid Role")
    public void InvalidAddRole(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Invalid Role");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .InvalidAddRoles()
            .LogoutPage();
        	Thread.sleep(2000);
    }

	@Test(priority = 2, description = "Add Role")
    public void AddRole(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Role");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .AddRoles();
        	Thread.sleep(2000);
    }

}
