package com.example.automation_test5.tests;

import org.testng.annotations.*;

import com.example.automation_test5.pages.MainPage;

import static org.testng.Assert.*;

public class MainPageTest {
    MainPage mainPage = new MainPage();

    @BeforeClass
    public static void setUpAll() {
    }

    @BeforeMethod
    public void setUp() {
        open("https://www.booking.com/");
    }

    @Test
    public void inputPlace() {
        mainPage.sendKeys("Buenos Aires");
        "li[data-label='Buenos Aires, Argentina']".click();
        mainPage.searchBox.shouldHave(attribute("value", "Buenos Aires, Argentina"));
    }

    @Test
    public void toolsMenu() {
        //mainPage.toolsMenu.click();

        $("div[data-test='main-submenu']").shouldBe(visible);
    }

    @Test
    public void navigationToAllTools() {
        //mainPage.seeAllToolsButton.click();

        $("#products-page").shouldBe(visible);

        assertEquals(Selenide.title(), "All Developer Tools and Products by JetBrains");
    }
}
