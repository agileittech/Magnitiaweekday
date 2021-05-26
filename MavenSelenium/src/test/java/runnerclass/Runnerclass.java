package runnerclass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = {"src/test/resources/"},
		glue = {"org.selenium"},
		tags =  "@Login",
        plugin = {"html:target/myreport/report.html"})
public class Runnerclass {
	
}


