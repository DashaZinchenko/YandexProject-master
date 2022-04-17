package YandexMarket.project.pages;

import YandexMarket.framework.Browser;
import org.openqa.selenium.WebDriver;

/**
 * Created by ST on 13.04.2022.
 */
public class BasePage {
    protected Browser browser;

    public BasePage( ) {
        this.browser = Browser.BROWSER;
    }
}

