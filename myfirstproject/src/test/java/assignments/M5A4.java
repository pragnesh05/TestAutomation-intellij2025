package assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class M5A4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Riya");
        Thread.sleep(2000);
       driver.switchTo().alert().accept();
      String txt= driver.findElement(By.xpath("//p[text()='Hello Riya! How are you today?']")).getText();
        System.out.println(txt);
        Thread.sleep(2000);
        driver.close();
    }
}
