package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class Contacts extends BaseTest {
	
	
	@Test(priority = 0, description = "Empty Add Contact")
	public void EmptyAddContacts(Method method) throws InterruptedException {
	//ExtentReports Description
	ExtentTestManager.startTest(method.getName(), "empty Add Contact");

	homePage

    .goToItelli()
    .goToLoginPage()
    .loginToItelli("milkrunadmin", "1234") 
    .EmptyAddContacts()
    .LogoutPage();
    Thread.sleep(3000);
    
}
	@Test(priority = 1, description = "Successfully Add Contact")
	public void AddContact(Method method) throws InterruptedException {
	      
	   homePage
	   .goToItelli()
	   .goToLoginPage()
	   .loginToItelli("milkrunadmin", "1234")
	   .AddContact()
	   .LogoutPage();
	    Thread.sleep(3000);
	}

	@Test(priority = 2, description = "Invalid Add Contact")
	public void InvalidAddContact(Method method) throws InterruptedException {
	      
	   homePage
	   .goToItelli()
	   .goToLoginPage()
	   .loginToItelli("milkrunadmin", "1234")
	   .InvalidAddContact()
	   .LogoutPage();
	   Thread.sleep(3000);
	}



}
