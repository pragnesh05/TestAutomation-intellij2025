package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class M7A3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://launchpad.net/sikuli");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.linkText("All downloads")).click();
        driver.findElement(By.linkText("sikulixsetup-1.1.2.jar")).click();
        Thread.sleep(2000);
        driver.close();

    }
}
