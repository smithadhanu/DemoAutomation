package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/apply.feature",
glue= {"stepdefinitions"},
monochrome = true,
strict=true,
dryRun = false,
tags= {"@uat"},
plugin= {"pretty","html:reports/scenario","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"}
//plugin = {"pretty","de.monochromata.cucumber.report.PrettyReports:target/cucumber"}
)
public class TestRunner {

}
