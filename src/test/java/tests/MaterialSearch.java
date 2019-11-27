package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class MaterialSearch extends BaseTest {

	@Test(priority = 0, description = "Searching invalid Material")
	public void InvalidSearchMaterial(Method method) throws InterruptedException {
	//ExtentReports Description
	ExtentTestManager.startTest(method.getName(), "Searching invalid Material");

	homePage

    .goToItelli()
    .goToLoginPage()
    .loginToItelli("milkrunadmin", "1234") 
    .InvalidMaterialSearch()
    .LogoutPage();
    Thread.sleep(3000);
    
}

	
	@Test(priority = 0, description = "Searching Material")
	public void SearchMaterial(Method method) throws InterruptedException {
	//ExtentReports Description
	ExtentTestManager.startTest(method.getName(), "Searching Material");

	homePage

    .goToItelli()
    .goToLoginPage()
    .loginToItelli("milkrunadmin", "1234") 
    .MaterialSearch()
    .LogoutPage();
    Thread.sleep(3000);
    
}


}
