package com.ubs.framework;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Project: UBSCucumberAutomation
 * Created by: Jailton Louzada
 * WebSite: https://jailtonjr.dev
 * Description: CucumberRunner class that connects cucumber features and test cases
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"src/test/java/com/ubs/stepsDefinitions"}
)

public class TestRunner {


}
