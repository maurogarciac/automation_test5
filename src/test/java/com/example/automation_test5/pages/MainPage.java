package com.example.automation_test5.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;


public class MainPage {
    public static final String URL = "https://www.booking.com/";
    static Duration ELEMENT_LOAD_TIMEOUT = Duration.ofSeconds(5);
    protected WebDriver driver;

    @FindBy(id = "ss")
    protected WebElement input;
    @FindBy(className = "sb-searchbox__button")
    protected WebElement submit;
    @FindBy(css = ".sb-destination .c-autocomplete__list")
    protected WebElement dropdown;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigate() {
        driver.get(URL);
    }

    public void search(String text, String dropdownValue) {
        //add a wait
        this.input.sendKeys(text);
        //add another wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(dropdown,
                By.cssSelector("[data-label = '" + dropdownValue +"']"))).get(0).click();
    }


    /*
        public SearchResultPage search(String text) {
        this.input.sendKeys(text);
        new WebDriverWait(driver, ELEMENT_LOAD_TIMEOUT).until(visibilityOf(isLucky ? luckySubmit : submit)).click();
        return new GoogleSearchResultPage(this.driver);
    }
    */
}
