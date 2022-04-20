package YandexMarket.project.test;


import YandexMarket.framework.Browser;
import YandexMarket.utils.ConfigFileReader;
import org.testng.annotations.BeforeClass;


public class BaseTest {
    private ConfigFileReader config = ConfigFileReader.configFileReader;
    @BeforeClass
       public void before(){

        Browser.getDriver().manage().window().maximize();
    }
}
