package org.example.utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.*;
import static com.codeborne.selenide.Selenide.*;


public class ChromeRunner {

    @BeforeTest
    public static void setup() {
        open("https://coinmania.ge/");
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
        Configuration.baseUrl = "https://coinmania.ge/";

        SelenideLogger.addListener("AllureSelenide",
        new AllureSelenide()
                .screenshots(true)
                .savePageSource(false));

    }
@AfterTest
    public static void  teardDown(){
    Selenide.clearBrowserCookies();
    Selenide.clearBrowserLocalStorage();
}

}
