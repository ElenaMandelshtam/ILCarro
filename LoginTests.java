import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
    @Test
    public void loginPositiveTest() {
        // open login form
        openLoginForm();
        // fill login form
        fillLoginForm("maria321@gmail.com", "Mm32123$");
        // click on button Y'alla
        submitLogin();
        loggetIn();
        // assert
        pause(3000);
       // Assert.assertTrue(isElementPresent(By.xpath("//*[.=' Logout ']")));
        logout();
    }
}
