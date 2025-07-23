package assignments;

import io.cucumber.java.Before;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class M9A1 {
    /*public static void main(String[] args) {
        File f= new File("C:\\Users\\ShivShubh\\Desktop\\logininfo.properties");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Properties prop = new Properties();
        try {
            prop.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(prop.getProperty("username"));
        System.out.println(prop.getProperty("password"));
    }*/
    WebDriver driver;
    @BeforeClass
    public void setup(){
         driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }
    @Test
    public void loginWithValidCredentials(){
        String usernameField="standard_user";
        String password="secret_sauce";
        driver.findElement(By.id("user-name")).sendKeys(usernameField);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.name("login-button")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String currentUrl= driver.getCurrentUrl();
       Assert.assertEquals(currentUrl,"https://www.saucedemo.com/inventory.html");
       System.out.println("login success");

    }
@AfterClass
    public void closeDriver(){
        driver.close();
}



}


