package actvities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Activity7 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() {
        // Set up the Firefox driver
        WebDriverManager.firefox().setup();
        // Initialize Firefox driver object
        driver = new FirefoxDriver();
        // Initialize wait object
        wait = new WebDriverWait(driver, 10);
        
        //Open browser
        driver.get("https://v1.training-support.net/selenium/login-form");
    }
    
    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][] { { "admin", "password" }};
    }
    
    @Test (dataProvider = "Authentication")
    public void loginTestCase(String username, String password) {
        //Find username and pasword fields
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        
        //Enter values
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        
        //Click Log in
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        
        //Assert Message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMessage, "Welcome Back, admin");
    }

    @AfterClass
    public void afterClass() {
        //Close browser
        driver.close();
    }

}