package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class M2A3 {
    public static void main(String[] args) throws InterruptedException {
      WebDriver driver=new FirefoxDriver();
      driver.get("https://www.google.com/");
      Thread.sleep(3000);
     String title= driver.getTitle();
        System.out.println(title);
        driver.close();

    }


}
