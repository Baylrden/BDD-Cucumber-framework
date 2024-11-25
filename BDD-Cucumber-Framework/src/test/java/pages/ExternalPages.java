package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ExternalPages {
    public ExternalPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@type='email']")
    public WebElement externalEmailBox;

    @FindBy(xpath = "//*[@type='password']")
    public WebElement externalPasswordBox;

    @FindBy(xpath = "//*[@class='VfPpkd-vQzf8d']")
    public WebElement googleNextBtn;

    @FindBy(xpath = "//*[@id='idSIButton9']")
    public WebElement microsoftNextBtn;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement microsoftStayBtn;

}
