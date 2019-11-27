package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class PalletDefinition extends BaseTest {
	
	@Test(priority = 0, description = "Empty Add Pallet")

	public void EmptyAddPallet(Method method) throws InterruptedException {
    //ExtentReports Description
    ExtentTestManager.startTest(method.getName(), "Empty Add Pallet Definition");

    homePage
        .goToItelli()
        .goToLoginPage()
        .loginToItelli("milkrunadmin", "1234")
        .EmptyAddPalletDefiniton()
        .LogoutPage();
    	Thread.sleep(3000);
    
}

	@Test(priority = 1, description = "Invalid Add Pallet Definition")

	public void InvalidAddPallet(Method method) throws InterruptedException {
    //ExtentReports Description
    ExtentTestManager.startTest(method.getName(), "Invalid Add Pallet Definition");

    homePage
        .goToItelli()
        .goToLoginPage()
        .loginToItelli("milkrunadmin", "1234")
        .InvalidAddPalletDefiniton()
        .LogoutPage();
    	Thread.sleep(2000);
    
}

	@Test(priority = 2, description = "Add Pallet Definition")

	public void AddPallet(Method method) throws InterruptedException {
    //ExtentReports Description
    ExtentTestManager.startTest(method.getName(), "Add Pallet Definition");

    homePage
        .goToItelli()
        .goToLoginPage()
        .loginToItelli("milkrunadmin", "1234")
        .AddPalletDefiniton()
        .LogoutPage();
    	Thread.sleep(2000);
    
}

}
