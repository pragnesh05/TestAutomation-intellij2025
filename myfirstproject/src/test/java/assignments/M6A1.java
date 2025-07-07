package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class M6A1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Login")).click();
        WebElement element= driver.findElement(By.xpath("//span[text()='Women']"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(element).build().perform();
        Thread.sleep(2000);
         driver.findElement(By.linkText("Shoes")).click();
         Thread.sleep(2000);
         driver.close();







    }
}
