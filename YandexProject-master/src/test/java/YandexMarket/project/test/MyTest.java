package YandexMarket.project.test;



import YandexMarket.project.pages.Authorization;
import YandexMarket.project.pages.WelcomPages;
import YandexMarket.utils.ConfigFileReader;

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
}
