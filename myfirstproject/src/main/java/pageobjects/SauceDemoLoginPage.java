package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceDemoLoginPage {
    WebDriver driver;
    public SauceDemoLoginPage(WebDriver driver) {
        this.driver=driver;

    }
    public void enterUsername(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

    }
    public void enterPassword(){
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

    }
    public void clickOnLoginButton(){
        driver.findElement(By.name("login-button")).click();
    }

}
