package com.ubs.pages;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.util.Set;

/**
 * Project: UBSCucumberAutomation
 * Created by: Jailton Louzada
 * WebSite: https://jailtonjr.dev
 * Description: SearchServices
 */
public class SearchServices {

    private WebDriver driver;
    private SearchPageObjects searchPageObjects;


    public SearchServices(WebDriver driver) {
        this.driver = driver;
        searchPageObjects = new SearchPageObjects(driver);
    }

    public void go(String url) throws InterruptedException {
        this.driver.get(url);
        Thread.sleep(10000);
        searchPageObjects.getCookieButton().click();
        Thread.sleep(3000);
    }

    public void searchGlobal(String querySearch) {
        searchPageObjects.getSearchBoxButton().click();
        searchPageObjects.getSearchBox().sendKeys(querySearch);
    }
}
