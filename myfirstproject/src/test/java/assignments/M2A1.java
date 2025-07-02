package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class M2A1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
         driver.get("https://www.google.com/");
         Thread.sleep(3000);
         driver.close();
         WebDriver driver1=new FirefoxDriver();
         Thread.sleep(3000);
         driver1.close();
         WebDriver driver2=new InternetExplorerDriver();
         Thread.sleep(3000);
         driver2.close();
    }

}
