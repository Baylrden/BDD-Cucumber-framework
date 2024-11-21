package pages;

import org.apache.commons.math3.geometry.spherical.oned.LimitAngle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PricingPage {
    public PricingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='PlanItem_plan_column__tf5CI']")
    public List<WebElement> pricingCards;
}
