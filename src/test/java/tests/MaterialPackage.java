package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class MaterialPackage extends BaseTest {
	
	@Test(priority = 0, description = "Empty Add MaterialPackage")
    public void EmptyAddMaterialPackage(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Empty Add MaterialPackage");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .EmptyAddMaterial_Package()
            .LogoutPage();
        	Thread.sleep(3000);
        
        	
    }

	@Test(priority = 1, description = "Invalid Add MaterialPackage")
    public void InvalidAddMaterialPackage(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Invalid Add MaterialPackage");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .InvalidAddMaterial_Package()
            .LogoutPage();
        	Thread.sleep(3000);
        
    }

	@Test(priority = 2, description = "Add MaterialPackage")
    public void AddMaterialPackage(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Add MaterialPackage");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .AddMaterial_Package();
           
        	Thread.sleep(3000);
        
    }

}
