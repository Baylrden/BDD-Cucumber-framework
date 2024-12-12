package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Hooks {

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            File src = ts.getScreenshotAs(OutputType.FILE);

            String projectPath = System.getProperty("user.dir");
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            File target = new File(projectPath + "/target/screenshots/" + screenshotName + ".png");

            if (!target.getParentFile().exists()) {
                target.getParentFile().mkdirs();
            }

            try {
                FileUtils.copyFile(src, target);
                System.out.println("Screenshot saved at: " + target.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Driver.quitDriver();
    }
}
