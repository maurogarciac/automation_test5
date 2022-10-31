package com.example.automation_test5;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

// page_url = https://www.booking.com/
public class MainPage {
    //public SelenideElement seeAllToolsButton = $("a.wt-button_mode_primary");
    //public SelenideElement toolsMenu = $x("//div[@data-test='main-menu-item' and @data-test-marker = 'Developer Tools']");
    public SelenideElement searchBox = $("input[id='ss']");
}