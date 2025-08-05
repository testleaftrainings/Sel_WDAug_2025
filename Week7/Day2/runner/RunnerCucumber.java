package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepDefinition.BaseClass;

@CucumberOptions(features= {"src/test/java/features"},
glue="stepDefinition",
publish=true,tags="@SMOKE and @regression")
public class RunnerCucumber extends BaseClass{

}
