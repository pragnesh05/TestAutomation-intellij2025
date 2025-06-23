package Stepdefinitions;

import base.BrowserBase;
import base.PageObjectManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import pageobjects.AmazonHomePage;

import java.io.IOException;

public class AmazonHomepageSteps {
WebDriver driver;
    WebElement categoryDropdown;
   PageObjectManager pageObjectManager;
    @Given("user navigate to Amazon home page")
    public void homePage() throws IOException {
        BrowserBase base=new BrowserBase();
        driver = base.launchBrowser();
        pageObjectManager =new PageObjectManager(driver);
    }


    @When("user enter product name {string} in search bar")
    public void enterProductName(String value) {

//driver.findElement(By.id("twotabsearchtextbox")).sendKeys(value);
       // AmazonHomePage homePage=new AmazonHomePage(driver);
        //homePage.enterProductValue(value);
        pageObjectManager.getAmazonHomePage().enterProductValue(value);
    }

    @Then("verify the search result")
    public void verifySearchResult() {

    }

    @And("click on search icon")
    public void clickOnSearchIcon() {

       // driver.findElement(By.id("nav-search-submit-button")).click();
        pageObjectManager.getAmazonHomePage().clickSearchIcon();
    }

    @And("verify the title of current page")
    public void verifyTheTitle() {
      String title= driver.getTitle();
        System.out.println(title);
        pageObjectManager.getSearchResultPage().selectProduct();



    }

    @When("user extracts dropdown values")
    public void userExtractsDropdownValues() {
        categoryDropdown= driver.findElement(By.id("searchDropdownBox"));
     int size= categoryDropdown.findElements(By.tagName("option")).size();
     for(int i=0;i<size;i++){
       String val=  categoryDropdown.findElements(By.tagName("option")).get(i).getText();
         System.out.println(val);
     }

        
    }

    @Then("user verify the office product value in dropdown")
    public void userVerifyTheOfficeProductValueInDropdown() {
    }

    @And("user select value from dropdown")
    public void userSelectValueFromDropdown() {
        Select categoryDrop =new Select(categoryDropdown);
        //categoryDrop.selectByVisibleText("Baby");
        categoryDrop.selectByIndex(4);
       // categoryDrop.selectByValue("search-alias=furniture");

    }

    @When("user click on baby list")
    public void userClickOnBabyList() {
        pageObjectManager.getAmazonHomePage().clickBabyWishList();

    }

    @Then("validate to navigation")
    public void validateToNavigation() {
       boolean a= pageObjectManager.getBabyWishListPage().isBabyWishListIsPresent();
        System.out.println(a);
        pageObjectManager.getBabyWishListPage().enterBabyProductValue("dress");

    }
}
