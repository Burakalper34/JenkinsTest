package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class PendingOrders extends BaseTest {

	@Test(priority = 0, description = "Empty Pending Order Filter")
    public void EmptyPendingOrderFilter(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Empty Pending Order Filter");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("superadmin", "1234")
            .EmptyPendingOrderFilter()
            .LogoutPage();
        	Thread.sleep(2000);
        
    }

	@Test(priority = 1, description = "Add invalid pending orders")
    public void InvalidPendingOrderFilter(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add invalid pending orders");
 
        homePage
        .goToItelli()
        .goToLoginPage()
        .loginToItelli("superadmin", "1234")
        .InvalidPendingOrderFilter()
        .LogoutPage();
    	Thread.sleep(2000);
    
    }

}
