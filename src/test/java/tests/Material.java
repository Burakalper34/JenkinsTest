package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class Material extends BaseTest {
	
	@Test(priority = 0, description = "Empty Add Material")
	public void EmptyAddMaterial(Method method) throws InterruptedException {
	//ExtentReports Description
	ExtentTestManager.startTest(method.getName(), "Empty Add Material");

	homePage

    .goToItelli()
    .goToLoginPage()
    .loginToItelli("milkrunadmin", "1234") 
    .EmptyAddMaterial()
    .LogoutPage();
    Thread.sleep(3000);
    
}

	@Test(priority = 1, description = "Invalid Add Material")
	public void InvalidAddMaterial(Method method) throws InterruptedException {
	//ExtentReports Description
	ExtentTestManager.startTest(method.getName(), "Invalid Add Material");

	homePage

    .goToItelli()
    .goToLoginPage()
    .loginToItelli("milkrunadmin", "1234") 
    .InvalidAddMaterial()
    .LogoutPage();
    Thread.sleep(3000);
    
}

	@Test(priority = 2, description = "Add Material")
	public void AddMaterial(Method method) throws InterruptedException {
	//ExtentReports Description
	ExtentTestManager.startTest(method.getName(), "Add Material");

	homePage

    .goToItelli()
    .goToLoginPage()
    .loginToItelli("milkrunadmin", "1234") 
    .AddMaterial();
    Thread.sleep(3000);
    
}

}
