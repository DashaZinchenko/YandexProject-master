package YandexMarket.framework;

import YandexMarket.utils.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ST on 13.04.2022.
 */
public class BrowserFactory {
    private static ConfigFileReader config = ConfigFileReader.configFileReader;

    public static WebDriver getDriver (String nameBrowser){
        System.setProperty(config.getDriverAdapter(),config.getDriverPath());
        WebDriver driver;
        if (nameBrowser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();

        }else if(nameBrowser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        } else {
            throw new RuntimeException("Invalid browser name");
        }
        return driver;
    }
}

