package Stepdefinitions;

import base.CucumberContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageobjects.WikiPage;

public class WikiSteps {
 CucumberContext testContext;
    public WikiSteps(CucumberContext testContext){
        this.testContext=testContext;


    }
     @Given("user extracts the shareholder and shareholding values")
        public void getValues() {
         System.out.println(testContext.pageObjectManager.getWikiPage().getShareHolderValue());
         System.out.println(testContext.pageObjectManager.getWikiPage().getShareHoldingValue());


     }


    @Then("validate the value")
    public void validateTheValue() {
        System.out.println(testContext.pageObjectManager.getWikiPage().getShareholderShareholdingValue());
        Assert.assertEquals("14.81%",testContext.pageObjectManager.getWikiPage().getShareholderShareholdingValue().get("Public"));
        Assert.assertEquals("Public",testContext.pageObjectManager.getWikiPage().getShareHolderValue().get(3));
        Assert.assertEquals("Others",testContext.pageObjectManager.getWikiPage().getShareHolderValue().get(4));


    }
}
