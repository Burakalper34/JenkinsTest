package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class Customer_Company extends BaseTest{
	
	@Test(priority = 0, description = "Empty Add Customer Company")
    public void EmptyAddCustomerCompany(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "empty Add Customer Company");
       
        homePage
    
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234") 
            .EmptyAddCustomerCompany()
            .LogoutPage();
            Thread.sleep(2000);
            
    }

	@Test(priority = 1, description = "Add Invalid Customer Company")
    public void InvalidAddCustomerCompany(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Invalid Customer Company");
       
        homePage
    
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234") 
            .InvalidAddCustomerCompany()
            .LogoutPage();
            Thread.sleep(3000);
    }
	@Test(priority = 2, description = "Add Customer Company")
    public void AddCustomerCompany(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Customer Company");
       
        homePage
    
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234") 
            .AddCustomerCompany()
            .LogoutPage();
            Thread.sleep(3000);
    }

}
