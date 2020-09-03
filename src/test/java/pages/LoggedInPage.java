package pages;

import org.openqa.selenium.WebDriver;

public class LoggedInPage extends AbstractPage{

    final String SHOPPING_CHART = "div.shopping_cart";
    public LoggedInPage(WebDriver driver) {
        super(driver);
    }

    public LoggedInPage checkElementVisibility(){
        checkIfElementIsVisible(SHOPPING_CHART);

        return this;
    }
}
