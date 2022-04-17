package YandexMarket.project.test;


import YandexMarket.framework.Browser;
import YandexMarket.utils.ConfigFileReader;
import org.testng.annotations.BeforeClass;


public class BaseTest {
    private ConfigFileReader config = ConfigFileReader.configFileReader;
    @BeforeClass

    public void before(){
        System.setProperty(config.getDriverAdapter(),config.getDriverPath());
        Browser.getDriver().manage().window().maximize();
    }
}
