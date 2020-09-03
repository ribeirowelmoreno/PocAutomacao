package pages;

import org.openqa.selenium.WebDriver;

public class SignInPage extends AbstractPage{


    final String EMAIL_FIELD = "input#email";
    final String PASSWORD_FIELD = "input#passwd";
    final String SUBMIT_LOGIN = "button#SubmitLogin";

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public SignInPage insertAValidEmailAndPassword(String email, String password){
        insertTextIntoAField(email, EMAIL_FIELD);
        insertTextIntoAField(password, PASSWORD_FIELD);

        return this;
    }

    public LoggedInPage clickOnSignInButton(){
        clickOnElementByCssSelector(SUBMIT_LOGIN);

        return new LoggedInPage(driver);
    }
}
