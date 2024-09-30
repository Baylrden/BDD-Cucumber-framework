package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.security.Key;

public class FacebookStepdefinitons {

    FacebookPage facebookPage = new FacebookPage();

    @Given("facebook'da yeni hesap olustur butonuna basar")
    public void facebook_da_yeni_hesap_olustur_butonuna_basar() {
        facebookPage.signUpButton.click();
    }
    @When("Faker class'indan bilgilerle facebook kayit formunu doldurur")
    public void faker_class_indan_bilgilerle_facebook_kayit_formunu_doldurur() {

        Faker faker = new Faker();
        String fakeMail = faker.internet().emailAddress();
        Actions actions = new Actions(Driver.getDriver());

        actions.sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("10")
                .sendKeys(Keys.TAB)
                .sendKeys("Mar")
                .sendKeys(Keys.TAB)
                .sendKeys("2003")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_RIGHT)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .perform();
    }
    @Then("facebook kayit ol butonuna basar")
    public void facebook_kayit_ol_butonuna_basar() {
        facebookPage.formSubmitButton.click();
    }

    @Given("user redirecting to {string}")
    public void user_redirecting_to(String redirectingUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(redirectingUrl));
    }

    @Then("waits for {int} seconds")
    public void waits_for_seconds(Integer seconds) {
        ReusableMethods.wait(seconds);
    }
    @Then("closes the page")
    public void closes_the_page() {
       Driver.quitDriver();
    }

}
