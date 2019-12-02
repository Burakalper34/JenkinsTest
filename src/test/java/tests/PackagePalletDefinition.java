package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class PackagePalletDefinition extends BaseTest {

	@Test(priority = 0, description = "Empty Add Package Pallet Definition")

	public void EmptyAddPackagePallet(Method method) throws InterruptedException {
    //ExtentReports Description
    ExtentTestManager.startTest(method.getName(), "Empty Add Package Pallet Definition");

    homePage
        .goToItelli()
        .goToLoginPage()
        .loginToItelli("milkrunadmin", "1234")
        .EmptyAddPackagePalletDefiniton()
        .LogoutPage();
    	Thread.sleep(3000);
    
}
	
	@Test(priority = 1, description = "Add Package Pallet Definition")

	public void AddPackagePallet(Method method) throws InterruptedException {
    //ExtentReports Description
    ExtentTestManager.startTest(method.getName(), "Add Package Pallet Definition");

    homePage
        .goToItelli()
        .goToLoginPage()
        .loginToItelli("milkrunadmin", "1234")
        .AddPackagePalletDefiniton()
        .LogoutPage();
    	Thread.sleep(3000);
    
}

	
	@Test(priority = 2, description = "Invalid Add Package Pallet Definition")

	public void InvalidAddPackagePallet(Method method) throws InterruptedException {
    //ExtentReports Description
    ExtentTestManager.startTest(method.getName(), "Invalid Add Package Pallet Definition");

    homePage
        .goToItelli()
        .goToLoginPage()
        .loginToItelli("milkrunadmin", "1234")
        .InvalidAddPackagePalletDefiniton()
        .LogoutPage();
    	Thread.sleep(3000);
    
}


}
