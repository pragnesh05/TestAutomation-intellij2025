package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Module4A3 {
    public static void main(String[] args)throws InterruptedException {
        WebDriver web = new ChromeDriver();
        web.get("https://login.yahoo.com/account/create");
        Thread.sleep(3000);
        web.manage().window().maximize();
        web.findElement(By.name("firstName")).sendKeys("Rima");
        Thread.sleep(3000);
        web.findElement(By.name("lastName")).sendKeys("Patel");
        Thread.sleep(3000);
        web.findElement(By.name("userId")).sendKeys("Rima0405");
        Thread.sleep(2000);
        web.findElement(By.name("password")).sendKeys("R123p45678");
        Thread.sleep(2000);
        WebElement monthDropdownElement= web.findElement(By.id("usernamereg-month"));
        Select monthDropdown= new Select(monthDropdownElement);
        monthDropdown.selectByValue("4");
        Thread.sleep(2000);
        web.findElement((By.id("usernamereg-day"))).sendKeys("12");
        Thread.sleep(2000);
        web.findElement(By.id("usernamereg-year")).sendKeys("1988");
        web.findElement(By.id("reg-submit-button")).click();
        Thread.sleep(2000);
        web.navigate().back();
        Thread.sleep(2000);
        System.out.println(web.getTitle());
        web.close();












    }

}
