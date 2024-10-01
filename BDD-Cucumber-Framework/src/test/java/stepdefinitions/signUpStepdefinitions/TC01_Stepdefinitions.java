package stepdefinitions.signUpStepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.HomepagePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01_Stepdefinitions {

    private static final Logger log = LoggerFactory.getLogger(TC01_Stepdefinitions.class);
    HomepagePage homepagePage = new HomepagePage();
    LoginPage loginPage = new LoginPage();


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
}
