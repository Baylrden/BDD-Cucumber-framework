package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='Login_formInput__UIRYh']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement loginBtn;


}
