package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class User extends BaseTest{

	@Test(priority = 0, description = "Empty Add User")
    public void EmptyAddUser(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Empty Add User");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .EmptyAddUser()
            .LogoutPage();
        	Thread.sleep(3000); 
        	
    }

	@Test(priority = 1, description = "Invalid Add User")
    public void InvalidAddUser(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Invalid Add User");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .InvalidAddUser()
            .LogoutPage();
        	Thread.sleep(3000);
        	
    }

	@Test(priority = 2, description = "Successful Add User")
    public void AddUser(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Successful Add User");
        homePage
            .goToItelli()
            .goToLoginPage()         
            .loginToItelli("milkrunadmin", "1234")
            .CreateUser();
        	Thread.sleep(3000);
        	
    }
}
