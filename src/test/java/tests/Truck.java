package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class Truck extends BaseTest {
	
	@Test(priority = 0, description = "Empty Add Truck")
    public void EmptyAddTruck(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Empty Add Truck");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .EmptyAddTruck()
            .LogoutPage();
        	Thread.sleep(2000);
        
    }

	@Test(priority = 1, description = "Add Invalid Truck")
    public void InvalidAddTruck(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Invalid Truck");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .InvalidAddTruck()
            .LogoutPage();
        	Thread.sleep(2000);
        	
    }

	@Test(priority = 2, description = "Add Truck")
    public void AddTruck(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add Truck");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .AddTruck();
        	Thread.sleep(2000);
    }


}
