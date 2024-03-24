package org.example;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Main {
    @BeforeAll
    public static void setup() {
        Configuration.baseUrl = "https://nexign.com/ru";
    }

    @Test
    public void userCanSearch() {
        open("/");
        $(By.xpath(".//*[@id=\"block-menyusverkhunewru\"]/ul/li[3]")).shouldBe(enabled).click();
        $(By.xpath(".//*[@id=\"block-menyusverkhunewru\"]/ul/li[3]/ul/li[1]")).shouldBe(enabled).click();
        $(By.xpath("./html/body/div[1]/main/article/div/div/div[1]/h1")).shouldHave(text("Nexign Store"));
    }
}