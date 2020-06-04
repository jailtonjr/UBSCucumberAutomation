package com.ubs.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Project: UBSCucumberAutomation
 * Created by: Jailton Louzada
 * WebSite: https://jailtonjr.dev
 * Description: SearchPageObjects
 */
public class GlobalSearchPO {

    private static final long SECONDS = 15;
    private WebDriverWait wait;
    private WebDriver driver;

    public GlobalSearchPO(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"metanav\"]/div[2]/button")
    private WebElement searchButton;

    @FindBy(className = "searchbox")
    private WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"main\"]/main/div/div/div/div[2]/div/div[3]/span/span")
    private WebElement searchResult;

    public void clickSearchButton() {
        wait.until(ExpectedConditions.visibilityOf(searchButton));
        searchButton.click();
    }

    public void searchBox(String keyword) {
        wait.until(ExpectedConditions.visibilityOf(searchBox));
        searchBox.sendKeys(keyword + Keys.ENTER);
    }

    public WebElement getSearchResult() {
        wait.until(ExpectedConditions.visibilityOf(searchResult));
        return searchResult;
    }
}
