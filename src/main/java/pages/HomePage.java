package pages;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
public class HomePage extends BasePage {
 
    /**Constructor*/
    public HomePage(WebDriver driver) {
        super(driver);
    }
 
    /**Variables*/
    String baseURL = "http://localhost:3000";
 
    /**Web Elements*/
    By signInButtonClass = By.className("btnSignIn");
 
    /**Page Methods*/
    public HomePage goToItelli() {
        driver.get(baseURL);
        driver.manage().window().maximize();
        return this;
    }
 
    
    public LoginPage goToLoginPage() {
        return new LoginPage(driver);
    }
}