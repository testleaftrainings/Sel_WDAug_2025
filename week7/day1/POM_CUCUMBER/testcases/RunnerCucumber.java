package testcases;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/main/java/features",
glue="pages",
publish=true)
public class RunnerCucumber extends base.BaseClass{

}
