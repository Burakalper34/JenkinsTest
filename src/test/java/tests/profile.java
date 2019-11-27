package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class profile extends BaseTest {

	@Test(priority = 0, description = "Adding item in Profile")
    public void ProfileItem(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Adding item in Profile");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .ShowingProfile()
            .LogoutPage();
        	Thread.sleep(2000);
        
    }
}
