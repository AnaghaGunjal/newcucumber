package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="MyFeatures\\demowebshop.feature",glue="runner")
public class RunnerClass {

}
