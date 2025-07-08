package Stepdefinitions;

import base.CucumberContext;
import base.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class SauceDemoLoginSteps {
    WebDriver driver;
    PageObjectManager pageObjectManager;
    public CucumberContext context1;
    public SauceDemoLoginSteps(CucumberContext context1){
        this.context1=context1;}

    @Then("user click on login button")
    public void userClickOnLoginButton() {
       context1.pageObjectManager.getSauceDemoLoginPage().clickOnLoginButton();


    }

    @Given("user enter username and password")
    public void userEnterUsernameAndPassword() {
       context1.pageObjectManager.getSauceDemoLoginPage().enterUsername();
       context1.pageObjectManager.getSauceDemoLoginPage().enterPassword();

    }
}
