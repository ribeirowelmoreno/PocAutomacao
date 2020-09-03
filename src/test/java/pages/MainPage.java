package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends AbstractPage{

    final String SIGN_IN_BUTTON = "a.login";

    public MainPage(WebDriver driver) {
        super(driver);
    }


    public SignInPage clickOnSignInButton(){
        clickOnElementByCssSelector(SIGN_IN_BUTTON);
        return new SignInPage(driver);
    }
}
