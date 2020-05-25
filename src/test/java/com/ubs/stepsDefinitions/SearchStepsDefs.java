package com.ubs.stepsDefinitions;

import com.ubs.pages.SearchPageObjects;
import com.ubs.pages.SearchServices;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Project: UBSCucumberAutomation
 * Created by: Jailton Louzada
 * WebSite: https://jailtonjr.dev
 * Description: SearchStepsDefs
 */
public class SearchStepsDefs {


    @Given("I am an user on UBS Home Page")
    public void i_am_an_user_on_UBS_Home_Page() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        SearchServices search = new SearchServices(driver);
        search.go("https://www.ubs.com/global/en.html");

        Thread.sleep(3000);
        driver.close();
        driver.quit();
    }

    @When("I search for any {string}")
    public void iSearchForAny(String arg0) {

    }

    @Then("I should see the search page results")
    public void i_should_see_the_search_page_results() {

    }

}
