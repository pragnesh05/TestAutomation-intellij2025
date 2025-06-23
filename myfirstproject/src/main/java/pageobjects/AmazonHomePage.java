package pageobjects;

import base.PageObjectManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AmazonHomePage {
WebDriver driver;

public AmazonHomePage(WebDriver driver){
    this.driver=driver;

}
    public void enterProductValue(String value){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(value);
    }
    public void clickSearchIcon(){
        driver.findElement(By.id("nav-search-submit-button")).click();


    }
    public void selectCategoryDropdownValue(){
        driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();
    }
    public void clickBabyWishList(){
        WebElement element= driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(element).build().perform();
        driver.findElement(By.linkText("Baby Wishlist")).click();

    }

}
