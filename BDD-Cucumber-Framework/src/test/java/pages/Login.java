package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Login {
    public Login() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
