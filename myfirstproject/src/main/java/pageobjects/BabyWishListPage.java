package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BabyWishListPage {
WebDriver driver;
    public BabyWishListPage(WebDriver driver) {
       this.driver=driver;

    }
    public boolean isBabyWishListIsPresent(){
      boolean val=  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h2[1]")).isDisplayed();
       return val;
    }
    public void enterBabyProductValue(String val){

        driver.findElement(By.id("find-list-input")).sendKeys(val);
    }
}
