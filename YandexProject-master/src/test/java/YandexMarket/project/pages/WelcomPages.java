package YandexMarket.project.pages;


import YandexMarket.framework.elements.TextElement;
import YandexMarket.utils.ConfigFileReader;
import org.openqa.selenium.By;


import java.time.Duration;


public class WelcomPages extends BasePage {

    private ConfigFileReader config = ConfigFileReader.configFileReader;

    private TextElement here = new TextElement(By.xpath("//*[@id=\"app\"]/div/div/div[4]/p/a"), "here");

    public WelcomPages(){

    }
    public void open() {
        browser.goTo(config.getApplicationUrl());
    }
 public void clickHere() {
        here.click();
 }
}