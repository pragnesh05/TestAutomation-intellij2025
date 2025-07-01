package base;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BrowserBase {
    WebDriver driver;
    public WebDriver launchBrowser() throws IOException {
         File f= new File("src/main/resources/frameworkconfig.properties");
         FileInputStream fis = new FileInputStream(f);
            Properties prop = new Properties();
            prop.load(fis);
            if(driver==null){
            if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
                driver = new ChromeDriver();
            } else if (prop.getProperty("browser").equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            } else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();
            } else {
                throw new InvalidArgumentException("cofigure valid browser");
            }


            driver.manage().window().maximize();
            driver.get(prop.getProperty("url"));
        }
      return driver;
    }
}
