package org.example;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features"},
        glue = {"org.example.stepdef"},
        plugin = {"pretty"})
public class RunnerTest extends AbstractTestNGCucumberTests {
}
