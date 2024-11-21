package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DashboardPage {
    public DashboardPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@class='Dashboard_Back__zU2pS']")
    public WebElement dashboardBackground;

    @FindBy(xpath = "//*[@class='Sidebar_user_info_data__TpmZm']")
    public WebElement myAccount;
}
