package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class DimensionSearch extends BaseTest {
	
	@Test(priority = 0, description = "Searching Dimension name")
	public void SearchDimensionName(Method method) throws InterruptedException {
	//ExtentReports Description
	ExtentTestManager.startTest(method.getName(), "Searching Dimension Name");

	homePage

    .goToItelli()
    .goToLoginPage()
    .loginToItelli("milkrunadmin", "1234") 
    .DimensionSearch()
    .LogoutPage();
    Thread.sleep(3000);
    
}

	@Test(priority = 1, description = "Invalid Searching Dimension name")
	public void InvalidSearchDimensionName(Method method) throws InterruptedException {
	//ExtentReports Description
	ExtentTestManager.startTest(method.getName(), "Invalid Searching Dimension Name");

	homePage

    .goToItelli()
    .goToLoginPage()
    .loginToItelli("milkrunadmin", "1234") 
    .InvalidDimensionSearch()
    .LogoutPage();
    Thread.sleep(3000);
    
}

}
