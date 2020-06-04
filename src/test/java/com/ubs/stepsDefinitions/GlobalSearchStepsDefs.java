package com.ubs.stepsDefinitions;

import com.ubs.framework.BaseTest;
import com.ubs.pages.GlobalSearchPO;
import com.ubs.pages.HomePO;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * Project: UBSCucumberAutomation
 * Created by: Jailton Louzada
 * WebSite: https://jailtonjr.dev
 * Description: SearchStepsDefs
 */
public class GlobalSearchStepsDefs {

    private WebDriver driver;
    private HomePO home;
    private GlobalSearchPO globalSearch;
    private String searchResult;

    @Before
    public void startServer() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        home = new HomePO(driver);
        globalSearch = new GlobalSearchPO(driver);
    }

    @Given("I am an user on UBS Home Page")
    public void i_am_an_user_on_UBS_Home_Page() {
        home.go("https://www.ubs.com/");
        home.clickAgreeAllButton();
    }

    @When("I search for {string}")
    public void iSearchFor(String keyword) {
        searchResult = keyword;
        globalSearch.clickSearchButton();
        globalSearch.searchBox(keyword);
    }

    @Then("I should see the search page results")
    public void i_should_see_the_search_page_results() {
        System.out.println("search result"+globalSearch.getSearchResult().getText().toString());
        Assert.assertEquals(globalSearch.getSearchResult().getText().toString(),searchResult);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

}
