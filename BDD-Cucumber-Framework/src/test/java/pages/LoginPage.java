package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@type='text']")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement loginBtn;

    @FindBy(xpath = "//*[@class='GoogleButton_externalLink__TpIpV GoogleButton_Primary__VVuAI']")
    public WebElement loginViaGoogle;

    @FindBy(xpath = "//*[@class='AzureButton_externalLink__xN6AJ AzureButton_Primary__4fsFH']")
    public WebElement loginViaMicrosoft;






}
