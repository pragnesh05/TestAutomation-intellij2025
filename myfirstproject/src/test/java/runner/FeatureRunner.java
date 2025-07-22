package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/testdesign"},
        glue={"Stepdefinitions","hooks"},
        tags="@sc01",
        plugin={"pretty",
                "html:target/report/report.html",
                "json:target/report/report.json",
                "junit:target/report/report.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

        }



)

public class FeatureRunner {


}
