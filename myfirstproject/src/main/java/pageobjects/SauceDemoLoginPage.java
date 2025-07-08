package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceDemoLoginPage {
    WebDriver driver;
    public SauceDemoLoginPage(WebDriver driver) {
        this.driver=driver;

    }
    public SauceDemoLoginPage enterUsername(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
       return this;
    }
    public SauceDemoLoginPage enterPassword(){
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        return this;

    }
    public SauceDemoLoginPage clickOnLoginButton(){
        driver.findElement(By.name("login-button")).click();
        return this;
    }

}
