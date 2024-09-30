package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "email")
    public WebElement emailKutusu;

    @FindBy(id = "pass")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//*[@name='login']")
    public WebElement loginButonu;

    @FindBy(xpath = "//*[@data-testid='open-registration-form-button']")
    public WebElement signUpButton;

    @FindBy(xpath = "//*[@name='websubmit']")
    public WebElement formSubmitButton;


}
