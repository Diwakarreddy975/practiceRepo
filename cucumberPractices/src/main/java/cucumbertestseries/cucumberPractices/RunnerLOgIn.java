package cucumbertestseries.cucumberPractices;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src\\test\\java\\cucumberPractices\\login.feature"},
    glue={"stepdeffination"},
   
   plugin= {"pretty"
		   , "json:target/report/report.json",
		   "junit:target/report/report.xml"
   },
publish=true,
monochrome=true
		)
public class RunnerLOgIn {

}
