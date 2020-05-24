package com.ubs.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Project: UBSCucumberAutomation
 * Created by: Jailton Louzada
 * WebSite: https://jailtonjr.dev
 * Description: CucumberRunner
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"src/test/java/stepsDefinitions"}
)
public class TestRunner {


}
