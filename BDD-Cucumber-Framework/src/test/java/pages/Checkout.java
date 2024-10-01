package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Checkout {
    public Checkout() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
