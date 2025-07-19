package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class M7A2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.selenium.dev/downloads/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/main/div[3]/div[3]/div/div[2]/p[2]/a")).click();
        Thread.sleep(3000);
        driver.close();

    }

}
