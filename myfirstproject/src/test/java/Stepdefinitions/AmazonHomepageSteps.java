package Stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHomepageSteps {
WebDriver web;
    @Given("user navigate to Amazon home page")
    public void homePage()
    {
web=new FirefoxDriver();
        web.get("https://www.amazon.com/");
    }


    @When("user enter product name {string} in search bar")
    public void enterProductName(String value) {

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
