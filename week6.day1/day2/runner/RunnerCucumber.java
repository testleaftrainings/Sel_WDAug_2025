package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepdefinition.BaseClass;

@CucumberOptions(features="src/test/java/features",
glue="stepdefinition",
publish=true,tags="@Smoke or @Regression")
public class RunnerCucumber extends BaseClass{

}
