package Stepdefinitions;

import base.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class SauceDemoLoginSteps {
    WebDriver driver;
    PageObjectManager pageObjectManager;

    @Then("user click on login button")
    public void userClickOnLoginButton() {
        pageObjectManager.getSauceDemoLoginPage().clickOnLoginButton();


    }

    @Given("user enter username and password")
    public void userEnterUsernameAndPassword() {
        pageObjectManager.getSauceDemoLoginPage().enterUsername();
        pageObjectManager.getSauceDemoLoginPage().enterPassword();

    }
}
