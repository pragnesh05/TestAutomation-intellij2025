package Stepdefinitions;


import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceLoginValidSteps {
    WebDriver web;

    @Given("user navigate to sales force login page")
    public void homePage() {
        web = new ChromeDriver();
        web.get("https://login.salesforce.com/");

    }
}
