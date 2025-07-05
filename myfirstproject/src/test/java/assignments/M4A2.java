package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class M4A2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[1]/div[5]/span[1]/span[1]/span[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/span[1]/span[1]/input[1]")).sendKeys("abc@yahoo.com");
        driver.findElement(By.id("sView1:r1:0:password::content")).sendKeys("Riya1234@");
        driver.findElement(By.id("sView1:r1:0:retypePassword::content")).sendKeys("Riya1234@");
       WebElement Country= driver.findElement(By.name("sView1:r1:0:country"));
        Select country =new Select(Country);
        country.selectByValue("DZ");
        Thread.sleep(2000);
        driver.findElement(By.id("sView1:r1:0:firstName::content")).sendKeys("Riya");
        driver.findElement(By.id("sView1:r1:0:lastName::content")).sendKeys("Patel");
        driver.findElement(By.name("sView1:r1:0:jobTitle")).sendKeys("Quality Analyst");
        driver.findElement(By.name("sView1:r1:0:workPhone")).sendKeys("12345678");
        driver.findElement(By.id("sView1:r1:0:companyName::content")).sendKeys("ABC");
        driver.findElement(By.name("sView1:r1:0:address1")).sendKeys("1909 US HIGHWAY NORTH");
        driver.findElement(By.id("sView1:r1:0:city::content")).sendKeys("TAMPA");
      // WebElement State= driver.findElement(By.name("sView1:r1:0:state"));
       //Select state=new Select(State);
      // state.selectByVisibleText("Delaware");
        driver.findElement(By.name("sView1:r1:0:postalCode")).sendKeys("33851");
        driver.findElement(By.id("sView1:r1:0:subscription1::content"));
        driver.close();




    }
}
