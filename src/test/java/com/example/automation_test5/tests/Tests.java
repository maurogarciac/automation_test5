package com.example.automation_test5.tests;

import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;


import com.example.automation_test5.pages.MainPage;

import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;

public class Tests {
    
    
    protected WebDriver driver;
    protected MainPage mainPage;

    @BeforeClass
    public static void setUpAll() {
        WebDriverManager.chromedriver().setup();
        
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
    }
 
    @AfterTest
    public void teardown(){
        driver.quit();
    }

    @Test
    public void inputPlace() {
        mainPage.navigate();
        mainPage.search("Buenos Aires", "Buenos Aires, Argentina");
    }
}
