package Stepdefinitions;


import base.CucumberContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class SalesForceLoginSteps {
    CucumberContext context;

    public SalesForceLoginSteps(CucumberContext context){
        this.context=context;

    }

    @Given("user navigate to sales force login page")
    public void homePage() {
       // driver = new ChromeDriver();
       // driver.get("https://login.salesforce.com/");

    }

    @Given("user navigate to home page")
    public void userNavigateToHomePage() {
 

    }

    @Then("user validate the label name")
    public void userValidateTheLabelName() {

    }

    @Given("user enter username {string} and password {string}")
    public void entercredi(){


    }
}
