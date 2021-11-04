package com.github;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SelenideTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1900x1200";
    }

    @DisplayName("Домашнее задание №1")
    @Test
    void findExampleForDiv() {
        /*
        $("h1 div") - найдется div, который идет под h1, если div не один, то каждый последующий, т.е. div не входит в тэг h1
        $("h1").$("div") - найдется div, который входит в тэг h1 (<h1 class="test" div>), если он конечно в этом тэге h1 есть, иначе ничего не найдется.
        */
    }

    @DisplayName("Домашнее задание №2")
    @Test
    void findSoftAssertions() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".markdown-body").shouldHave(text("Soft assertions"));
        $(".markdown-body").$(byText("Soft assertions")).click();
        $("ol[start='3']").scrollTo();
        $("ol[start='3']").shouldHave(text("Using JUnit5 extend test class:"));
    }

    @DisplayName("Домашнее задание №3")
    @Test
    void dragAndDropTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a header").shouldHave(text("B"));
        $("#column-b header").shouldHave(text("A"));
    }
}
