package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPageElementConstants {

    /************BUTON,SPAN,ID,INPUT,STRONG İSİMLERİ*********/
    public static final  String NATIONALITY = "nationality";
    public static final  String TCKNO = "tckimlik";
    
    /**Web Elements*/
    By userNameId = By.id("userName");
    By passwordId = By.name("passWord");
    By loginButtonId = By.id("LoginButton");
    By errorMessageUsernameXpath = By.xpath("//*[@id=\"loginForm\"]/div[1]/div/div");
    By errorMessagePasswordXpath = By.xpath("//*[@id=\"loginForm\"]/div[2]/div/div ");
    By newcreateuser = By.xpath("//*[@id=\"root\"]/div/div/div/main/div[2]/div/div/div[2]/div/div/div/div[1]/div[1]/button");
    By settingsclick = By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/ul/li[1]/a/i");
    By company = By.id("Companies-44");
    By userButton = By.id("Users-5");
    By groups = By.id("Groups-6");
    By FirstName = By.xpath("//*[@id=\"FirstName\"]");
    By LastName = By.xpath("//*[@id=\"LastName\"]");
    By NewUserName = By.id("Username");
    By UserMail = By.id("UserMail");
    By backButton = By.id("back-button");
    By deleteUser = By.xpath("//*[@id=\"root\"]/div/div/div/main/div[2]/div/div/div[2]/table/tbody/tr[6]/td[6]/button[2]/span");
    By createUserButton = By.xpath("//*[@id=\"CreateNewUser\"]");
    By confirmButton = By.xpath("//*[contains(text(), 'Ok')]"); 
    By editUser = By.xpath("//*[@id=\"Edit-170\"]/span/i");
    By updateUser = By.xpath("//*[@id=\"root\"]/div/div/div/main/div[2]/div/div/div[1]/div[2]/div[6]/div[3]/div/button");
    By logoutButtonClick=By.xpath("//*[@id=\"root\"]/div/div/div/header/ul[2]/li[4]/a/img");
    By logoutButtonXpath=By.xpath("//*[@id=\"root\"]/div/div/div/header/ul[2]/li[4]/div/button[3]");
    By addgroup = By.id("Add Group");
    By newgroup = By.xpath("//*[@id=\"OneInputAction\"]");
    By cancel = By.xpath("//*[contains(text(), 'Cancel')]");
    By groupname = By.id("GroupName");
    By roles = By.id("Roles-7");
    By newroles =By.xpath("/html/body/div[2]/div/div[3]/div/div[3]/div[1]/div/div/div/span");
    By addroles = By.xpath("//*[@id=\"root\"]/div/div/div/div/main/div[2]/div/div/div/div[2]/div/div[4]/div/div/div[3]/div[1]/div/div/div/i");
    By rolename = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div/div/div/div/div[1]");
    By permission = By.id("Permissions-21");
    By localization = By.id("Localization-41");
    By milkrun = By.xpath("//*[contains(text(), 'MilkRun')]");
    By dimension = By.id("Dimensions-57");
    By addDimension = By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div");
    By save = By.xpath("//*[contains(text(), 'Save')]");
    By DimensionName = By.xpath("//input[@role='textbox']");
    By Dim = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div/div/div");
    By DimensionWidth = By.id("dx_dx-bac2fcef-a876-c6b0-94d8-98aed40272ca_width");
    By DimensionHeight = By.id("dx_dx-bac2fcef-a876-c6b0-94d8-98aed40272ca_height");
    By DimensionLenght = By.id("dx_dx-bac2fcef-a876-c6b0-94d8-98aed40272ca_lenght");
    By DimensionCancel = By.xpath("//*[contains(text(), 'Cancel')]");
    By DimensionDelete = By.xpath("//*[@title=\"Delete\"]");
    By DimensionEdit = By.xpath("//*[@id=\"grid-container\"]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[6]/a[1]");
    By DimensionSearch = By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div/table/tbody/tr[2]/td[1]/div/div[2]/div/div/div[1]/input");
    By DimensionSearchDate = By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div/table/tbody/tr[2]/td[5]/div/div[2]/div/div/div/div[1]/input");
    By material = By.id("Materials-59");
    By truck = By.id("Trucks-58");
    By TruckSearch = By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div/table/tbody/tr[2]/td[1]/div/div[2]/div/div/div[1]/input");
    By TruckSearchDate = By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div/table/tbody/tr[2]/td[5]/div/div[2]/div/div/div/div[1]/input");
    By distance = By.id("DistanceDefinitions-61");
    By distanceSearch = By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div/table/tbody/tr[2]/td[1]/div/div/div/div[1]/div/div[1]/input");
    By distanceSearchDate = By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div/table/tbody/tr[2]/td[4]/div/div[2]/div/div/div/div[1]/input");
    By edit = By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/div/div");
    
    
}
 