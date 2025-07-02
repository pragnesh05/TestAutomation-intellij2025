package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaleForceLogin {
    public static void main(String[] args) throws InterruptedException{

        WebDriver driver= new ChromeDriver();
        driver.get("https://login.salesforce.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("komal");
        Thread.sleep(2000);
        driver.findElement(By.name("pw")).sendKeys("1234");
        Thread.sleep(2000);
        driver.findElement(By.id("Login")).click();
       String output= driver.findElement(By.xpath("//div[@id='error']")).getText();
        System.out.println(output);
        Thread.sleep(2000);

        driver.close();




    }

    }

