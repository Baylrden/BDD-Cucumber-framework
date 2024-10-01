package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class Helper {

    public static void wait(int second){

        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static List<String> convertToStringList(List<WebElement> webElementList){

        List<String> stringList = new ArrayList<>();

        for (WebElement eachElement : webElementList
        ) {

            stringList.add(eachElement.getText());
        }

        return stringList;
    }

    public static String getScreenshot(String name) throws IOException {
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        FileUtils.copyFile(source, finalDestination);
        return target;
    }

    public static void changeWindowWithTitle(String targetTitle, WebDriver driver){

        Set<String> whdSet = driver.getWindowHandles();


        for (String eachWhd : whdSet
        ) {
            driver.switchTo().window(eachWhd);

            String currentTitle = driver.getTitle();

            if (currentTitle.equals(targetTitle)){

                break;
            }
        }

    }

    public static void pageScreenshot(WebDriver driver)  {

        TakesScreenshot tss = (TakesScreenshot) driver;

        LocalDateTime ldt = LocalDateTime.now(); // 2024-01-24T19:01:05.777116
        DateTimeFormatter zamanFormati = DateTimeFormatter.ofPattern("YYMMddHHmmss");
        String timeStamp = ldt.format(zamanFormati); // 240124190341


        File tumSayfaScreenshot = new File("target/tumSayfaScreenshot/tumSayfa"+timeStamp+".jpeg");


        File geciciDosya = tss.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(geciciDosya,tumSayfaScreenshot);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void PageScreenshot(WebDriver driver,String fileName)  {


        TakesScreenshot tss = (TakesScreenshot) driver;


        File pageScreenshot = new File("target/pageScreenshot/"+fileName+".jpeg");


        File tempFile = tss.getScreenshotAs(OutputType.FILE);


        try {
            FileUtils.copyFile(tempFile,pageScreenshot);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void webelementScreenshot(WebElement webElement){
        LocalDateTime ldt = LocalDateTime.now(); // 2024-01-24T19:01:05.777116
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("YYMMddHHmmss");
        String timeStamp = ldt.format(timeFormat); // 240124190341

        File webelementSS = new File("target/webelementScreenshots/webElement"+timeStamp+".jpg");

        File tempScreenshot = webElement.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(tempScreenshot,webelementSS);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void webelementScreenshot(WebElement webElement,String fileName){

        LocalDateTime ldt = LocalDateTime.now(); // 2024-01-24T19:01:05.777116
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("YYMMddHHmmss");
        String timeStamp = ldt.format(timeFormat); // 240124190341

        File webelementSS = new File("target/webelementScreenshots/"+fileName+timeStamp+".jpg");

        File tempScreenshot = webElement.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(tempScreenshot,webelementSS);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}