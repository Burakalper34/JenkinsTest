package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class ReportDefinition extends BaseTest {
	
	@Test(priority = 0, description = "Empty Add ReportDefinition")
    public void EmptyAddReportDefinition(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Empty Add ReportDefinition");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .EmptyAddReportDefinition()
            .LogoutPage();
        	Thread.sleep(3000);
        
        	
    }

	@Test(priority = 1, description = "Invalid Add ReportDefinition")
    public void InvalidAddReportDefinition(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Invalid Add ReportDefinition");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .InvalidAddReportDefinition()
            .LogoutPage();
        	Thread.sleep(3000);
        
    }

	@Test(priority = 2, description = "Add ReportDefinition")
    public void AddReportDefinition(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Invalid Add ReportDefinition");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .AddReportDefinition()
            .LogoutPage();
        	Thread.sleep(2000);
        
    }

}
