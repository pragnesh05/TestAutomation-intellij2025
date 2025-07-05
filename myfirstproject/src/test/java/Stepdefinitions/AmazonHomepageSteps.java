package Stepdefinitions;

import base.BrowserBase;
import base.CucumberContext;
import base.PageObjectManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
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
  public CucumberContext context;
   public AmazonHomepageSteps(CucumberContext context){
     this.context=context;

   }

    @Given("user navigate to Amazon home page")
    public void homePage() throws IOException {



    }


    @When("user enter product name {string} in search bar")
    public void enterProductName(String value) {

//driver.findElement(By.id("twotabsearchtextbox")).sendKeys(value);
       // AmazonHomePage homePage=new AmazonHomePage(driver);
        //homePage.enterProductValue(value);
        context.pageObjectManager.getAmazonHomePage().enterProductValue(value);

    }

    @Then("verify the search result")
    public void verifySearchResult() {


    }

    @And("click on search icon")
    public void clickOnSearchIcon() {

       // driver.findElement(By.id("nav-search-submit-button")).click();
       context. pageObjectManager.getAmazonHomePage().clickSearchIcon();
    }

    @And("verify the title of current page")
    public void verifyTheTitle() {
      //String title= driver.getTitle();
        //System.out.println(title);
        //pageObjectManager.getSearchResultPage().selectProduct();



    }

    @When("user extracts dropdown values")
    public void userExtractsDropdownValues() {
       WebElement categoryDropdown= driver.findElement(By.id("searchDropdownBox"));
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
      // pageObjectManager.getAmazonHomePage().clickBabyWishList();
        context.pageObjectManager.getAmazonHomePage().clickBabyWishList();

    }

    @Then("validate the navigation")
    public void validateToNavigation() {
        // Assert.assertFalse(context.pageObjectManager.getBabyWishListPage().isBabyWishListIsPresent());
       Assert.assertTrue(context.pageObjectManager.getBabyWishListPage().isBabyWishListIsPresent());
     context.pageObjectManager.getBabyWishListPage().enterBabyProductValue("dress");

    }

    @Given("user search the product")
    public void userSearchTheProduct() {
       context.pageObjectManager.getAmazonHomePage().enterProductValue("iphone").clickSearchIcon();

    }

    @When("user select specific product")
    public void userSelectSpecificProduct() {
       context.pageObjectManager.getSearchResultPage().selectProduct("4");

    }

    @Then("verify the title of page")
    public void verifyTheTitleOfPage() {

    }
}
