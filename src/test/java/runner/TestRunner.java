package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		  features="src/test/java/features",
		  glue={"stepDefinations","Hooks"},
		  plugin={"pretty","html:target/report.html","json:target/report.json"}
		)
		public class TestRunner extends AbstractTestNGCucumberTests {}
