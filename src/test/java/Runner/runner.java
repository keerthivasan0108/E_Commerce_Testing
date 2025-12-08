package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "C:\\Users\\keerthivasan.v1\\eclipse-workspace\\E_Commerce_Testing\\Resources\\Features",
tags= "@tag1",glue="Stepdef",plugin={"pretty","html:target/htmlreports/report.html"},monochrome = true)
public class runner extends AbstractTestNGCucumberTests{

}
