package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class M7A4 {


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.selenium.dev/downloads/");
        Thread.sleep(2000);
        WebElement element= driver.findElement(By.xpath("//h2[text()='Selenium Clients and WebDriver Language Bindings']"));
        //System.out.println(title.getText());
       String txt=element.getText();
        System.out.println(element.getText());
        WebElement element1=driver.findElement(By.xpath("//p[text()='Java']"));
        String txt1=element1.getText();
        System.out.println(element1.getText());
        WebElement element2=driver.findElement(By.xpath("//p[text()='Python']"));
       String txt2= element2.getText();
        System.out.println(element2.getText());
        driver.close();
    }
}