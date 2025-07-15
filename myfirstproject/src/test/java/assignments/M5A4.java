package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M5A4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.manage().window().maximize();
       // driver.switchTo().frame(0);
        //driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/button[1]")).click();
        Thread.sleep(2000);
       // driver.close();
    }
}
