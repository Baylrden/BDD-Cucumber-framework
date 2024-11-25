package stepdefinitions.signUpStepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.Helper;

import java.time.Duration;

public class TC01_Stepdefinitions {

    private static final Logger log = LoggerFactory.getLogger(TC01_Stepdefinitions.class);
    HomepagePage homepagePage = new HomepagePage();
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    PricingPage pricingPage = new PricingPage();
    ExternalPages externalPages = new ExternalPages();


    @Given("User redirecting to {string}")
    public void user_redirecting_to(String redirectUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(redirectUrl));

    }

    @Given("Clicking login button and redirecting to login page")
    public void clicking_login_button_and_redirecting_to_login_page() {

        homepagePage.loginLink.click();

    }

    @Given("Writing {string} to email input")
    public void writing_to_email_input(String emailInput) {

        loginPage.emailBox.sendKeys(ConfigReader.getProperty(emailInput));

    }

    @Given("Writing {string} to password input")
    public void writing_to_password_input(String passwordInput) {

        loginPage.passwordBox.sendKeys(ConfigReader.getProperty(passwordInput));

    }

    @When("Clicking login button")
    public void clicking_login_button() {

        loginPage.loginBtn.click();

    }

    @Then("Verifying that login process is failed")
    public void verifying_that_login_process_is_failed() {

        Assert.assertTrue(loginPage.loginBtn.isDisplayed());

    }

    @Then("Waits for {int} second")
    public void waits_for_second(Integer int1) throws InterruptedException {
        Thread.sleep(1000L * int1);
    }

    @Then("Verifying that login process is successful")
    public void verifyingThatLoginProcessIsSuccessful() {

        Assert.assertTrue(pricingPage.pricingCards.get(0).isDisplayed() || dashboardPage.myAccount.isDisplayed());

    }

    @And("Clicking {string} button")
    public void clickingButton(String buttonName) {

        if(buttonName.contains("google")){

           Helper.scrollToElement(loginPage.loginViaGoogle);
           loginPage.loginViaGoogle.click();

        }
        else if(buttonName.contains("microsoft")){

            Helper.scrollToElement(loginPage.loginViaMicrosoft);
            loginPage.loginViaMicrosoft.click();

        }
    }

    @Then("Filling email input in google page")
    public void filling_email_input_in_google_page() {

        externalPages.externalEmailBox.sendKeys(ConfigReader.getProperty("googleMail")+ Keys.ENTER);

    }
    @Then("Clicking next button")
    public void clicking_next_button() {

        externalPages.googleNextBtn.click();

    }
    @Then("Filling password input in google page")
    public void filling_password_input_in_google_page() {

        externalPages.externalPasswordBox.sendKeys(ConfigReader.getProperty("googlePass")+Keys.ENTER);
    }

    @Then("Verifying that login process is successful via title")
    public void verifyingThatLoginProcessIsSuccessfulViaTitle() {

        String expectedResult = "QR Code Creator - Dashboard";

        String actualResult = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedResult,actualResult);

    }
}

