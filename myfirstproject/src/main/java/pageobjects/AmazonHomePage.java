package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;

public class AmazonHomePage {
    WebDriver driver;

    public AmazonHomePage(WebDriver driver) {
        this.driver = driver;

    }

    public AmazonHomePage enterProductValue(String value) {

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(value);
        return this;
    }

    public AmazonHomePage clickSearchIcon() {
        try {
            driver.findElement(By.id("nav-search-submit-button")).click();
        } catch (NoSuchElementException e) {
            WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
            driverWait.until(ExpectedConditions.presenceOfElementLocated((By.id("nav-search-submit-button"))));
            driver.findElement(By.id("nav-search-submit-button")).click();
        }

        return this;


    }

    public void selectCategoryDropdownValue() {
        driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).click();

    }

    public void clickBabyWishList() {
        WebElement element = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(element).build().perform();
        driver.findElement(By.linkText("Baby Wishlist")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));

    }

    public void switchWindow() {
        /*try {
            driver.findElement(By.xpath("//h2[text()='Baby Wishlist']")).isDisplayed());
        }
        catch(NoSuchElementException e){
            WebDriverWait driverWait=new WebDriverWait(driver, Duration.ofSeconds(30));
            driverWait.pollingEvery(Duration.ofSeconds(10));
            driverWait.ignoring(NoSuchElementException.class);
            driverWait.until(ExpectedConditions.presenceOfElementLocated((By.xpath("//h2[text()='Baby Wishlist']"))));
        }*/
        Set<String> winProp = driver.getWindowHandles();
         String parentWindow=driver.getWindowHandle();
         String childWindows=null;
         for (String win:winProp){
             if(!win.equals(parentWindow)){
                 childWindows=win;

             }
         }
        System.out.println(winProp);
        System.out.println("parent" + parentWindow);
        System.out.println("child" + childWindows);
        driver.switchTo().window(childWindows);
        System.out.println(driver.findElement(By.linkText("Baby Wishlist")).isDisplayed());

    }

    }

