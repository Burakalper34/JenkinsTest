package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class PackageSearch extends BaseTest {
	
	@Test(priority = 0, description = "Empty Add Package")

	public void PackageSearchh(Method method) throws InterruptedException {
    //ExtentReports Description
    ExtentTestManager.startTest(method.getName(), "Package Search Item");

    homePage
        .goToItelli()
        .goToLoginPage()
        .loginToItelli("milkrunadmin", "1234")
        .PackageSearch()
        .LogoutPage();
    	Thread.sleep(2000);
    
}




}
