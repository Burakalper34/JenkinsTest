package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class Message_Template extends BaseTest{
	
	@Test(priority = 0, description = "Empty Add Message Template")
    public void EmptyAddMessageTemplate(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Empty Add Message Template");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .EmptyAddMessageTemplate()
            .LogoutPage();
        	Thread.sleep(3000);
        
    }
	@Test(priority = 1, description = "Add Invalid Message Template")
    public void InvalidAddMessageTemplate(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Message Template");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .InvalidAddMessageTemplate()
            .LogoutPage();
        Thread.sleep(2000);
    }

	@Test(priority = 1, description = "Add Message Template")
    public void AddMessageTemplate(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Message Template");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .AddMessageTemplate();
        	Thread.sleep(2000);
    }


}
