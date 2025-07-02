package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;

public class SeleniumBasic {
    public static void main(String[] args)throws InterruptedException{

WebDriver driver = new FirefoxDriver();
Thread.sleep(2000);
driver.get("https://netbanking.hdfcbank.com/netbanking/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("(//a[contains(text(),'Know')])[2]")).click();
        Thread.sleep(2000);
        ArrayList<String> list = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(list.get(1));
        Thread.sleep(2000);

        System.out.println(driver.getTitle());
        Thread.sleep(3000);


        driver.switchTo().window(list.get(0));
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.quit();
    }
}
