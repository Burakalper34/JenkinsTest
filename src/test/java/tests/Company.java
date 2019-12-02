package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;
public class Company  extends BaseTest {
	@Test(priority = 0, description = "Empty Add Companies")
    public void EmptyAddCompany(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Empty Add Companies");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .EmptyAddCompany()
            .LogoutPage();
        	Thread.sleep(2000);
        
    }

@Test(priority = 1, description = "Add Companies")
	
	public void AddCompany(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Companies");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .AddCompany()
            .LogoutPage();
        	Thread.sleep(3000);
    }

	@Test(priority = 2, description = "Invalid Add Companies")
	
	public void InvalidAddCompany(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Invalid Add Companies");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .InvalidAddCompany()
            .LogoutPage();
        	Thread.sleep(2000);
        
    }
	
	
}
