package tests;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import utils.ExtentReports.ExtentTestManager;

public class Hostinfo extends BaseTest {
	
	@Test(priority = 0, description = "Showing Hostinfo")
    public void HostInfo(Method method) throws InterruptedException {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Showing Hostinfo");
 
        homePage
            .goToItelli()
            .goToLoginPage()
            .loginToItelli("milkrunadmin", "1234")
            .ShowingHostInfo()
            .LogoutPage();
        	Thread.sleep(2000);
        
    }

}
