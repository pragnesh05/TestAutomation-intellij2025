package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M4A1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//a[normalize-space()='Create new account'])[1]")).click();
        Thread.sleep(2000);

    }
}
