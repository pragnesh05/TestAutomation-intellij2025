package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M2A2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();//TC1
        driver.get("https://www.google.com/");//TC2
        Thread.sleep(3000);//1000=1sec//TC3
        String title= driver.getTitle();
        System.out.println(title);//TC4
        driver.close();//TC5

    }
}
