package YandexMarket.project.test;



import YandexMarket.framework.Browser;
import YandexMarket.project.pages.Authorization;
import YandexMarket.project.pages.WelcomPages;
import YandexMarket.utils.ConfigFileReader;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



public class MyTest extends BaseTest {
    private ConfigFileReader config = ConfigFileReader.configFileReader;


    @Test
    public void Authorization() {

        WelcomPages welcomPages = new WelcomPages();
        welcomPages.open();
        welcomPages.clickHere();

        Authorization authorization = new Authorization();
        authorization.dataEntry();


    }

    public ConfigFileReader getConfig() {
        return config;
    }

    public void setConfig(ConfigFileReader config) {
        this.config = config;
    }
}
