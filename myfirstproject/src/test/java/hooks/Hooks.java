package hooks;


import base.CucumberContext;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Hooks {
      private CucumberContext context;
    public Hooks(CucumberContext context){
        this.context=context;

    }
    @Before
    public void beforecall(){
        System.out.println("execution is started");
    }



    @After
    public void closeDriver() throws IOException {
        context.browserBase.launchBrowser().quit();

    }


    @AfterStep
    public void screenshotCapture(Scenario s) throws IOException {
        TakesScreenshot screenshot=(TakesScreenshot)context.browserBase.launchBrowser();
        byte[]data=screenshot.getScreenshotAs(OutputType.BYTES);
        s.attach(data,"image/png",s.getName());
    }

}
