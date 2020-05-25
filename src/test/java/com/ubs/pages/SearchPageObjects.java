package com.ubs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Project: UBSCucumberAutomation
 * Created by: Jailton Louzada
 * WebSite: https://jailtonjr.dev
 * Description: SearchPageObjects
 */
public class SearchPageObjects {

    public SearchPageObjects(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Agree to all")
    private WebElement cookieButton;

    @FindBy(className = "headerSearch__toggle js-header-search-toggle is-focus-click")
    private WebElement searchBoxButton;

    @FindBy(name = "querystring")
    private WebElement searchBox;

    public WebElement getSearchBoxButton() {
        return searchBoxButton;
    }

    public WebElement getSearchBox() {
        return searchBox;
    }

    public WebElement getCookieButton() {
        return cookieButton;
    }

}
