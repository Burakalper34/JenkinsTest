package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class RoleSearch extends BaseTest {

	@Test(priority = 0, description = "Searching Role")
	public void SearchRole(Method method) throws InterruptedException {
	//ExtentReports Description
	ExtentTestManager.startTest(method.getName(), "Searching Role");

	homePage

    .goToItelli()
    .goToLoginPage()
    .loginToItelli("milkrunadmin", "1234") 
    .RoleSearch()
    .LogoutPage();
    Thread.sleep(3000);
    
}

}
