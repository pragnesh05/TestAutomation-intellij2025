package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class M2A4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new InternetExplorerDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
      String title = driver.getTitle();
        System.out.println(title);
        driver.close();

    }
}
