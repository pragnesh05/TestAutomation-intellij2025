package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class M6A1 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();

    }
}
