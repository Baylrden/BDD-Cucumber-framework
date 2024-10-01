package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PricingPage {
    public PricingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
