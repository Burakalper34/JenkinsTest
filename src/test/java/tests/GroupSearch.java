package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class GroupSearch extends BaseTest {

	@Test(priority = 0, description = "Searching Group name")
	public void SearchGroupName(Method method) throws InterruptedException {
	//ExtentReports Description
	ExtentTestManager.startTest(method.getName(), "Searching GroupName");

	homePage

    .goToItelli()
    .goToLoginPage()
    .loginToItelli("milkrunadmin", "1234") 
    .GroupSearch()
    .LogoutPage();
    Thread.sleep(3000);
    
}

}
