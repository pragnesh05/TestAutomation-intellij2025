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
        WebElement element= driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]"));
        Actions actions=new Actions(driver);
        actions.contextClick(element).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Double-Click Me To See Alert")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.close();

    }
}
