package com.ubs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Project: SimpleTestFramework
 * Created by: Jailton Louzada
 * WebSite: https://jailtonjr.dev
 * Description: Home
 */
public class HomePO {

    private static final long SECONDS = 15;
    private WebDriverWait wait;
    private WebDriver driver;

    public HomePO(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, SECONDS);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"cboxLoadedContent\"]/iframe")
    private WebElement framePopup;

    @FindBy(xpath = "//span[contains(text(),'Agree to all')]")
    private WebElement agreeAllCookies;

    public void go(String url) {
        driver.get(url);
    }

    public void clickAgreeAllButton() {
        wait.until(ExpectedConditions.visibilityOf(framePopup));
        driver.switchTo().frame(framePopup);
        agreeAllCookies.click();
    }
}
