package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class ReportMenu extends BaseTest {
	
	@Test(priority = 0, description = "Empty Add ReportMenu")
    public void EmptyAddReportMenu(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Empty Add ReportMenu");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .EmptyAddReportMenu()
            .LogoutPage();
        	Thread.sleep(2000);
        
    }

	@Test(priority = 1, description = "Add Invalid ReportMenu")
    public void InvalidAddReportMenu(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Invalid ReportMenu");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .InvalidAddReportMenu()
            .LogoutPage();
        
        	Thread.sleep(2000);
    }

	@Test(priority = 2, description = "Add ReportMenu")
    public void AddReportMenu(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add ReportMenu");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .AddReportMenu();
        	Thread.sleep(2000);
    }


}
