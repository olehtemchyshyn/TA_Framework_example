package ua.foxminded.skarb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class HomePage extends BasePageObject {
    private WebDriver driver;

    @FindBy(xpath = "//a[@href='/registration']//i")
    private WebElement registrationPlusButton;

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public RegistrationPage clickPlusButton() {
        registrationPlusButton.click();
        return new RegistrationPage(driver);
    }

}