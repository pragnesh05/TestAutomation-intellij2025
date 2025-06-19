package Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetHomepageSteps {
WebDriver driver;
        @Given("user navigates to spice jet home page")
    public void homepage(){
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://book.spicejet.com/");

        }

    @When("user select value from dropdown box")
    public void userSelectValueFromDropdownBox() {
            driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
            driver.findElement(By.xpath("/html[1]/body[1]/div[19]/form[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[3]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
            driver.findElement(By.xpath("/html[1]/body[1]/div[19]/form[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[3]/div[1]/div[1]/ul[2]/li[6]/a[1]")).click();

    }
}

