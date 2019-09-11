package hw6.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/hw6", glue = {"hw6/hooks", "hw6/steps", "hw6/entities"})
public class CucumberRunnerServicePageTest extends AbstractTestNGCucumberTests {
}
