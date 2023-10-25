import manager.ApplicationManager;
import manager.HelperBase;
import manager.HelperCar;
import manager.HelperUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase implements HelperUser, HelperCar {

    WebDriver wd;

    @BeforeSuite
//    public void init() {
//        wd = new ChromeDriver();
//        wd.navigate().to("https://ilcarro.web.app/search");
//        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//    }
    public void setup() throws IOException {
        init();
    }

    @AfterSuite
//    public void tearDown(){
//        pause (5000);
//        wd.quit();
//    }
    public void stop(){
        pause(5000);
        tearDown();
    }

//    public void openLoginForm(){
//        wd.findElement(By.xpath("//*[.=' Log in ']")).click();
//    }

//    public void fillLoginForm(String email, String password) {
//        type(By.id("email"), email);
//        type(By.id("password"), password);
//    }

//    public void type(By locator, String text){
//        WebElement element = wd.findElement(locator);
//        element.click();
//        element.clear();
//        element.sendKeys(text);
//    }

//    public void submitLogin (){
//        wd.findElement(By.xpath("//button[@type='submit']")).click();
//    }
//
//    public boolean isLoggedSuccess (){
//        return isElementPresent(By.xpath("//h2[contains(text(),'success')]"));
//    }

//    public void pause(int millis){
//        try {
//            Thread.sleep(millis);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

//    public boolean isElementPresent(By locator){
//        return wd.findElements(locator).size() > 0;
//    }

//    public void logout(){
//        wd.findElement(By.xpath("//*[.=' Logout ']")).click();
//    }

//    public void clickOkButton(){
//        wd.findElement(By.xpath("//button[@type='button']")).click();
//    }
}
