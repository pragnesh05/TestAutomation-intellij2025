package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BrowserBase {
    public void launchBrowser() throws IOException {
        File f= new File("src/main/resources/frameworkconfig.properties");
        FileInputStream fis=new FileInputStream(f);
       Properties prop=new Properties();
       prop.load(fis);
       prop.getProperty("browser");
       WebDriver driver = new ChromeDriver();
       driver.get(prop.getProperty("url"));
    }
}
