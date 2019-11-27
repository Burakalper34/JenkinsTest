package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class OrderMaterialSearch extends BaseTest {
	
	@Test(priority = 0, description = "Invalid Order Material Search")
    public void InvalidOrderMaterialSearch(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Invalid Order Material Search");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .InvalidOrderMaterialSearch()
            .LogoutPage();
        	Thread.sleep(2000);
        
    }

	@Test(priority = 1, description = "Order Material Search")
    public void OrderMaterialSearch(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Order Material Search");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .OrderMaterialSearch();
        	Thread.sleep(2000);
    }



}
