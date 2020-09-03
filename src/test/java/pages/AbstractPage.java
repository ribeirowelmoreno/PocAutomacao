package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractPage {
    protected WebDriver driver;

    public AbstractPage(WebDriver driver){this.driver = driver;}

    public void clickOnElementByCssSelector(String elementId){
        WebElement webElement = (WebElement) driver.findElement(new By.ByCssSelector(elementId));
        webElement.click();
    }

    public void checkIfElementIsVisible(String elementId){
        WebElement webElement = (WebElement) driver.findElement(new By.ByCssSelector(elementId));
        webElement.isDisplayed();
    }

    public void insertTextIntoAField(String urlText, String elementLocator){
        WebElement inputText = driver.findElement(By.cssSelector(elementLocator));
        inputText.sendKeys(urlText);
    }
}
