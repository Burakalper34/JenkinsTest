package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class CompanyAdress extends BaseTest {
	
	@Test(priority = 0, description = "Empty Add Company Adress")
    public void EmptyAddCompanyAdress(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "empty Add Company Adress");
       
        homePage
    
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234") 
            .EmptyAddCompanyAdress()
            .LogoutPage();
            Thread.sleep(2000);
            
    }
	
	@Test(priority = 1, description = "Invalid Add Company Adress")
    public void InvalidAddCompanyAdress(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "invalid Add Company Adress");
       
        homePage
    
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234") 
            .InvalidAddCompanyAdress()
            .LogoutPage();
            Thread.sleep(2000);
            
    }
	

	@Test(priority = 2, description = "Add Company Adress")
    public void AddCompanyAdress(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Company Adress");
       
        homePage
    
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234") 
            .AddCompanyAdress()
            .LogoutPage();
            Thread.sleep(3000);
    }


}
