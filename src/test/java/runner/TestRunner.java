package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"C:\\Users\\GTK1\\selenium\\10NovBDDCucumber\\src\\test\\java\\features"},
		glue= {"stpes"},
				plugin = {"pretty",
						   "html:results/html",
						    "json:results/json/results.json",
						    "junit:results/junit/cucumber.xml"}
	
		)
public class TestRunner {

}
