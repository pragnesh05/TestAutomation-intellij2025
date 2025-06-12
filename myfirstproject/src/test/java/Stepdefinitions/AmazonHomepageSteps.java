package Stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHomepageSteps {
WebDriver web;
    @Given("user navigate to amazon home page")
    public void homePage()
    {
web=new ChromeDriver();
        web.get("https://www.amazon.com/");
    }


    @When("user search product name {string} in search bar")
    public void userSearchProductName(String value) {

web.findElement(By.id("twotabsearchtextbox")).sendKeys(value);

    }

    @Then("verify the search result")
    public void verifySearchResult() {

    }

    @And("click on search icon")
    public void clickOnSearchIcon() {
     web.findElement(By.id("nav-search-submit-button")).click();
    }

    @And("verify the title of current page")
    public void verifyTheTitle() {
      String title=  web.getTitle();
        System.out.println(title);

    }
}
