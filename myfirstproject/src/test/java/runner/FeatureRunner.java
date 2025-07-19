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
                "jason:target/report/report.jason",
                "junit:target/report/report.xml"

        }



)

public class FeatureRunner {


}
