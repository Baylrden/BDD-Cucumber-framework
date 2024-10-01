package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Pricing {
    public Pricing() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
