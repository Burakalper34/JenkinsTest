package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class Login extends BaseTest {
	
	@Test(priority = 0, description = "Empty Login")
	public void EmptyLogin(Method method) throws InterruptedException {
	//ExtentReports Description
	ExtentTestManager.startTest(method.getName(), "empty Login");

	homePage

    .goToItelli()
    .goToLoginPage()
    .loginToItelli("", "") 
    .LogoutPage();
    Thread.sleep(3000);
    
}

	@Test(priority = 1, description = "Invalid Login")
	public void InvalidLogin(Method method) throws InterruptedException {
	      
	   homePage
	   .goToItelli()
	   .goToLoginPage()
	   .loginToItelli("test", "123456")
	   .LogoutPage();
	   Thread.sleep(2000);
	}
	
	@Test(priority = 2, description = "Login")
	public void Login(Method method) throws InterruptedException {
	      
	   homePage
	   .goToItelli()
	   .goToLoginPage()
	   .loginToItelli("milkrunadmin", "1234")
	   .LogoutPage();
	   Thread.sleep(2000);
	}
	

}
