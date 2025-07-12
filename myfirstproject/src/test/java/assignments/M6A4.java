package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class M6A4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://only-testing-blog.blogspot.com/2014/09/selectable.html");
        driver.manage().window().maximize();
        driver.findElement(By.className("blog-pager-older-link")).click();
        Actions actions=new Actions(driver);

        driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
       WebElement src= driver.findElement(By.id("dragdiv"));
       WebElement trg=driver.findElement(By.id("dropdiv"));
       actions.dragAndDrop(src,trg).perform();
       Thread.sleep(2000);
       if(trg.getText().matches("Dropped!")){
           System.out.println("successfully dropped");
       }
       driver.close();

    }
}
