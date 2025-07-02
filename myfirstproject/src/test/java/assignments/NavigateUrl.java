package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class NavigateUrl {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        String URL1 = driver.getCurrentUrl();
        System.out.println(URL1);
Thread.sleep(3000);
driver.navigate().to("https://www.selenium.dev/");
Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());
        driver.navigate().forward();
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());
        driver.navigate().refresh();
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());
        driver.close();

    }
}
