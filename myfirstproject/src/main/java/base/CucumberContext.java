package base;

import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class CucumberContext {

    BrowserBase browserBase;
    PageObjectManager pageObjectManager;


    public CucumberContext() throws IOException {
        browserBase=new BrowserBase();
        pageObjectManager=new PageObjectManager(browserBase.launchBrowser());

    }


}
