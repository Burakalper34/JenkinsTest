package pages;
 
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


 
public class LoginPage extends BasePage {
	 	By userNameId = By.id("userName");
	    By passwordId = By.name("passWord");
	    By loginButtonId = By.id("LoginButton");
	    By errorMessageUsernameXpath = By.xpath("//*[@id=\"loginForm\"]/div[1]/div/div");
	    By errorMessagePasswordXpath = By.xpath("//*[@id=\"loginForm\"]/div[2]/div/div ");
	    By newcreateuser = By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By settingsclick = By.xpath("//*[contains(text(), 'Settings')]");
	    
	    
	    By company = By.id("Companies-90");
	    By addCompany = By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By CompanyName = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div/div[1]/input");
	    
	    By users = By.id("Users-86");
	    By userSearchName = By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div[2]/table/tbody/tr[2]/td[1]/div/div[2]/div/div/div[1]/input");
	    By userSearchMail = By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div[2]/table/tbody/tr[2]/td[5]/div/div[2]/div/div/div[1]/input");
	    
	    By groups = By.id("Groups-87");
	    By addGroup = By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By groupdelete = By.xpath("//*[@id=\"grid-container\"]/div/div[6]/div[2]/table/tbody/tr[3]/td[2]/a[2]");
	    By groupyes = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div");
	    By FirstName = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By LastName = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div[1]/input");
	    By NewUserName = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By UserCellPhone = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[5]/div/div[2]/div/div/div/div/div/div[1]/input");
	    By UserMail = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[5]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By UserDescription = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[7]/div/div[2]/div/div/div/div/div/div[1]/input");
	    By UserFax = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[7]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By UserPhone = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[9]/div/div/div/div/div[1]/div[1]/input");
	    By UserExtension = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[6]/div/div[2]/div/div/div/div/div/div[1]/input");
	    By backButton = By.id("back-button");
	    By deleteUser = By.xpath("//*[@id=\"grid-container\"]/div/div[6]/div[2]/table/tbody/tr[6]/td[2]/a[2]");
	    
	    By confirmButton = By.xpath("//*[contains(text(), 'Ok')]"); 
	    By editUser = By.xpath("//*[@id=\"Edit-170\"]/span/i");
	    By updateUser = By.xpath("//*[@id=\"root\"]/div/div/div/main/div[2]/div/div/div[1]/div[2]/div[6]/div[3]/div/button");
	    By logoutButtonClick=By.xpath("//*[@id=\"avatar-header\"]");
	    By logoutButtonXpath=By.xpath("//*[@id=\"root\"]/div/div/div/div/header/ul/li[2]/div/button[4]");
	    By newgroup = By.xpath("//*[@id=\"OneInputAction\"]");
	    By cancel = By.xpath("/html/body/div[2]/div/div[3]/div/div[3]/div[2]/div/div/div/span");
	    By groupname = By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div[2]/table/tbody/tr[2]/td[1]/div/div[2]/div/div/div[1]/input");
	    By roles = By.id("Roles-88");
	    By newroles =By.xpath("/html/body/div[2]/div/div[3]/div/div[3]/div[1]/div/div/div/span");
	    By addroles = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By rolename = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div/div[1]/input");
	    By deleterole = By.xpath("//*[@id=\"grid-container\"]/div/div[6]/div[2]/table/tbody/tr[5]/td[2]/a[2]");
	    By roleyes = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/span");
	    
	    By permission = By.id("Permissions-110");
	    By addPermission = By.xpath("//*[@id=\"root\"]/div/div/div/div/div/main/div/div/div/div/div/div/div/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	   
	    By localization = By.id("Localization-89");
	    By addLocalization = By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div");
	    By localizationResourceValue = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div[1]/input");
	    By localizationResourceName = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By localizationLanguage = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div");
	    By localizationSearchResourceN = By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div[2]/table/tbody/tr[2]/td[3]/div/div[2]/div/div/div[1]/input");
	    By localizationDelete = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[6]/div[2]/table/tbody/tr[9]/td[2]/a[2]");
	    By localizationYes = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div");
	    
	    By milkrun = By.id("MilkRun-151");
	    By tecedekor = By.xpath("//*[contains(text(), 'Tece Dekor')]");
	    By orders = By.id("Orders-79");
	    By Order = By.id("Orders-145");
	    By definitions = By.id("Definitions-147");
	    By definitionsportal = By.id("Portal-149");
	    By portal = By.xpath("//*[@id=\"Portal\"]/a/i");
	    By dimension = By.id("Dimensions-69");
	    
	    By addDimension = By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By save = By.xpath("//*[contains(text(), 'Save')]");
	    By DimensionName = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By Dim = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div/div/div");
	    By DimensionWidth = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div[1]/input");
	    By DimensionHeight = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By DimensionLenght = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div[1]/input");
	    By DimensionCancel = By.xpath("//*[contains(text(), 'Cancel')]");
	    By DimensionDelete = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[6]/div[2]/table/tbody/tr[9]/td[2]/a[2]");
	    By DimensionYes = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div");
	    By DimensionEdit = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[6]/div/table/tbody/tr[2]/td[5]/a[1]");
	    By DimensionSearch = By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div/table/tbody/tr[2]/td[1]/div/div[2]/div/div/div[1]/input");
	    By DimensionSearchDate = By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div/table/tbody/tr[2]/td[5]/div/div[2]/div/div/div/div[1]/input");
	    By material = By.id("Materials-71");
	    By materialEdit =By.xpath("//*[@id=\"grid-container\"]/div[1]/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/a[1]");
	    By materialSearch = By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div/table/tbody/tr[2]/td[1]/div/div[2]/div/div/div[1]/input");
	    By materialSearchCode = By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div/table/tbody/tr[2]/td[2]/div/div[2]/div/div/div[1]/input");
	    By truck = By.id("Trucks-70");
	    By truckPlate = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By TruckSearch = By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div/table/tbody/tr[2]/td[1]/div/div[2]/div/div/div[1]/input");
	    By TruckSearchDate = By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div/table/tbody/tr[2]/td[5]/div/div[2]/div/div/div/div[1]/input");
	    By addTruck = By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By editTruck = By.xpath("//*[@id=\"grid-container\"]/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/a[1]");
	    By DeleteTruck = By.xpath("//*[@id=\"grid-container\"]/div/div[6]/div[2]/table/tbody/tr[6]/td[2]/a[2]");
	    By TruckYes = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/span");	    
	    By distance = By.id("DistanceDefinitions-163");
	    By distanceSearchDistance = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[5]/div/table/tbody/tr[2]/td[3]/div/div[2]/div/div/div[1]/input");
	    By DistanceDelete = By.xpath("//*[@id=\"grid-container\"]/div/div[6]/div[2]/table/tbody/tr[2]/td[2]/a[2]");
	    By DistanceYes = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/span");
	    
	    By edit = By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/div/div");
	    By material_packmaterialSearchDateage = By.id("MaterialPackageDefinitions-56");
	    By material_package =By.id("MaterialPackageDefinitions-165");
	    By AddMaterial_package = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By EditMaterial_package = By.xpath("//*[@id=\"grid-container\"]/div/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[6]/a[1]");
	    By MaterialPackageName = By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By MaterialPackageCode = By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By MaterialPackageWeight = By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div[1]/input");
	    By Min_Qty = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By Max_Qty = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div[1]/input");
	    By MaterialPackageDelete = By.xpath("//*[@id=\"grid-container\"]/div/div[6]/div[2]/table/tbody/tr[8]/td[2]/a[2]");
	    By MaterialPackageYes = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div");
	    
	    By addDistance = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By editDistance = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[5]/a[1]");
	    By To_Company_Name = By.xpath("//*[@id=\"dx-6c650dac-ab1e-e1ae-2940-9288390b4a77\"]/div[1]/div/div[1]/div[2]/div[1]/div");
	    By OrderDateChoose = By.xpath("//*[@id=\"dx-88e1778c-8a84-e5e8-b748-5ccb8d764b89\"]/div/div[1]/div/div/div/div[1]/div/div[1]/table/tbody/tr[4]/td[4]");
	    By palletdefinition = By.id("PalletDefinitions-161");
	    By addPalletDefinition = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By PalletDefinitionName= By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By PalletDefinitionWeight = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div[1]/input");
	    By PalletDefinitionCode = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By PalletDefinitionDescription = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div[1]/input");
	    By PalletDefinitionDimension = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[3]/div/div[1]/div/div/div/div");
	    By PalletDefinitionDelete = By.xpath("//*[@id=\"grid-container\"]/div/div[6]/div[2]/table/tbody/tr[4]/td[2]/a[2]");
	    By PalletDefinitionYes = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div");
	    
	    By palletdefinitionEdit = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[6]/div/div/div[1]/div/table/tbody/tr[1]/td[7]/a[1]");
	    By palletdefinitionS = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[5]/div/table/tbody/tr[2]/td[2]/div/div[2]/div/div/div[1]/input");
	    By palletdefinitionD = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[5]/div/table/tbody/tr[2]/td[5]/div/div[2]/div/div/div[1]/input");
	    
	    By packages = By.id("Packages-72");
	    By addPackages = By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[2]/div/div/div/i");
	    By packagesEdit = By.xpath("//*[@title=\"Edit\"]");
	    By packagesName =By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By packagesCode =By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By packagesWeight =By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div[1]/input");
	    By packageSearchName = By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div[2]/table/tbody/tr[2]/td[1]/div/div[2]/div/div/div[1]/input");
	    By PackageDelete = By.xpath("//*[@id=\"grid-container\"]/div/div[6]/div[2]/table/tbody/tr[6]/td[2]/a[2]");
	    By PackageYes = By.xpath("/html/body/div[3]/div/div/div[2]/div/div[2]/div[1]/div/div/div");
	    
	    By drivers = By.id("TruckContacts-75");
	    By addDrivers = By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By DriverDelete = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[6]/div[2]/table/tbody/tr[3]/td[2]/a[2]");
	    By DriverYes = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div");
	    
	    By DriversCompanyName = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div");
	    
	    By ordermaterials = By.id("OrderMaterials");
	    By addOrderMaterials = By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div");
	    By ordermaterialshow = By.xpath("//*[@id=\"grid-container\"]/div/div[6]/div[2]/table/tbody/tr[2]/td[2]/a");
	    
	    By routing = By.id("RoutingDefinitions");
	    By addRouting = By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By routingName = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By routingDefinition = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div[1]/input"); 
	    By routingsearch =By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div/table/tbody/tr[2]/td[2]/div/div[2]/div/div/div[1]/input");
	    By routingedit = By.xpath("//*[@id=\"grid-container\"]/div/div[6]/div/table/tbody/tr[1]/td[6]/a[1]");
	    By routingdelete = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[6]/div/table/tbody/tr[1]/td[6]/a[2]");
	    
	    By orderpackage = By.xpath("//*[@id=\"order-details\"]/div/ul/li[2]/a");
	    By orderPackageName = By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div/table/tbody/tr[2]/td[1]/div/div[2]/div/div/div[1]/input");
	    By orderpackageSearch = By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div/table/tbody/tr[2]/td[1]/div/div[2]/div/div/div[1]/input");
	    By orderpackageWeight = By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div/table/tbody/tr[2]/td[5]/div/div[2]/div/div/div[1]/input");
	    
	    By ordertruck = By.id("OrderTrucks");  
	    By addOrderTruck = By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    
	    By orderpallet = By.id("OrderPallets");
	    By addOrderPallet = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    
	    By loadingduration = By.id("LoadingDurations-78");
	    By addLoadingDuration = By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By LoadingDelete = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[6]/div[2]/table/tbody/tr[1]/td[2]/a[2]");
	    By LoadingYes = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div");
	    
	    By themes = By.id("Themes-101");
	    
	    By addThemes = By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By ThemeName = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div/div[1]/input");
	    By ThemeLogoName = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div[1]/input");
	    By ThemeSearchName = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[5]/div[2]/table/tbody/tr[2]/td[1]/div/div[2]/div/div/div[1]/input");
	    
	    By domain = By.id("Domains-92");
	    By addDomain =By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By domainUrl = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div/div[1]/input");	
	    By domainDelete = By.xpath("//*[@id=\"grid-container\"]/div/div[6]/div[2]/table/tbody/tr[4]/td[2]/a[2]");
	    By domainYes = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/span");
	    
	    By permissionname = By.id("PermissionNames-74");
	    By addPermissionName = By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    
	    By messagetemplate = By.id("MessageTemplates-102");
	    By addMessageTemplate = By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By messageTemplateName = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By messageTemplateSubject = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div[1]/input");
	    By messageTemplateBody = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div[1]/textarea");
	    By messageTemplateSearchName = By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div[2]/table/tbody/tr[2]/td[1]/div/div[2]/div/div/div[1]/input");
	    
	    
	    By languages = By.id("Languages-93");
	    By addLanguage = By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By LanguageName = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By LanguageCulture = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div[1]/input");
	    By LanguageFlag = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By LanguageSearchName = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[5]/div[2]/table/tbody/tr[2]/td[2]/div/div[2]/div/div/div[1]/input");
	    By languageDelete = By.xpath("//*[@id=\"grid-container\"]/div/div[6]/div[2]/table/tbody/tr[3]/td[2]/a[2]");
	    By languageYes = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div");
	    
	    By customercompany = By.id("Companies-94");
	    By addCustomerCompany = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By customercompanyName = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By customercompanyWebsite = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div[1]/input");
	    By customercompanyLogo = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[3]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By customercompanyType = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div");
	    By customercompanydelete = By.xpath("//*[@id=\"grid-container\"]/div/div[6]/div[2]/table/tbody/tr[5]/td[2]/a[2]\r\n");
	    By customercompanyyes = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/span"); 
	    By companyadress = By.xpath("//*[@id=\"grid-container\"]/div/div[6]/div[2]/table/tbody/tr[1]/td[2]/a[3]");
	    By addCustomerCompanyAdress = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[4]/div/div/div[3]/div[1]/div/div/div");
	    
	    By duration = By.id("Durations");
	    By addDuration = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By durationTime = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div/div[1]/input");
	    
	    By region = By.id("Regions-95");
	    By addRegion = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By regionName = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div/div[1]/input");
	    By regionDescription = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div[1]/input");
	    By regionSearchName = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[5]/div[2]/table/tbody/tr[2]/td[1]/div/div[2]/div/div/div[1]/input");
	    By regionSearchDesription = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[5]/div[2]/table/tbody/tr[2]/td[2]/div/div[2]/div/div/div[1]/input");
	   
	    By regionrelations = By.id("RegionRelations");
	    By addRegionRelations = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By deleteregion = By.xpath("//*[@id=\"grid-container\"]/div/div[6]/div[2]/table/tbody/tr[5]/td[2]/a[2]\r\n");
	    By regionyes = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div");
	    By lookupName = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/input");
	    
	    By module = By.id("Modules-97");
	    By addModule = By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div");
	    By moduleName = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div/div[1]/input");
	   
	    By lookup = By.id("Lookups-99");
	    By addLookup = By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    
	    By country = By.id("Countries-100");
	    By addCountry = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By countryName = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div/div[1]/input");
	    By countryDelete = By.xpath("//*[@id=\"grid-container\"]/div/div[6]/div[2]/table/tbody/tr[3]/td[2]/a[2]");
	    By countryYes = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/span");
	    By systemsettings = By.id("SystemSettings");
	    By addSystemSettings = By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By systemsettingsName = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By systemsettingsValue = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div[1]/input");
	   
	    By order = By.xpath("//*[@href=\"/milkrun/orders\"]");
	    By addOrder = By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By ordermaterial = By.xpath("//*[@id=\"order-details\"]/div/ul/li[4]/a");
	    By orderNumber = By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div[2]/table/tbody/tr[2]/td[1]/div/div[2]/div/div/div[1]/input");	    
	    By Materialcode = By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div/table/tbody/tr[2]/td[4]/div/div[2]/div/div/div[1]/input");
	    By orderDate = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div[1]/div/div[1]/input");
	    By date = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div");
	    By Quantity= By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div/table/tbody/tr[2]/td[5]/div/div[2]/div/div/div[1]/input");
	    
	    By contacts = By.id("Contacts-106");
	    By addContacts = By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div");
	    By contactdelete = By.xpath("//*[@id=\"grid-container\"]/div/div[6]/div[2]/table/tbody/tr[9]/td[2]/a[2]\r\n");
	    By yes = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div");
	    By pendingOrders = By.id("PendingOrdersReport");
	    By dx = By.xpath("//*[@id=\"form-demo\"]/div/div[6]/div[1]/div/div/div/span[1]");
	    
	    By reportmenu = By.id("ReportMenus-141");
	    By addReportMenu = By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By ReportName =By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By ReportIndex = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By ReportDelete = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[6]/div[2]/table/tbody/tr[1]/td[2]/a[2]");
	    By ReportYes = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div");
	    
	    By pendingorderreport =  By.id("PendingOrdersReport-62");
	    By showresult = By.id("btnShowResults");
	    By materialdata = By.xpath("//*[@id=\"material\"]/div/div[1]&input");
	    By OrderDetailCheck = By.xpath("//*[@id=\"form-pending-orders-report\"]/div/div[6]/div[1]/div/div/div/span[1]");
	   
	    By info = By.xpath("//*[@id=\"root\"]/div/div/div/div/header/ul/li[2]/div/button[3]");
	    By profile = By.xpath("//*[@id=\"root\"]/div/div/div/div/header/ul/li[2]/div/button[2]");
	    By description = By.xpath("//*[@id=\"ContactForm\"]/div/div/form/div/div[1]/div/div/div[4]/div/div/div/div/div/div[1]/input");
	    
	    By reportDefinition = By.id("ReportDefinitions-143");
	    By addreportDefinition = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By reportDefinitionName = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By reportDefinitionPath = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By reportmenuId = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div");
	    
	    By packagepallet = By.id("PackagePalletDefinitions-177");
	    By addPackagePallet = By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div");
	    By PackagePalletPackageName = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div");
	    By PackagePalletPalletName = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div");
	    By PackagePalletQuantity = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By PackagePalletCode = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div[1]/input");
	    By PackagePalletDelete = By.xpath("//*[@id=\"grid-container\"]/div/div[6]/div[2]/table/tbody/tr[3]/td[2]/a[2]");
	    By PackagePalletYes = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/span");
	    
	    By deletereport = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[6]/div[2]/table/tbody/tr[2]/td[2]/a[2]");
	    By reportyes = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div/span");
	    
	   
	    By addMaterial = By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div/i");
	    By MaterialName = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By MaterialCode = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div[1]/input");
	    By MaterialWeight = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div[1]/input");
	    By MaterialType = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[3]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div");
	    By MaterialDelete = By.xpath("//*[@id=\"grid-container\"]/div[1]/div[6]/div[2]/table/tbody/tr[9]/td[2]/a[2]");
	    By MaterialYes = By.xpath("/html/body/div[2]/div/div/div[2]/div/div[2]/div[1]/div/div/div");
	    
	    public LoginPage(WebDriver driver) {
	        super(driver);
	    }
	 
	
    /**Constructor*/
  
    /**Page Methods
     *
     * @throws InterruptedException */
    public LoginPage loginToItelli(String username, String password) throws InterruptedException {
    	wait.until(ExpectedConditions.elementToBeClickable(By.id("userName")));
    	writeText(userNameId, username);
        Thread.sleep(2000);
        
        writeText(passwordId, password);
   
        Thread.sleep(2000);
        click(loginButtonId);
        Thread.sleep(2000);
        
        return this;
    }
    
    /*--------------------------------------------------------------------------------------------------*/
    
    public LoginPage EditUser() throws InterruptedException{
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/ul/li[2]/a"))));
    	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/ul/li[2]/a")).click();
    	Thread.sleep(1000);
    	click(users);
    	Thread.sleep(3000);
    	click(editUser);
    	Thread.sleep(2000);
    	click(LastName);
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"LastName\"]")).clear();
    	Thread.sleep(1000);
    	writeText(LastName,RandomLastName());
    	Thread.sleep(1000);
    	click(updateUser);
    	Thread.sleep(1000);
    	click(confirmButton);
    	return this;
    }
 
    /*--------------------------------------------------------------------------------------------------*/
    public LoginPage EmptyAddGroup() throws InterruptedException{
    	click(definitions);
    	Thread.sleep(3000);
    	click(definitionsportal);
    	Thread.sleep(3000);
    	click(groups);
    	Thread.sleep(3000);
    	click(addGroup);
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(2000);
    	click(cancel);
    	Thread.sleep(2000);
    	
    	return this;
    }
    
    public LoginPage InvalidAddGroup() throws InterruptedException{
    	click(definitions);
    	Thread.sleep(3000);
    	click(definitionsportal);
    	Thread.sleep(3000);
    	click(groups);
    	Thread.sleep(2000);
    	click(addGroup);
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div/div[1]/input")).sendKeys("-9");
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage AddGroup() throws InterruptedException{
    	click(definitions);
    	Thread.sleep(3000);
    	click(definitionsportal);
    	Thread.sleep(3000);
    	click(groups);
    	Thread.sleep(3000);
    	click(addGroup);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div/div[1]/input")).sendKeys("itelli");
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(2000);
    	click(groupdelete);
    	Thread.sleep(1000);
    	click(groupyes);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage GroupSearch() throws InterruptedException{
    	click(definitions);
    	Thread.sleep(1000);
    	click(definitionsportal);
    	Thread.sleep(1000);
    	click(groups);
    	Thread.sleep(1000);
    	writeText(groupname,"BSHGroup");
    	Thread.sleep(2000);
    	click(groups);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    /*--------------------------------------------------------------------------------------------------*/
    
    public LoginPage EmptyAddRoles() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(3000);
    	click(definitionsportal);
    	Thread.sleep(3000);
    	click(roles);
    	Thread.sleep(3000);
    	click(addroles);
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(2000);  
    	click(cancel);
    	Thread.sleep(1000);     
    	return this;
    	
    }
    
    public LoginPage InvalidAddRoles() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(3000);
    	click(definitionsportal);
    	Thread.sleep(3000);     
    	click(roles);
    	Thread.sleep(2000);
    	click(addroles);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div/div[1]/input")).sendKeys("itelligence Company Ataşehir Nidakule Güney xxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(2000);
    	click(cancel);
    	Thread.sleep(2000);
    	
    	return this;
    	
    }
 
    public LoginPage AddRoles() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(3000);
    	click(definitionsportal);
    	Thread.sleep(3000);     
    	click(roles);
    	Thread.sleep(2000);
    	click(addroles);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div/div[1]/input")).sendKeys("itelli");
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(2000);
    	click(deleterole);
    	Thread.sleep(1000);
    	click(roleyes);
    	Thread.sleep(1000);
    	return this;
    	
    }
 
    public LoginPage RoleSearch() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(1000);
    	click(definitionsportal);
    	Thread.sleep(1000);     
    	click(roles);
    	Thread.sleep(2000);
    	writeText(rolename,"BSH Role");
    	Thread.sleep(2000);
    	click(rolename);
    	return this;
    	
    }
 
    /*--------------------------------------------------------------------------------------------------*/
    
    public LoginPage EmptyAddDimension() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(3000);
    	click(milkrun);
    	Thread.sleep(3000);    	
    	click(dimension);
    	Thread.sleep(3000);
    	click(addDimension);
    	Thread.sleep(3000);
    	click(save);
    	Thread.sleep(2000);
    	click(DimensionCancel);
    	Thread.sleep(2000);
    	
    	return this;
    	
    }
    
    public LoginPage InvalidAddDimension() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(3000);
    	click(milkrun);
    	Thread.sleep(3000);    	
    	click(dimension);
    	Thread.sleep(2000);
    	click(addDimension);
    	Thread.sleep(1000);
    	writeText(DimensionName,"İtelli");
    	Thread.sleep(2000);    	
    	writeText(DimensionWidth,"-3");
    	Thread.sleep(2000);
    	writeText(DimensionHeight,"-3");
    	Thread.sleep(2000);
    	writeText(DimensionLenght,"-5");
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(2000);
    	click(DimensionCancel);
    	Thread.sleep(2000);
    	
    	return this;
    	
    }
 
    public LoginPage AddDimension() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(1000);
    	click(milkrun);
    	Thread.sleep(1000);    	
    	click(dimension);
    	Thread.sleep(2000);
    	click(addDimension);
    	Thread.sleep(1000);
    	writeText(DimensionName,"box");
    	Thread.sleep(1000);    	
    	writeText(DimensionWidth,"3");
    	Thread.sleep(1000);
    	writeText(DimensionHeight,"3");
    	Thread.sleep(1000);
    	writeText(DimensionLenght,"5");
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(2000);
    	click(DimensionDelete);
    	Thread.sleep(2000);
    	click(DimensionYes);
    	Thread.sleep(2000);
    	
    	return this;
    	
    }
 
    public LoginPage DeleteDimension() throws InterruptedException {
    	Thread.sleep(1000);
    	click(dimension);
    	Thread.sleep(2000);
    	click(DimensionDelete);
    	Thread.sleep(2000);
 
    	return this;
    	
    }
    
    public LoginPage DimensionSearch() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(2000);
    	click(milkrun);
    	Thread.sleep(2000);    	
    	click(dimension);
    	Thread.sleep(3000);
    	writeText(DimensionSearch,"İtelli");
    	Thread.sleep(2000);
    	click(dimension);
    	Thread.sleep(2000);
    	
    	
    	return this;
    	
    }
    
    public LoginPage InvalidDimensionSearch() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(1000);
    	click(milkrun);
    	Thread.sleep(1000);
    	
    	click(dimension);
    	Thread.sleep(2000);
    	
    	click(DimensionSearch);
    	Thread.sleep(2000);
    	
    	writeText(DimensionSearch,"Deneme 1 2");
    	Thread.sleep(2000);
    	
    	return this;
    }
        
    
    public LoginPage InvalidEditDimension() throws InterruptedException {
    	Thread.sleep(1000);
    	click(dimension);
    	Thread.sleep(2000);
    	click(DimensionEdit);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@aria-valuenow='500']")).sendKeys("e");
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(1000);
    	
    	
    	return this;
    	
    }
    
    public LoginPage EditDimension() throws InterruptedException {
    	Thread.sleep(1000);
    	click(dimension);
    	Thread.sleep(2000);
    	click(DimensionEdit);
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@aria-valuenow='500']")).sendKeys("5");
    	Thread.sleep(1000);
    	click(save);	
    	
    	Thread.sleep(2000);
    	return this;
    	
    }
    
    /*--------------------------------------------------------------------------------------------------*/
    
    public LoginPage EmptyAddMaterial() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(3000);
    	click(milkrun);
    	Thread.sleep(3000);
    	click(material);
    	Thread.sleep(3000);    	
    	click(addMaterial);
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(2000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	
    	return this;
    }
    public LoginPage InvalidAddMaterial() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(2000);
    	click(milkrun);
    	Thread.sleep(3000);
    	click(material);
    	Thread.sleep(2000);    	
    	click(addMaterial);
    	Thread.sleep(2000);
    	writeText(MaterialName,"Çivi");
    	Thread.sleep(1000);
    	writeText(MaterialCode,"C-01");
    	Thread.sleep(1000);
    	writeText(MaterialWeight,"-5");    	
    	Thread.sleep(1000);
    	click(MaterialType);
    	Thread.sleep(1000);	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'Standart')]")))).click();
    	Thread.sleep(1000);	
    	click(save);
    	Thread.sleep(1000);	
    	click(cancel);
    	Thread.sleep(1000);	
    	
    	
    	return this;
    }
    
   
    public LoginPage AddMaterial() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(2000);
    	click(milkrun);
    	Thread.sleep(3000);
    	click(material);
    	Thread.sleep(2000);    	
    	click(addMaterial);
    	Thread.sleep(2000);
    	writeText(MaterialName,"Çekiç");
    	Thread.sleep(1000);
    	writeText(MaterialCode,"C-01");
    	Thread.sleep(1000);
    	writeText(MaterialWeight,"10");    	
    	Thread.sleep(1000);
    	click(MaterialType);
    	Thread.sleep(1000);	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'Standart')]")))).click();
    	Thread.sleep(1000);	
    	click(save);
    	Thread.sleep(1000);
    	click(MaterialDelete);
    	Thread.sleep(1000);
    	click(MaterialYes);
    	Thread.sleep(1000);
    	
    	
    	return this;
    }
   
    public LoginPage MaterialSearch() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(2000);
    	click(milkrun);
    	Thread.sleep(3000);
    	click(material);
    	Thread.sleep(2000);
    	writeText(materialSearch,"Vida");
    	Thread.sleep(2000);
    	click(material);
    	Thread.sleep(2000);
    	driver.findElement(materialSearch).clear();
    	Thread.sleep(1000);
    	click(materialSearchCode);
    	Thread.sleep(2000);  	
      	writeText(materialSearchCode,"CV-01");
    	Thread.sleep(2000);
    	
    	return this;    	
    }
    public LoginPage InvalidMaterialSearch() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(2000);
    	click(milkrun);
    	Thread.sleep(3000);
    	click(material);
    	Thread.sleep(2000);
    	
    	click(materialSearch);
    	Thread.sleep(2000);
    	
    	writeText(materialSearch,"Deneme 1 2");
    	Thread.sleep(2000);
    	
    	return this;
    }
    
    public LoginPage InvalidEditMaterial() throws InterruptedException {
    	click(milkrun);
    	Thread.sleep(2000);
    	click(material);
    	Thread.sleep(1000);
    	click(materialEdit);
    	Thread.sleep(2000);    		
    	driver.findElement(By.xpath("//*[@aria-valuenow='5']")).sendKeys("e");
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage EditMaterial() throws InterruptedException {
    	click(milkrun);
    	Thread.sleep(2000);
    	click(material);
    	Thread.sleep(1000);
    	click(materialEdit);
    	Thread.sleep(2000);
    		
    	driver.findElement(By.xpath("//*[@aria-valuenow='5']")).sendKeys("1");
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    /*--------------------------------------------------------------------------------------------------*/
    
    public LoginPage TruckSearch() throws InterruptedException {
    	Thread.sleep(1000);
    	click(truck);
    	Thread.sleep(2000);
    	writeText(TruckSearch,"34 ABC 123");
    	Thread.sleep(3000);
    	click(truck);
    	Thread.sleep(2000);
    	
    	return this;    	
    }
    
    public LoginPage EmptyAddTruck() throws InterruptedException {
    	click(definitions);    	
    	Thread.sleep(2000);
    	click(milkrun);
    	Thread.sleep(2000);
    	click(truck);
    	Thread.sleep(2000);
    	click(addTruck);
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    	
    }
    public LoginPage InvalidAddTruck() throws InterruptedException {
    	click(definitions);    	
    	Thread.sleep(2000);
    	click(milkrun);
    	Thread.sleep(2000);
    	click(truck);
    	Thread.sleep(2000);
    	click(addTruck);
    	Thread.sleep(2000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/input"))));
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/input")).sendKeys("34 abc 546");
    	Thread.sleep(1000);
        	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(1000);
    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'PAKET 30x30x30')]")))).click();
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(1000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'Enka')]")))).click();
    	Thread.sleep(1000);    	
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'Araba')]")))).click();   		
    	Thread.sleep(2000);    	
    	click(save);
    	Thread.sleep(2000);
    	click(cancel);
    	Thread.sleep(2000);
    	
    	return this;
    	
    }
    public LoginPage AddTruck() throws InterruptedException {
    	click(definitions);    	
    	Thread.sleep(2000);
    	click(milkrun);
    	Thread.sleep(2000);
    	click(truck);
    	Thread.sleep(2000);
    	click(addTruck);
    	Thread.sleep(2000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/input"))));
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/input")).sendKeys("34 key 546");
    	Thread.sleep(1000);
        	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(1000);
    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'PAKET 30x30x30')]")))).click();
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(1000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'Enka')]")))).click();
    	Thread.sleep(1000);    	
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'Tır')]")))).click();   		
    	Thread.sleep(2000);    	
    	click(save);
    	Thread.sleep(2000);
    	click(DeleteTruck);
    	Thread.sleep(2000);
    	click(TruckYes);
    	Thread.sleep(2000);
    	
    	return this;
    	
    }
    
    
    
    public LoginPage DeleteTruck() throws InterruptedException {
    	click(milkrun);
    	Thread.sleep(1000);
    	click(truck);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@title=\"Delete\"]")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[contains(text(),\"Yes\")]")).click();
    	Thread.sleep(1000);
    	
    	return this;
    	
    }
    
    public LoginPage InvalidEditTruck() throws InterruptedException {
    	click(milkrun);
    	Thread.sleep(1000);
    	click(truck);
    	Thread.sleep(2000);
    	click(editTruck);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div[1]/div/div[1]")).click();
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(1000);
    	return this;
    }
    
    
    /*--------------------------------------------------------------------------------------------------*/
    
    public LoginPage DistanceSearch() throws InterruptedException {
    	click(distance);
    	Thread.sleep(2000);
    	writeText(distanceSearchDistance,"16");
    	Thread.sleep(3000);
    	click(distance);
    	Thread.sleep(2000);
    	
    	return this;    	
    }
   
    public LoginPage EmptyAddDistance() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(2000);
    	click(milkrun);
    	Thread.sleep(2000);   	
    	click(distance);
    	Thread.sleep(2000);
    	click(addDistance);
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(2000);
    	click(cancel);
    	Thread.sleep(2000);
    	
    	return this;    	
    }
    public LoginPage InvalidAddDistance() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(2000);
    	click(milkrun);
    	Thread.sleep(2000);  	
    	click(distance);
    	Thread.sleep(2000);
    	click(addDistance);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'ABC Lojistik')]")))).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='dx-item-content dx-list-item-content']//li[contains(text(),'ABC Lojistik')]")))).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div[1]/input")).sendKeys("5");
    	Thread.sleep(1000);
    	click(save);
    	//driver.findElement(By.xpath("//div[@class='dx-texteditor-input-container']//*[@type='text' and @class='dx-texteditor-input']")).sendKeys("5");
    	Thread.sleep(2000);
        
    	return this;    	
    }
    
    public LoginPage AddDistance() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(2000);
    	click(milkrun);
    	Thread.sleep(2000);  	
    	click(distance);
    	Thread.sleep(2000);
    	click(addDistance);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'ABC Lojistik')]")))).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='dx-item-content dx-list-item-content']//li[contains(text(),'ABC Hırdavat')]")))).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div[1]/input")).sendKeys("5");
    	Thread.sleep(1000);
    	
    	click(save);
    	//driver.findElement(By.xpath("//div[@class='dx-texteditor-input-container']//*[@type='text' and @class='dx-texteditor-input']")).sendKeys("5");
    	Thread.sleep(2000);
        click(DistanceDelete);
        Thread.sleep(2000);
        click(DistanceYes);
        Thread.sleep(2000);
        
    	return this;    	
    }
    
    public LoginPage InvalidEditDistance() throws InterruptedException {
    	click(milkrun);
    	Thread.sleep(2000);
    	click(distance);
    	Thread.sleep(2000);
    	click(editDistance);
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@aria-valuenow='5' and @class='dx-texteditor-input']")).clear();
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(2000);
    	
    	
    	return this;
    }
    
    public LoginPage EditDistance() throws InterruptedException {
    	click(milkrun);
    	Thread.sleep(1000);
    	click(distance);
    	Thread.sleep(2000);
    	click(editDistance);
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@aria-valuenow='5' and @class='dx-texteditor-input']")).sendKeys("3");
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	return this;
    }
    
    /*--------------------------------------------------------------------------------------------------*/
    
    public LoginPage EmptyAddPackagePalletDefiniton() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(2000);
    	click(milkrun);
    	Thread.sleep(2000);  	
    	click(packagepallet);
    	Thread.sleep(2000);
    	click(addPackagePallet);
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(2000);
    	click(cancel);
    	Thread.sleep(2000);
    	
    	return this;    	
    }
    
    public LoginPage InvalidAddPackagePalletDefiniton() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(2000);
    	click(milkrun);
    	Thread.sleep(2000);  	
    	click(packagepallet);
    	Thread.sleep(2000);
    	click(addPackagePallet);
    	Thread.sleep(2000);
    	click(PackagePalletPackageName);
    	Thread.sleep(2000);   	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'Çivi Paketi')]")))).click();
    	Thread.sleep(2000);
    	click(PackagePalletPalletName);
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'Standart Palet')]")))).click();
    	Thread.sleep(1000);    	
    	writeText(PackagePalletQuantity,"-5");    	
    	Thread.sleep(1000);
    	writeText(PackagePalletCode,"CV-01");    	    	
    	click(save); 	
    	Thread.sleep(2000);
    	click(cancel);
    	Thread.sleep(2000);
    	
    	return this;
    }
    
    public LoginPage AddPackagePalletDefiniton() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(2000);
    	click(milkrun);
    	Thread.sleep(2000);  	
    	click(packagepallet);
    	Thread.sleep(2000);
    	click(addPackagePallet);
    	Thread.sleep(1000);
    	click(PackagePalletPackageName);
    	Thread.sleep(1000);
    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'Çivi Paketi')]")))).click();
    	Thread.sleep(1000);
    	click(PackagePalletPalletName);
    	Thread.sleep(1000);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'Standart Palet')]")))).click();
    	Thread.sleep(1000);    	
    	writeText(PackagePalletQuantity,"15");    	
    	Thread.sleep(1000);
    	writeText(PackagePalletCode,"CV-01");    	    	
    	Thread.sleep(1000);    	
    	click(save); 	
    	Thread.sleep(2000);
    	click(PackagePalletDelete);
    	Thread.sleep(2000);
    	click(PackagePalletYes);
    	Thread.sleep(2000);
    	
    	return this;
    }
    /*--------------------------------------------------------------------------------------------------*/
      
    public LoginPage EmptyAddPalletDefiniton() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(2000);
    	click(milkrun);
    	Thread.sleep(2000);  	
    	click(palletdefinition);
    	Thread.sleep(2000);
    	click(addPalletDefinition);
    	Thread.sleep(1000);
    	//driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div")).click();
    	click(save);
    	Thread.sleep(2000);
    	click(cancel);
    	Thread.sleep(2000);
    	
    	return this;    	
    }
    
    public LoginPage InvalidAddPalletDefiniton() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(2000);
    	click(milkrun);
    	Thread.sleep(2000);  	
    	click(palletdefinition);
    	Thread.sleep(2000);
    	click(addPalletDefinition);
    	Thread.sleep(1000);
    	writeText(PalletDefinitionName,"Standart Palet");
    	Thread.sleep(1000);
    	writeText(PalletDefinitionWeight,"-5");
    	Thread.sleep(1000);
    	writeText(PalletDefinitionCode,"T001");
    	Thread.sleep(1000);
    	writeText(PalletDefinitionDescription,"Pallet test");
    	Thread.sleep(1000);
    	click(PalletDefinitionDimension);
      	Thread.sleep(1000);
          
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'PAKET 30x30x30')]")))).click();
    	Thread.sleep(1000);
    //	driver.findElement(By.xpath("//*[contains(text(), 'NotebookBoxLarge')]")).click();
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[3]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'Standart Pallet')]")))).click();
    	
    	Thread.sleep(1000);
    	click(save); 	
    	Thread.sleep(2000);
    	click(cancel);
    	Thread.sleep(2000);
    	
    	return this;
    }
    
    
    public LoginPage AddPalletDefiniton() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(2000);
    	click(milkrun);
    	Thread.sleep(2000);  	
    	click(palletdefinition);
    	Thread.sleep(2000);
    	click(addPalletDefinition);
    	Thread.sleep(1000);
    	writeText(PalletDefinitionName,"Standart Palet");
    	Thread.sleep(1000);
    	writeText(PalletDefinitionWeight,"5");
    	Thread.sleep(1000);
    	writeText(PalletDefinitionCode,"T001");
    	Thread.sleep(1000);
    	writeText(PalletDefinitionDescription,"Pallet test");
    	Thread.sleep(1000);
    	click(PalletDefinitionDimension);
      	Thread.sleep(1000);
      	click(PalletDefinitionDelete);
      	Thread.sleep(1000);
      	click(PalletDefinitionYes);
      	Thread.sleep(1000);
      	  
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'PAKET 30x30x30')]")))).click();
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[3]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'Standart Pallet')]")))).click();
    	    	
    	Thread.sleep(1000);
    	click(save);
    	
    	Thread.sleep(2000);
    	
    	
    	return this;
    }
   
    public LoginPage EditPalletDefinition() throws InterruptedException {
    	click(milkrun);
    	Thread.sleep(1000);
    	click(palletdefinition);
    	Thread.sleep(2000);
    	click(palletdefinitionEdit);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@aria-valuenow='2' and @class='dx-texteditor-input']")).sendKeys("3");
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(1000);
    	return this;
    }
    
    public LoginPage Pallet_Definition_Search() throws InterruptedException {
    	click(palletdefinition);
    	Thread.sleep(2000);
    	writeText(palletdefinitionS,"Standart Palet");
    	Thread.sleep(1000);
    	
    	click(palletdefinitionS);
    	Thread.sleep(2000);
    	
    	
    	return this;
    }
    
  
    /*--------------------------------------------------------------------------------------------------*/
    public LoginPage EmptyAddPackage() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(1000);
    	click(milkrun);
    	Thread.sleep(1000);   	
    	click(packages);
    	Thread.sleep(2000);
    	click(addPackages);
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage DeletePackage() throws InterruptedException {
    	click(packages);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"grid-container\"]/div/div[6]/div/div/div[1]/div/table/tbody/tr[2]/td[7]/a[2]")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[contains(text(), 'Yes')]")).click();
    	
    	driver.findElement(By.xpath("//*[contains(text(),\"Yes\")]")).click();
    	Thread.sleep(1000);
    	
    	return this; 
    	
    }
    public LoginPage InvalidAddPackage() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(1000);
    	click(milkrun);
    	Thread.sleep(1000);   	
    	click(packages);
    	Thread.sleep(2000);
    	click(addPackages);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/input")).sendKeys("Package4");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div[1]/input")).sendKeys("CV-08");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div[1]/input")).sendKeys("-5");
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[3]/div/div[1]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'PAKET 30x30x30')]")))).click();
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[4]/div/div[1]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'Plastic Box')]")))).click();
    	  	
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }
    public LoginPage AddPackage() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(1000);
    	click(milkrun);
    	Thread.sleep(1000);   	
    	click(packages);
    	Thread.sleep(2000);
    	click(addPackages);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/input")).sendKeys("Package4");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div[1]/input")).sendKeys("CV-08");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div[1]/input")).sendKeys("5");
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[3]/div/div[1]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'PAKET 30x30x30')]")))).click();
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[4]/div/div[1]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'Plastic Box')]")))).click();
    	click(save);
    	Thread.sleep(1000);
    	click(PackageDelete);
    	Thread.sleep(1000);
    	click(PackageYes);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage InvalidEditPackage() throws InterruptedException {
    	click(packages);
    	Thread.sleep(2000);
    	click(packagesEdit);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@aria-valuenow='2' and @class='dx-texteditor-input']")).sendKeys("e");
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(1000);
    	
    return this;
    }
    public LoginPage EditPackage() throws InterruptedException {
    	click(milkrun);
    	Thread.sleep(1000);
    	click(packages);
    	Thread.sleep(2000);
    	click(packagesEdit);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@aria-valuenow='2' and @class='dx-texteditor-input']")).sendKeys("1");
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(1000);
    	
    return this;
    }
    
    public LoginPage PackageSearch() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(1000);
    	click(milkrun);
    	Thread.sleep(1000);   	
    	click(packages);
    	Thread.sleep(2000);   	
    	writeText(packageSearchName,"vida");
    	Thread.sleep(1000);
    	click(packageSearchName);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    
    
    /*--------------------------------------------------------------------------------------------------*/
   
    public LoginPage EmptyAddTheme() throws InterruptedException {
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	
    	Thread.sleep(1000);
    	click(themes);
    	Thread.sleep(2000);
    	click(addThemes);
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage InvalidAddTheme() throws InterruptedException {
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	
    	Thread.sleep(1000);
    	click(themes);
    	Thread.sleep(2000);
    	click(addThemes);
    	Thread.sleep(1000);
    	writeText(ThemeName,"-5");
    	Thread.sleep(1000);
    	writeText(ThemeLogoName,"ItelliLogo");
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage AddTheme() throws InterruptedException {
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	
    	Thread.sleep(1000);
    	click(themes);
    	Thread.sleep(2000);
    	click(addThemes);
    	Thread.sleep(1000);
    	writeText(ThemeName,"ItelliThema");
    	Thread.sleep(1000);
    	writeText(ThemeLogoName,"ItelliLogo");
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage ThemeSearchItem() throws InterruptedException {
    	click(milkrun);
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings\"]/a")).click();
    	
    	Thread.sleep(1000);
    	click(themes);
    	Thread.sleep(2000);
    	writeText(ThemeSearchName,"itelli");
    	click(ThemeSearchName);
    	Thread.sleep(2000);
    	
        
    	return this;
    }
    
    /*--------------------------------------------------------------------------------------------------*/
    
    public LoginPage InvalidAddDuration() throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings\"]/a"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings\"]/a")).click();
    	Thread.sleep(1000);
    	click(milkrun);
    	Thread.sleep(1000);
    	click(duration);
    	Thread.sleep(1000);
    	click(addDuration);
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
        
    return this;
    }
    
    public LoginPage AddDuration() throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings\"]/a"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings\"]/a")).click();
    	Thread.sleep(1000);
    	click(milkrun);
    	Thread.sleep(1000);
    	click(duration);
    	Thread.sleep(1000);
    	click(addDuration);
    	Thread.sleep(1000);
    	writeText(durationTime,"10");
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(1000);
    		
    	return this;
    }
    	
    /*--------------------------------------------------------------------------------------------------*/
    
    public LoginPage EmptyAddLoadingDuration() throws InterruptedException {
    	Thread.sleep(2000);
    	click(definitions);
    	Thread.sleep(3000);
    	click(milkrun);
    	Thread.sleep(3000);    	
    	click(loadingduration);
    	Thread.sleep(3000);
    	click(addLoadingDuration);
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	
    	return this;
    }
   
    public LoginPage InvalidAddLoadingDuration() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(2000);
    	click(milkrun);
    	Thread.sleep(2000);    	
    	click(loadingduration);
    	Thread.sleep(2000);
    	click(addLoadingDuration);
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'LoadingDuration')]")))).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(1000);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'ab')]")))).click();   	
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	
    	return this;
    }
   
    public LoginPage AddLoadingDuration() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(2000);
    	click(milkrun);
    	Thread.sleep(2000);    	
    	click(loadingduration);
    	Thread.sleep(2000);
    	click(addLoadingDuration);
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'LoadingDuration')]")))).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(1000);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), '10')]")))).click();   	
    	click(save);
    	Thread.sleep(1000);
    	click(LoadingDelete);
    	Thread.sleep(1000);
    	click(LoadingYes);
    	Thread.sleep(1000);
    	
    	return this;
    }
    /*--------------------------------------------------------------------------------------------------*/
        
    public LoginPage InvalidOrderSearch() throws InterruptedException {
    	Thread.sleep(1000);
    	click(orders);
    	Thread.sleep(1000);
    	click(Order);
    	Thread.sleep(2000);  	
    	writeText(orderNumber,"25");
    	Thread.sleep(1000);
    	
    	click(orderNumber);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage OrderSearch() throws InterruptedException {
    	Thread.sleep(1000);
    	click(orders);
    	Thread.sleep(1000);
    	click(Order);
    	Thread.sleep(2000);
    	driver.findElement(orderNumber).clear();
    	Thread.sleep(1000);
    	writeText(orderNumber,"27");
    	Thread.sleep(1000);
    	
    	click(orderNumber);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    
    /*--------------------------------------------------------------------------------------------------*/
     
    public LoginPage EmptyAddMaterial_Package() throws InterruptedException{
    	click(definitions);
    	Thread.sleep(2000);
    	click(milkrun);
    	Thread.sleep(3000);
    	click(material_package);
    	Thread.sleep(3000);
    	click(AddMaterial_package);
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage InvalidAddMaterial_Package() throws InterruptedException{
    	click(definitions);
    	Thread.sleep(2000);
    	click(milkrun);
    	Thread.sleep(2000);
    	click(material_package);
    	Thread.sleep(2000);
    	click(AddMaterial_package);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'Vida')]")))).click();	
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'Vida Paketi')]")))).click();	
    	Thread.sleep(1000);    	
    	writeText(Min_Qty,"-5");
     	Thread.sleep(1000);    	
    	writeText(Max_Qty,"100");
     	Thread.sleep(1000);    	        
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage AddMaterial_Package() throws InterruptedException{
    	click(definitions);
    	Thread.sleep(2000);
    	click(milkrun);
    	Thread.sleep(2000);
    	click(material_package);
    	Thread.sleep(2000);
    	click(AddMaterial_package);
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'Vida')]")))).click();	
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'Vida Paketi')]")))).click();	
    	Thread.sleep(1000);    	
    	writeText(Min_Qty,"5");
     	Thread.sleep(1000);    	
    	writeText(Max_Qty,"100");
     	Thread.sleep(1000);    	        
    	click(save);
    	Thread.sleep(1000);
    	click(MaterialPackageDelete);
    	Thread.sleep(1000);
    	click(MaterialPackageYes);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage Material_Package_Search() throws InterruptedException{
    	click(milkrun);
    	Thread.sleep(1000);
    	click(material_package);
    	Thread.sleep(2000);
    	writeText(Min_Qty,"5");	 	
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    
    public LoginPage InvalidEditMaterialPackage() throws InterruptedException {
    	click(milkrun);
    	Thread.sleep(1000);
    	click(material_package);
    	Thread.sleep(2000);
    	click(EditMaterial_package);
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@aria-valuenow='9' and @class='dx-texteditor-input']")).clear();
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(3000);
    	
    	return this;
    }
    public LoginPage EditMaterialPackage() throws InterruptedException {
    	click(milkrun);
    	Thread.sleep(1000);
    	click(material_package);
    	Thread.sleep(2000);
    	click(EditMaterial_package);
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@aria-valuenow='9' and @class='dx-texteditor-input']")).sendKeys("5");
    	Thread.sleep(1000);  	
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(3000);
    	
    	return this;
    }
    
    
    /*--------------------------------------------------------------------------------------------------*/
    public LoginPage EmptyAddDrivers() throws InterruptedException {
    	click(definitions);    	
    	Thread.sleep(3000);
    	click(milkrun);
    	Thread.sleep(3000);
    	click(drivers);
    	Thread.sleep(3000);
        click(addDrivers);
        Thread.sleep(2000);
        click(save);
        Thread.sleep(2000);
        click(cancel);
        Thread.sleep(1000);
        
        return this;
    }
    
    public LoginPage InvalidAddDrivers() throws InterruptedException {
    	click(definitions);	
    	Thread.sleep(2000);
    	click(milkrun);
    	Thread.sleep(2000);    	
    	click(drivers);
    	Thread.sleep(2000);
        click(addDrivers);
        Thread.sleep(2000);        
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'Ahmet Erakatay')]")))).click();
    	Thread.sleep(2000);        
    	     	
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
       	Thread.sleep(2000);    	
       	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), '34 ABC -1234')]")))).click();
        Thread.sleep(1000);
        
        
        click(save);
        Thread.sleep(2000);
        click(cancel);
        Thread.sleep(1000);
        
        return this;
    }
    public LoginPage AddDrivers() throws InterruptedException {
    	click(definitions);	
    	Thread.sleep(2000);
    	click(milkrun);
    	Thread.sleep(2000);    	
    	click(drivers);
    	Thread.sleep(2000);
        click(addDrivers);
        Thread.sleep(2000);        
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'Ahmet Erakatay')]")))).click();
    	Thread.sleep(2000);        
    	     	
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
       	Thread.sleep(2000);    	
       	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), '34 ABC 123')]")))).click();
        Thread.sleep(2000); 
        click(save);
        Thread.sleep(2000);
        click(DriverDelete);
        Thread.sleep(2000);
        click(DriverYes);
        
        return this;
    }
    
    /*--------------------------------------------------------------------------------------------------*/

    public LoginPage InvalidOrderPackageSearch() throws InterruptedException {
		Thread.sleep(1000);
		
		click(orders);
		Thread.sleep(2000);
		click(Order);
		Thread.sleep(2000);   	
		click(ordermaterialshow);
    	Thread.sleep(2000);
    	click(orderpackage);
    	writeText(Quantity,"100");
       Thread.sleep(2000);
        click(orderPackageName);
        Thread.sleep(2000);
        
    	
    	
        return this;
    }
    
    /*--------------------------------------------------------------------------------------------------*/
  
    public LoginPage OrderPackageSearch() throws InterruptedException {
    	click(orders);
		Thread.sleep(2000);
		click(Order);
		Thread.sleep(2000);   	
		click(ordermaterialshow);
		Thread.sleep(2000);   	
		
    	click(orderpackage);
    	Thread.sleep(2000);
    	writeText(Quantity,"84");
    	Thread.sleep(3000);
    	click(orderpackage);
    	Thread.sleep(2000);  	
    	driver.findElement(orderpackageSearch).clear();
    	Thread.sleep(1000);  	
    	
      	writeText(orderpackageWeight,"85");
    	Thread.sleep(2000);
    	click(orderpackageWeight);
    	
    	return this;    	
    }
    
    
    /*--------------------------------------------------------------------------------------------------*/
    
    public LoginPage InvalidOrderMaterialSearch() throws InterruptedException {
		Thread.sleep(1000);
		
		click(orders);
		Thread.sleep(2000);
		click(Order);
		Thread.sleep(3000);   	
		click(ordermaterialshow);
    	Thread.sleep(2000);
    	click(ordermaterial);
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"grid-container\"]/div/div[5]/div/table/tbody/tr[2]/td[8]/div/div[2]/div/div[1]/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@data-value=\"2019/11/20\"]")).click(); 
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[3]/div[1]/div/div/div/span")).click();
    	Thread.sleep(2000);
        
    	
    	
        return this;
    }
    
    
    public LoginPage OrderMaterialSearch() throws InterruptedException {
    	
    	click(orders);
		Thread.sleep(2000);
		click(Order);
		Thread.sleep(2000);   	
		click(ordermaterialshow);
    	Thread.sleep(3000);
    	click(ordermaterial);
    	Thread.sleep(3000);
    	
    	
    	Thread.sleep(3000);
    	
        writeText(Quantity,"7000");
     	Thread.sleep(2000);
        click(Quantity);
        Thread.sleep(2000);
        
    	
        
        return this;
    }
    
   
    
        
    
    /*--------------------------------------------------------------------------------------------------*/
    public LoginPage InvalidAddRouting() throws InterruptedException {
    	click(definitions);
    	Thread.sleep(1000);
    	click(routing);
    	Thread.sleep(1000);
        click(addRouting);
        Thread.sleep(1000);
        click(save);
        Thread.sleep(1000);
        click(cancel);
        Thread.sleep(1000);
        
        return this;
    }
        
    public LoginPage AddRouting() throws InterruptedException {
    	click(milkrun);
    	Thread.sleep(1000);
    	click(routing);
    	Thread.sleep(1000);
        click(addRouting);
        Thread.sleep(1000);
        writeText(routingName,"Itelli routing");
        Thread.sleep(1000);
        writeText(routingDefinition,"Itelli definiton");
        Thread.sleep(1000); 
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@data-value=\"2019/09/20\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[4]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
        Thread.sleep(1000);
         
        driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[3]/div[1]/div/div/div")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//*[@data-value=\"2019/09/25\"]")).click();
        Thread.sleep(2000);
        
         
        click(save);
        Thread.sleep(1000);
        
        return this;
    }
    
    public LoginPage RoutingSearch() throws InterruptedException {
    	click(milkrun);
    	Thread.sleep(1000);
    	click(routing);
    	Thread.sleep(2000);
    	writeText(routingsearch,"Routing");
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage EditRoutingDefinition() throws InterruptedException {
    	click(milkrun);
    	Thread.sleep(1000);
    	click(routing);
    	Thread.sleep(2000);
    	click(routingedit);
    	Thread.sleep(1000);   	
    	
    	writeText(routingName,"e");
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage DeleteRoutingDefinition() throws InterruptedException {
    	click(milkrun);
    	Thread.sleep(1000);
    	click(routing);
    	Thread.sleep(2000);
    	click(routingdelete);
    	Thread.sleep(1000);  
    	driver.findElement(By.xpath("//*[contains(text(),\"Yes\")]")).click();
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    
    /*--------------------------------------------------------------------------------------------------*/
    public LoginPage EmptyAddOrderPallet() throws InterruptedException {
    	click(order);
    	Thread.sleep(3000);
    	click(orderpallet);
    	Thread.sleep(3000);
    	click(addOrderPallet);
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    
    	
    	return this;	
    }   
    
    public LoginPage InvalidAddOrderPallet() throws InterruptedException {
    	click(order);
    	Thread.sleep(1000);
    	click(orderpallet);
    	Thread.sleep(2000);
    	click(addOrderPallet);
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), '2')]")))).click();
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(1000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'Standart Palet')]")))).click();
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(1000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'ABC Lojistik')]")))).click();
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div[1]/input")).sendKeys("-5");
    	Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[3]/div/div[1]/div/div/div/div/div/div[1]/input")).sendKeys("-4");	
        Thread.sleep(1000);
        
        click(save);
    	Thread.sleep(1000);
    	
    	
    	return this;	
    }   
    
    
    /*--------------------------------------------------------------------------------------------------*/
    public LoginPage EmptyAddOrderTruck() throws InterruptedException {
    	
    	click(order);
    	Thread.sleep(1000);
    	
    	click(ordertruck);
    	Thread.sleep(2000);
    	click(addOrderTruck);
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage InvalidAddOrderTruck() throws InterruptedException {
    	click(order);
    	Thread.sleep(1000);
    	click(ordertruck);
    	Thread.sleep(2000);
    	click(addOrderTruck);
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(1000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), '2')]")))).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(1000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), '34 key 546')]")))).click();
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div[1]/input")).sendKeys("-5");
    	Thread.sleep(1000);
    	
    	
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage AddOrderTruck() throws InterruptedException {
    	click(ordertruck);
    	Thread.sleep(2000);
    	click(addOrderTruck);
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(1000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), '2')]")))).click();
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(1000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), '34 key 546')]")))).click();
    	Thread.sleep(1000);
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div[2]/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div[1]/input")).sendKeys("15");
    	Thread.sleep(1000);
    	
    	
    	click(save);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    /*--------------------------------------------------------------------------------------------------*/
    
    
     
    public LoginPage EmptyAddPermission() throws InterruptedException{
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	
    	//click(settingsclick);
    	Thread.sleep(1000);
    	click(permission);
    	Thread.sleep(2000);
    	click(addPermission);
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }

    public LoginPage InvalidAddPermission() throws InterruptedException{
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(1000);
    	click(permission);
    	Thread.sleep(2000);
    	click(addPermission);
    	Thread.sleep(1000);

    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'Account')]")))).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(), 'Register')]")))).click();
    	Thread.sleep(1000);
    	
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }

    public LoginPage AddPermission() throws InterruptedException{
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(1000);
    	click(permission);
    	Thread.sleep(2000);
    	click(addPermission);
    	Thread.sleep(1000);

    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[contains(text(), 'Account')]")))).click();
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(), 'Register')]")))).click();
    	Thread.sleep(1000);
    	
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }
  
    /*--------------------------------------------------------------------------------------------------*/
    
    public LoginPage EmptyAddDomain() throws InterruptedException{
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(3000);
    	click(domain);
    	Thread.sleep(3000);
    	click(addDomain);
    	Thread.sleep(3000);
    	click(save);
    	Thread.sleep(2000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage InvalidAddDomain() throws InterruptedException{
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(1000);
    	click(domain);
    	Thread.sleep(2000);
    	click(addDomain);
    	Thread.sleep(2000);
    	writeText(domainUrl,"www.test");
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(2000);
    	click(cancel);
    	
    	return this;
    }
    public LoginPage AddDomain() throws InterruptedException{
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(1000);
    	click(domain);
    	Thread.sleep(2000);
    	click(addDomain);
    	Thread.sleep(1000);
    	writeText(domainUrl,"http://www.test.com");
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(1000);
    	click(domainDelete);
    	Thread.sleep(1000);
    	click(domainYes);
    	Thread.sleep(1000);

     	return this;
 
}
/*-----------------------------------------------------------------------*/
    
    public LoginPage EmptyAddPermissionName() throws InterruptedException{
    	click(settingsclick);
    	Thread.sleep(1000);
    	click(permissionname);
    	Thread.sleep(2000);
    	click(addPermissionName);
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage AddPermissionName() throws InterruptedException{
    	click(settingsclick);
    	Thread.sleep(1000);
    	click(permissionname);
    	Thread.sleep(2000);
    	click(addPermissionName);
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div/div[1]/input")).sendKeys("Itelli-Day");
    	Thread.sleep(1000);
        
    	click(save);
    	Thread.sleep(1000);
    	
    	return this;
    }
    /*--------------------------------------------------------------------------------------------------*/
    public LoginPage EmptyAddMessageTemplate() throws InterruptedException{
    	Thread.sleep(2000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(2000);
    	click(messagetemplate);
    	Thread.sleep(2000);
    	click(addMessageTemplate);
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(2000);
    	click(cancel);
    	Thread.sleep(2000);
    	
    	return this;
    }
    public LoginPage InvalidAddMessageTemplate() throws InterruptedException{
    	Thread.sleep(2000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(2000);
    	click(messagetemplate);
    	Thread.sleep(2000);
    	click(addMessageTemplate);
    	Thread.sleep(2000);
    	writeText(messageTemplateName,"-5");
    	Thread.sleep(2000);
    	writeText(messageTemplateSubject,"%Store.Name%. New news task.");
    	Thread.sleep(2000);
    	writeText(messageTemplateBody,"Body");
    	Thread.sleep(1000);	
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	
    	
    	return this;
    }
    
    public LoginPage AddMessageTemplate() throws InterruptedException{
    	Thread.sleep(2000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(2000);
    	click(messagetemplate);
    	Thread.sleep(2000);
    	click(addMessageTemplate);
    	Thread.sleep(2000);
    	writeText(messageTemplateName,"İtelli");
    	Thread.sleep(2000);
    	writeText(messageTemplateSubject,"%Store.Name%. New news task.");
    	Thread.sleep(2000);
    	writeText(messageTemplateBody,"Body");
    	Thread.sleep(1000);
    	
    	
    	click(save);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage MessageTemplateSearch() throws InterruptedException{
    	click(milkrun);
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings\"]/a")).click();
    	
    	//click(settingsclick);
    	Thread.sleep(1000);
    	click(messagetemplate);
    	Thread.sleep(1000);
    	
    	writeText(messageTemplateSearchName,"New");
    	Thread.sleep(1000);
    	click(messageTemplateSearchName);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    /*--------------------------------------------------------------------------------------------------*/
    
    
    public LoginPage EmptyAddLanguage() throws InterruptedException{
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(2000);
    	click(languages);
    	Thread.sleep(3000);
    	click(addLanguage);
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(2000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage InvalidAddLanguage() throws InterruptedException{
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(1000);
    	click(languages);
    	Thread.sleep(2000);
    	click(addLanguage);
    	Thread.sleep(1000);
    	writeText(LanguageName,"England");
    	Thread.sleep(1000);
    	writeText(LanguageCulture,"UK");
    	Thread.sleep(1000);
    	writeText(LanguageFlag,"Testasdadsfsfsdfsfsfsfsfsfsfsfsfsgdgdfgdgsdfsfsfsfsfsfsfsfsfsfssfsfsffsfssdfsfs");
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    
    public LoginPage AddLanguage() throws InterruptedException{
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(1000);
    	click(languages);
    	Thread.sleep(2000);
    	click(addLanguage);
    	Thread.sleep(1000);
    	writeText(LanguageName,"England");
    	Thread.sleep(1000);
    	writeText(LanguageCulture,"UK");
    	Thread.sleep(1000);
    	writeText(LanguageFlag,"Test");
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(1000);
    	click(languageDelete);
    	Thread.sleep(1000);
    	click(languageYes);
    	
    	return this;
    }
    
    public LoginPage LanguageSearch() throws InterruptedException{
    	click(milkrun);
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings\"]/a")).click();
    	Thread.sleep(1000);
    	click(languages);
    	Thread.sleep(2000);
    	writeText(LanguageSearchName,"English");
    	
    	Thread.sleep(2000);
    	
    	return this;
    }
    
    /*--------------------------------------------------------------------------------------------------*/
    public LoginPage EmptyAddModule() throws InterruptedException{
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(1000);
    	click(module);
    	Thread.sleep(2000);
    	click(addModule);
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }
   
    public LoginPage InvalidAddModule() throws InterruptedException{
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(1000);
    	click(module);
    	Thread.sleep(2000);
    	click(addModule);
    	Thread.sleep(1000);
    	writeText(moduleName,"-5");
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage AddModule() throws InterruptedException{
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(1000);
    	click(module);
    	Thread.sleep(2000);
    	click(addModule);
    	Thread.sleep(1000);
    	writeText(moduleName,"Cons");
    	click(save);
    	Thread.sleep(1000);
    	
    	return this;
    }
     
    /*--------------------------------------------------------------------------------------------------*/
    public LoginPage EmptyAddRegion() throws InterruptedException{
    	click(definitions);
    	Thread.sleep(2000);
    	click(definitionsportal);    	
    	Thread.sleep(2000);
    	Thread.sleep(2000);
    	click(region);
    	Thread.sleep(2000);
    	click(addRegion);
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage InvalidAddRegion() throws InterruptedException{
    	click(definitions);
    	Thread.sleep(2000);
    	click(definitionsportal);    	
    	Thread.sleep(2000);
    	Thread.sleep(2000);
    	click(region);
    	Thread.sleep(2000);
    	click(addRegion);
    	Thread.sleep(2000);
    	writeText(regionName,"4564");
    	Thread.sleep(1000);
    	writeText(regionDescription,"Bölge");
    	Thread.sleep(1000);  	
    	click(save);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage AddRegion() throws InterruptedException{
    	click(definitions);
    	Thread.sleep(2000);
    	click(definitionsportal);    	
    	Thread.sleep(2000);
    	Thread.sleep(2000);
    	click(region);
    	Thread.sleep(2000);
    	click(addRegion);
    	
    	Thread.sleep(1000);
    	writeText(regionName,"Akdeniz");
    	Thread.sleep(1000);
    	writeText(regionDescription,"Bölge");
    	Thread.sleep(1000);  	
    	click(save);
    	Thread.sleep(1000);
    	click(deleteregion);
    	Thread.sleep(1000);
    	click(regionyes);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage RegionSearch() throws InterruptedException {
    	click(milkrun);
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings\"]/a")).click();
    	
    	//WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(region)));
    	driver.findElement(region).click();
    	
    	Thread.sleep(2000);
    	writeText(regionSearchName,"Marmara");
    	Thread.sleep(3000);
    	click(region);
    	Thread.sleep(2000);  	
      	writeText(regionSearchDesription,"Marmara Bölgesi");
    	Thread.sleep(2000);
    	click(orderpackageWeight);
    	
    	return this;    	
    }
    
    /*--------------------------------------------------------------------------------------------------*/
    public LoginPage EmptyAddRegionRelations() throws InterruptedException{
    	click(milkrun);
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings\"]/a/i")).click();
    	
    	Thread.sleep(2000);
    	click(regionrelations);
    	Thread.sleep(2000);
    	click(addRegionRelations);
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage AddRegionRelations() throws InterruptedException{
    	click(milkrun);
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings\"]/a")).click();
    	
    	//WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(regionrelations)));
    	driver.findElement(regionrelations).click();
    	
    	
    	Thread.sleep(2000);
    	click(addRegionRelations);
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(), 'Marmara')]")))).click();
    	Thread.sleep(1000);  	
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[contains(text(), 'Marmara')]")))).click();
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(2000);
    	
    	return this;
    }
    
    /*--------------------------------------------------------------------------------------------------*/
    
    public LoginPage EmptyAddCustomerCompany() throws InterruptedException{
    	click(definitions);
    	Thread.sleep(3000);
    	click(definitionsportal);
    	Thread.sleep(3000);     
    	click(customercompany);
    	Thread.sleep(3000);
    	click(addCustomerCompany);
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage InvalidAddCustomerCompany() throws InterruptedException{
    	click(definitions);
    	Thread.sleep(3000);
    	click(definitionsportal);
    	Thread.sleep(3000);  	
    	click(customercompany);
    	Thread.sleep(3000);
    	click(addCustomerCompany);
    	Thread.sleep(2000);
    	writeText(customercompanyName,"itelli ");
    	Thread.sleep(2000);
    	writeText(customercompanyWebsite,"www.itelli.com");
    	Thread.sleep(2000);
    	writeText(customercompanyLogo,"-9");
    	Thread.sleep(2000);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div"))));
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[contains(text(), 'Transporter')]")).click();
    	Thread.sleep(2000);	
    	click(save);
    	Thread.sleep(2000);
    	click(cancel);
    	Thread.sleep(2000);
    	
    	return this;
    }
    
    public LoginPage AddCustomerCompany() throws InterruptedException{
    	click(definitions);
    	Thread.sleep(1000);
    	click(definitionsportal);
    	Thread.sleep(1000);  	
    	click(customercompany);
    	Thread.sleep(2000);
    	click(addCustomerCompany);
    	Thread.sleep(2000);
    	writeText(customercompanyName,"itelli");
    	Thread.sleep(2000);
    	writeText(customercompanyWebsite,"www.itelli.com");
    	Thread.sleep(1000);
    	writeText(customercompanyLogo,"Test");
    	Thread.sleep(1000);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div"))));
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//div[contains(text(), 'Transporter')]")).click();
    	Thread.sleep(1000);	
    	click(save);
    	Thread.sleep(1000);
    	click(customercompanydelete);
    	Thread.sleep(1000);
    	click(customercompanyyes);
    	return this;
    }
    /*--------------------------------------------------------------------------------------------------*/
     
    public LoginPage EmptyAddCompanyAdress() throws InterruptedException{
    	click(definitions);
    	Thread.sleep(2000);
    	click(definitionsportal);
    	Thread.sleep(2000);     
    	click(customercompany);
    	Thread.sleep(2000);
    	click(companyadress);
    	Thread.sleep(2000);
    	click(addCustomerCompanyAdress);
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage InvalidAddCompanyAdress() throws InterruptedException{
    	click(definitions);
    	Thread.sleep(2000);
    	click(definitionsportal);
    	Thread.sleep(2000);     
    	click(customercompany);
    	Thread.sleep(2000);
    	click(companyadress);
    	Thread.sleep(2000);
    	click(addCustomerCompanyAdress);
    	Thread.sleep(1000);
    	
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }
   
    public LoginPage AddCompanyAdress() throws InterruptedException{
    	click(definitions);
    	Thread.sleep(2000);
    	click(definitionsportal);
    	Thread.sleep(2000);     
    	click(customercompany);
    	Thread.sleep(2000);
    	click(companyadress);
    	Thread.sleep(2000);
    	click(addCustomerCompanyAdress);
    	Thread.sleep(1000);
    	
    	click(save);
    	Thread.sleep(1000);
    	
    	
    	return this;
    }
   
    /*--------------------------------------------------------------------------------------------------*/
    
    public LoginPage EmptyAddLocalization() throws InterruptedException{
    	Thread.sleep(2000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(2000);
    	click(localization);
    	Thread.sleep(3000);
    	click(addLocalization);
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(2000);
    	click(cancel);
    	Thread.sleep(2000);
    	
    	return this;
    }
    public LoginPage InvalidAddLocalization() throws InterruptedException{
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(2000);
    	click(localization);
    	Thread.sleep(2000);
    	click(addLocalization);
    	Thread.sleep(2000);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(localizationLanguage)));
    	driver.findElement(localizationLanguage).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[contains(text(), 'Türkçe')]")).click();
    	Thread.sleep(2000);
    	writeText(localizationResourceValue,"-5");
    	Thread.sleep(2000);
    	writeText(localizationResourceName,"User-contact");
    	Thread.sleep(1000);   	
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage AddLocalization() throws InterruptedException{
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(2000);
    	click(localization);
    	Thread.sleep(2000);
    	click(addLocalization);
    	Thread.sleep(2000);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(localizationLanguage)));
    	driver.findElement(localizationLanguage).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[contains(text(), 'Türkçe')]")).click();
    	Thread.sleep(2000);
    	writeText(localizationResourceValue,"User-contact");
    	Thread.sleep(2000);
    	writeText(localizationResourceName,"User-contact");
    	Thread.sleep(1000);	
    	click(save);
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"grid-container\"]/div[1]/div[11]/div[2]/div[8]")).click();
    	Thread.sleep(1000);
    	click(localizationDelete);
    	Thread.sleep(1000);
    	click(localizationYes);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage LocalizationSearch() throws InterruptedException{
    	click(milkrun);
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(2000);
    	click(localization);
    	Thread.sleep(2000);
        writeText(localizationSearchResourceN,"Loading");
        Thread.sleep(1000);
        
        click(localizationSearchResourceN);
        Thread.sleep(2000);
        
    	
    	return this;
    }
    
    
    /*--------------------------------------------------------------------------------------------------*/
    
    public LoginPage EmptyAddLookup() throws InterruptedException{
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(2000);
    	click(lookup);
    	Thread.sleep(2000);
    	click(addLookup);
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(2000);
    	click(cancel);
    	Thread.sleep(2000);
    	
    	return this;
    }
    public LoginPage InvalidAddLookup() throws InterruptedException{
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(2000);
    	click(lookup);
    	Thread.sleep(2000);
    	click(addLookup);
    	Thread.sleep(1000);
    	writeText(lookupName,"-5");
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(2000);
    	click(cancel);
    	Thread.sleep(2000);
    	
    	return this;
    }
    public LoginPage AddLookup() throws InterruptedException{
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(2000);
    	click(lookup);
    	Thread.sleep(2000);
    	click(addLookup);
    	Thread.sleep(1000);
    	writeText(lookupName,"Contact");
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(2000);
    	
    	return this;
    }
    
    /*--------------------------------------------------------------------------------------------------*/

    public LoginPage EmptyAddCountry() throws InterruptedException{
    	Thread.sleep(2000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(2000);
    	click(country);
    	Thread.sleep(3000);
    	click(addCountry);
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(2000);
    	click(cancel);
    	Thread.sleep(2000);
    	
    	return this;
    }
    
    public LoginPage InvalidAddCountry() throws InterruptedException{
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(2000);
    	click(country);
    	Thread.sleep(3000);
    	click(addCountry);
    	Thread.sleep(3000);
    	writeText(countryName,"-9");
    	click(save);
    	Thread.sleep(2000);
    	click(cancel);
    	Thread.sleep(2000);
    	
    	return this;
    }
    
    public LoginPage AddCountry() throws InterruptedException{
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(2000);
    	click(country);
    	Thread.sleep(2000);
    	click(addCountry);
    	Thread.sleep(2000);
    	writeText(countryName,"Ukraine");
    	Thread.sleep(2000);
    	
    	click(save);
    	Thread.sleep(1000);
    	click(countryDelete);
    	Thread.sleep(1000);
    	click(countryYes);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    /*--------------------------------------------------------------------------------------------------*/

    public LoginPage EmptyAddSystemSettings() throws InterruptedException{
    	Thread.sleep(2000);
    	click(systemsettings);
    	Thread.sleep(2000);
    	click(addSystemSettings);
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(2000);
    	click(cancel);
    	Thread.sleep(2000);
    	
    	return this;
    }
   
    public LoginPage AddSystemSettings() throws InterruptedException{
    	Thread.sleep(2000);
    	click(systemsettings);
    	Thread.sleep(2000);
    	click(addSystemSettings);
    	Thread.sleep(1000);
    	writeText(systemsettingsName,"GridTest");
    	Thread.sleep(1000);
    	writeText(systemsettingsValue,"5");
    	
    	click(save);
    	Thread.sleep(2000);
    	
    	return this;
    }
    /*--------------------------------------------------------------------------------------------------*/
 
    
    public LoginPage EmptyAddContacts() throws InterruptedException{
    	click(definitions);
    	Thread.sleep(3000);
    	click(definitionsportal);
    	Thread.sleep(3000);
    	click(contacts);
    	Thread.sleep(3000);
    	click(addContacts);
    	Thread.sleep(3000);
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    public LoginPage InvalidAddContact() throws InterruptedException{
    	click(definitions);
    	Thread.sleep(3000);
    	click(definitionsportal);
    	Thread.sleep(3000);
    	click(contacts);
    	Thread.sleep(2000);
    	click(addContacts);
    	Thread.sleep(3000);   	
    	writeText(FirstName,RandomFirstName());
    	Thread.sleep(2000);        
    	writeText(LastName,RandomLastName());
    	Thread.sleep(2000);
    	writeText(NewUserName,getSaltString());
    	Thread.sleep(2000);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div"))));
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	driver.findElement(By.xpath("//div[contains(text(), 'Driver')]")).click();
    	
    	Thread.sleep(2000);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[3]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div"))));
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[3]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[contains(text(), 'Active')]")).click();
    	Thread.sleep(2000);
    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[3]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div"))));
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[3]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[contains(text(), 'FullTime')]")).click();
    	Thread.sleep(2000);
    	
    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[4]/div/div[1]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div"))));
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[4]/div/div[1]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[contains(text(), 'ABC Lojistik')]")).click();
    	
    	Thread.sleep(2000);
    	
    	//writeText(UserCellPhone,"5555554545");
    	writeText(UserMail,"xxx");
    	Thread.sleep(2000);
    	click(save);    	
		Thread.sleep(2000);
		click(cancel);    	
		Thread.sleep(2000);
		
		
       	return this;
    }
    
    public LoginPage AddContact() throws InterruptedException{
    	click(definitions);
    	Thread.sleep(3000);
    	click(definitionsportal);
    	Thread.sleep(3000);
    	click(contacts);
    	Thread.sleep(3000);
    	click(addContacts);
    	Thread.sleep(2000);   	
    	writeText(FirstName,RandomFirstName());
    	Thread.sleep(2000);        
    	writeText(LastName,RandomLastName());
    	Thread.sleep(2000);
    	writeText(NewUserName,getSaltString());
    	Thread.sleep(2000);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div"))));
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	driver.findElement(By.xpath("//div[contains(text(), 'Driver')]")).click();
    	
    	Thread.sleep(2000);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[3]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div"))));
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[3]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[contains(text(), 'Active')]")).click();
    	Thread.sleep(2000);
    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[3]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div"))));
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[3]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[contains(text(), 'FullTime')]")).click();
    	Thread.sleep(2000);
    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[4]/div/div[1]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div"))));
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[4]/div/div[1]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[contains(text(), 'ABC Lojistik')]")).click();
    	
    	Thread.sleep(2000);
    	
    	writeText(UserCellPhone,"5555554545");
    	Thread.sleep(1000);
    	writeText(UserMail,"http:/burakalper45@test.com");
    		Thread.sleep(1000); 	
		click(save);
		Thread.sleep(2000); 
		click(contactdelete);
		Thread.sleep(2000); 
		click(yes);
		Thread.sleep(1000); 
		
		return this;
    }
    
    public LoginPage DeleteContact() throws InterruptedException{
    	click(definitions);
    	Thread.sleep(1000);
    	click(definitionsportal);
    	Thread.sleep(2000);
    	click(contacts);
    	Thread.sleep(2000);
    
    	return this;
    }
    
    
    /*--------------------------------------------------------------------------------------------------*/
  
    public LoginPage EmptyAddUser() throws InterruptedException{
    	click(definitions);
    	Thread.sleep(3000);
    	click(definitionsportal);
    	Thread.sleep(3000);
    	click(users);
    	Thread.sleep(4000);
    	click(newcreateuser);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/input"))));    	
    	
    	Thread.sleep(3000);
    	click(save);
    	Thread.sleep(2000);
    	click(cancel);
    	Thread.sleep(3000);
    	
    	return this;
    }
    
    public LoginPage InvalidAddUser() throws InterruptedException{
    	click(definitions);
    	Thread.sleep(3000);
    	click(definitionsportal);    	
    	Thread.sleep(3000);
    	click(users);
    	Thread.sleep(4000);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div/i"))));
    	click(newcreateuser);
    	Thread.sleep(3000);   	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/input"))));    	
    	writeText(FirstName,RandomFirstName());
    	Thread.sleep(2000);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div[1]/input"))));    	
    	
    	writeText(LastName,RandomLastName());
    	Thread.sleep(2000);
    	writeText(NewUserName,getSaltString());
    	Thread.sleep(2000);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div"))));
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	driver.findElement(By.xpath("//div[contains(text(), 'Driver')]")).click();
    	
    	Thread.sleep(2000);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[3]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div"))));
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[3]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[contains(text(), 'Active')]")).click();
    	Thread.sleep(1000);
    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[3]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div"))));
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[3]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[contains(text(), 'FullTime')]")).click();
    	Thread.sleep(2000);
    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[4]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div"))));
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[4]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[contains(text(), 'ABC Lojistik')]")).click();
    	Thread.sleep(2000);
    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[4]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div"))));
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[4]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[contains(text(), 'Türkçe')]")).click();
    	Thread.sleep(2000);
    	writeText(UserCellPhone,"905555554545");
    	Thread.sleep(2000);
    	writeText(UserExtension,"123");
    	Thread.sleep(2000); 
    	writeText(UserDescription,"information");
    	Thread.sleep(2000); 
    	writeText(UserFax,"909998887766");
    	Thread.sleep(2000); 
    	  	
    	//writeText(UserCellPhone,"5555554545");
    	Thread.sleep(2000);
    	writeText(UserMail,"xxx");
    	Thread.sleep(2000);
    	click(save);    	
		Thread.sleep(1000);
		click(cancel);    	
		Thread.sleep(1000);
		
		
       	return this;
    }
    
    public LoginPage UserSearch() throws InterruptedException{
    	click(milkrun);
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings\"]/a")).click();
    	Thread.sleep(2000);
    	click(users);
    	Thread.sleep(2000);
    	
    	writeText(userSearchName,"Mahmut");
    	Thread.sleep(1000);
    	click(userSearchName);
    	Thread.sleep(2000);
    	click(users);
    	Thread.sleep(1000);
    	writeText(userSearchMail,"ramazan@yahoo.com");
    	Thread.sleep(1000);
    	click(userSearchMail);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    /*--------------------------------------------------------------------------------------------------*/
      
    public LoginPage EmptyPendingOrderFilter() throws InterruptedException{
    	click(tecedekor);
    	Thread.sleep(1000);
    	click(pendingorderreport);
    	Thread.sleep(1000);
    	
    	click(showresult);
    	Thread.sleep(3000);
    	
    	return this;
    }
    
    
    public LoginPage InvalidPendingOrderFilter() throws InterruptedException{
    	click(tecedekor);
    	Thread.sleep(1000);
    	click(pendingorderreport);
    	Thread.sleep(1000);
    	writeText(materialdata,"abc");
    	Thread.sleep(1000);    	
    	click(OrderDetailCheck);
    	Thread.sleep(1000);    	
    	click(showresult);
    	Thread.sleep(3000);
    	
    	return this;
    }
    
    /*--------------------------------------------------------------------------------------------------*/
     
    public LoginPage ShowingHostInfo() throws InterruptedException{
    	click(logoutButtonClick);
    	Thread.sleep(1000);
    	click(info);
    	Thread.sleep(1000);
    	
    	return this;
    }
    
    /*--------------------------------------------------------------------------------------------------*/
    
    public LoginPage ShowingProfile() throws InterruptedException{
    	click(logoutButtonClick);
    	Thread.sleep(2000);
    	click(profile);
    	Thread.sleep(3000);
    	writeText(description,"Test");
    	Thread.sleep(2000);
    	
    	return this;
    }
    
    /*--------------------------------------------------------------------------------------------------*/
    
    public LoginPage LogoutPage() throws InterruptedException{
    	
    	click(logoutButtonClick);
    	Thread.sleep(1000);
    	click(logoutButtonXpath);
    	Thread.sleep(1000);
    	return this;
    	
    }
    public LoginPage CreateUser() throws InterruptedException{
    	click(definitions);
    	Thread.sleep(3000);
    	click(definitionsportal);    	
    	Thread.sleep(3000);
    	click(users);
    	Thread.sleep(4000);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"grid-container\"]/div/div[4]/div/div/div[3]/div[1]/div/div/div/i"))));
    	click(newcreateuser);
    	Thread.sleep(3000);   	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div/div/div/div/div[1]/input"))));    	
    	writeText(FirstName,RandomFirstName());
    	Thread.sleep(2000);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div/div/div[1]/input"))));    	
    	
    	writeText(LastName,RandomLastName());
    	Thread.sleep(2000);
    	writeText(NewUserName,getSaltString());
    	Thread.sleep(2000);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div"))));
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);    	
    	driver.findElement(By.xpath("//div[contains(text(), 'Driver')]")).click();
    	
    	Thread.sleep(2000);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[3]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div"))));
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[3]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[contains(text(), 'Active')]")).click();
    	Thread.sleep(1000);
    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[3]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div"))));
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[3]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[contains(text(), 'FullTime')]")).click();
    	Thread.sleep(2000);
    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[4]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div"))));
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[4]/div/div[1]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[contains(text(), 'ABC Lojistik')]")).click();
    	Thread.sleep(2000);
    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[4]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div"))));
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[4]/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[contains(text(), 'Türkçe')]")).click();
    	Thread.sleep(2000);
    	writeText(UserCellPhone,"905555554545");
    	Thread.sleep(2000);
    	writeText(UserExtension,"123");
    	Thread.sleep(2000); 
    	writeText(UserDescription,"information");
    	Thread.sleep(2000); 
    	writeText(UserFax,"909998887766");
    	Thread.sleep(2000); 
    	  	
    	//writeText(UserCellPhone,"5555554545");
    	Thread.sleep(2000);
    	writeText(UserMail,"burakalper45@test.com");
    	Thread.sleep(2000);
    	click(save);    	
		Thread.sleep(3000); 	
		click(deleteUser);
		Thread.sleep(2000); 	
		
		click(yes);
		Thread.sleep(3000); 	
		
		return this;
    }
    
    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
    public String RandomFirstName() throws InterruptedException{
        
    	String[] names = {"Ali", "Mesut", "Hakan", "Senol", "Sefa"};
   long randno=(Math.round((Math.random()*3))); 
    	String User=names[(int) randno];
    	
    	return User;
    }
    
    
public String RandomLastName() throws InterruptedException{
        
    	String[] names = {"Gümüs", "Simsek", "Ak", "Demir", "Doğan"};
   long randnum=(Math.round((Math.random()*3))); 
    	String Lastname=names[(int) randnum];
    	return Lastname;
    }

/*--------------------------------------------------------------------------------------------------*/
  
    public LoginPage EmptyAddCompany() throws InterruptedException {
    	Thread.sleep(3000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(3000);
    	click(company);
    	Thread.sleep(3000);
    	click(addCompany);
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }
    public LoginPage InvalidAddCompany() throws InterruptedException {
    	Thread.sleep(2000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(2000);
    	click(company);
    	Thread.sleep(2000);
    	click(addCompany);
    	Thread.sleep(1000);
    	writeText(CompanyName,"-9");
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(1000);
    	
    	return this;
    }
 
    
    public LoginPage AddCompany() throws InterruptedException {
    	Thread.sleep(2000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(2000);
    	click(company);
    	Thread.sleep(2000);
    	click(addCompany);
    	Thread.sleep(1000);
    	writeText(CompanyName,"İtelliTest");
    	Thread.sleep(1000);
    	click(save);
    	Thread.sleep(1000);
    	
    	return this;
    }
    /*--------------------------------------------------------------------------------------------------*/
    public LoginPage EmptyAddReportDefinition() throws InterruptedException {
    
    	click(definitions);
    	Thread.sleep(2000);
    	click(definitionsportal);
    	Thread.sleep(2000);     
    	click(reportDefinition);
    	Thread.sleep(2000);     
    	click(addreportDefinition);
    	Thread.sleep(2000);     
    	click(save);
    	Thread.sleep(2000);     
    	click(cancel);
    	Thread.sleep(2000);     
    	
    	return this;
    }
    
    public LoginPage InvalidAddReportDefinition() throws InterruptedException {
        
    	click(definitions);
    	Thread.sleep(2000);
    	click(definitionsportal);
    	Thread.sleep(2000);     
    	click(reportDefinition);
    	Thread.sleep(2000);     
    	click(addreportDefinition);
    	Thread.sleep(2000); 
    	writeText(reportDefinitionName,"report");
    	Thread.sleep(2000); 
    	writeText(reportDefinitionPath,"-9");
    	Thread.sleep(2000); 
    	
    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div"))));
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[contains(text(), 'Report 1')]")).click();
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(2000);     
    	click(cancel);
    	
    	return this;
    }
public LoginPage AddReportDefinition() throws InterruptedException {
        
    	click(definitions);
    	Thread.sleep(2000);
    	click(definitionsportal);
    	Thread.sleep(2000);     
    	click(reportDefinition);
    	Thread.sleep(2000);     
    	click(addreportDefinition);
    	Thread.sleep(2000); 
    	writeText(reportDefinitionName,"report");
    	Thread.sleep(2000); 
    	writeText(reportDefinitionPath,"path");
    	Thread.sleep(2000); 
    	
    	
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div"))));
    	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[2]/div[2]/div/div")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[contains(text(), 'Report 1')]")).click();
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(2000);     
    	click(deletereport);
    	
    	return this;
    }
    
    /*--------------------------------------------------------------------------------------------------*/
    public LoginPage EmptyAddReportMenu() throws InterruptedException {
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(2000);
    	click(reportmenu);
    	Thread.sleep(2000);
    	click(addReportMenu);
    	Thread.sleep(2000);
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }
    public LoginPage InvalidAddReportMenu() throws InterruptedException {
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(1000);
    	click(reportmenu);
    	Thread.sleep(2000);
    	click(addReportMenu);
    	Thread.sleep(2000);
    	writeText(ReportName,"Report");
    	Thread.sleep(1000);
    	writeText(ReportIndex,"3");
    	Thread.sleep(1000);
        	
    	click(save);
    	Thread.sleep(1000);
    	click(cancel);
    	Thread.sleep(1000);
    	
    	return this;
    }
 
    public LoginPage AddReportMenu() throws InterruptedException {
    	Thread.sleep(1000);
    	WebDriverWait wait = new WebDriverWait(driver, 15);
    	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a/i"))));
    	driver.findElement(By.xpath("//*[@id=\"Settings-84\"]/a")).click();
    	Thread.sleep(1000);
    	click(reportmenu);
    	Thread.sleep(2000);
    	click(addReportMenu);
    	Thread.sleep(2000);
    	writeText(ReportName,"Report");
    	Thread.sleep(1000);
    	writeText(ReportIndex,"1");
    	Thread.sleep(1000);       	
    	click(save);
    	Thread.sleep(1000);
    	click(ReportDelete);
    	Thread.sleep(1000);
    	click(ReportYes);
    	Thread.sleep(1000);
    	
    	
    	return this;
    }
 
  /*--------------------------------------------------------------------------------------------------*/
    
  
  /*--------------------------------------------------------------------------------------------------*/
      
    public LoginPage verifyLoginUserName(String expectedText) {
        waitVisibility(errorMessageUsernameXpath);
        Assert.assertEquals(readText(errorMessageUsernameXpath), expectedText);
        return this;
    }
    
    
 
    public LoginPage verifyLoginPassword(String expectedText) {
        waitVisibility(errorMessagePasswordXpath);
        Assert.assertEquals(readText(errorMessagePasswordXpath), expectedText);
        return this;
    }
    
	
}