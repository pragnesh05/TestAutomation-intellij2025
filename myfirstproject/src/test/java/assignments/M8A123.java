package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class M8A123 {
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://smallpdf.com/word-to-pdf");
        driver.manage().window().maximize();
        Robot r=new Robot();
        driver.findElement(By.xpath("//span[@class='sc-8s01yt-4 dNifye']")).click();
        r.setAutoDelay(1000);
        StringSelection ss=new StringSelection("C:\\Users\\ShivShubh\\Desktop\\homework.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);

        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);

        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);

        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        //Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='sc-1nrs99k-0 wvha7z-0 kccFVN jSksmI']")).click();
        Thread.sleep(2000);
        driver.close();



    }
}
