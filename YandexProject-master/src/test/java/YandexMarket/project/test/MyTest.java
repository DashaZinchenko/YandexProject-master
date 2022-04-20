package YandexMarket.project.test;



import YandexMarket.framework.Browser;
import YandexMarket.project.pages.Authorization;
import YandexMarket.project.pages.WelcomPages;
import YandexMarket.utils.ConfigFileReader;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.io.IOException;


public class MyTest extends BaseTest {
    private final ConfigFileReader config = ConfigFileReader.configFileReader;


    @Test
    public void Authorization() throws IOException, InterruptedException {
        WebDriver driver = Browser.getDriver();
        driver.get("https://userinyerface.com/game.html%20target=");
        WelcomPages welcomPages = new WelcomPages();
        welcomPages.open();
        welcomPages.clickHere();

        Authorization authorization = new Authorization();
        authorization.dataEntry();


    }
}
