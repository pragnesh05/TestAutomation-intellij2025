package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class M6A3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://only-testing-blog.blogspot.com/2014/09/selectable.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        Actions actions=new Actions(driver);
       WebElement element= driver.findElement(By.xpath("//button[normalize-space()='Double-Click Me To See Alert']"));
       actions.moveToElement(element).contextClick(element).build().perform();
       // actions.contextClick(element).build().perform();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.close();

    }
}
