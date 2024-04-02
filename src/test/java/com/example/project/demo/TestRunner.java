package com.example.project.demo;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:feature/ToolQA", plugin = { "pretty", "html:results/cucumber-reports.html",
		"json:results/cucumber.json", "junit:results/cucumber.xml" }, glue = "com.example.project.demo")
public class TestRunner {

}
