import manager.HelperUser;
import models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        if(isLogged()) logout();
    }

//    @Test
//    public void loginPositiveTest() {
//        logger.info("LoginPositiveTest");
//        openLoginForm();
//        fillLoginForm("maria321@gmail.com", "Mm32123$");
//        submitLogin();
//        Assert.assertTrue(isLoggedSuccess());
//    }

    @Test
    public void loginPositiveTestModel() {
        logger.info("LoginPositiveTest");
        User user = new User()
                .withEmail("maria321@gmail.com")
                .withPassword("Mm32123$");
        openLoginForm();
        fillLoginForm(user);
        submitLogin();
        Assert.assertTrue(isLoggedSuccess());

    }

    @Test
    public void loginPositiveTestProp() {
        logger.info("LoginPositiveTestProp");
        openLoginForm();
        fillLoginForm(getEmail(), getPassword());
        submitLogin();
        Assert.assertTrue(isLoggedSuccess());
    }

    @AfterMethod
    public void postcondition(){
        clickOkButton();
    }
}
