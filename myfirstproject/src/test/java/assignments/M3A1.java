package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.ArrayList;

//1. TC-1 launch Chrome browser
//2. TC-2 go to test URL - https://netbanking.hdfcbank.com/netbanking/
 //3. TC-3 maximize the browser window
//4. TC-4 get the title of page
//5. TC-5 click on know more link text
//6. TC-6 switch from 0th window to 1st window
//7. TC-7 after switching get the title of page
//8. TC-8 switch from 1st window to 0th window
//9. TC-9 after switching, get the title of page
//10. TC-10 close all windows of the browser
public class M3A1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://netbanking.hdfcbank.com/netbanking/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
       String title= driver.getTitle();
        System.out.println(title);
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/span[2]/a[1]")).click();
        Thread.sleep(3000);
        ArrayList<String> list =new ArrayList<>(driver.getWindowHandles());
        Thread.sleep(2000);
        driver.switchTo().window(list.get(1));
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.switchTo().window(list.get(0));
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.quit();


    }





}
