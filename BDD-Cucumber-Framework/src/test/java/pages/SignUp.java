package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SignUp {
    public SignUp() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
