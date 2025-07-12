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
        System.out.println(driver.getTitle());
        //WebDriver frame = driver.switchTo().frame(0);
        //driver.findElement(By.cssSelector("#u_0_0_oU")).click();
        Thread.sleep(2000);
      // driver.findElement(By.id("email")).sendKeys("abc");
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/a[1]")).click();
       driver.close();
    }
}
