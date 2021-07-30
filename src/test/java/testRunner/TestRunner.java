package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./src/test/resources/features", glue = "stepDefinitions", publish = true)
public class TestRunner extends AbstractTestNGCucumberTests {
}
