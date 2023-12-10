package tests.appium;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.back;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;


public class WikipediaTests extends TestBase {
    TestData testData = new TestData();

    @Tag("wikipediaEmulator")
    @Test
    void verifyWikipediaTabsContentTest() {
        back();
        step("Проверить, что на вкладке `Explore` есть заголовок с сегодняшней датой", () -> {
            $(id("org.wikipedia.alpha:id/nav_tab_explore")).getAttribute("selected");
            $(id("org.wikipedia.alpha:id/day_header_text")).shouldHave(text(testData.currentDate));
        });
        step("Перейти на вкладку `Saved`", () -> {
            $(id("org.wikipedia.alpha:id/nav_tab_reading_lists")).click();
        });
        step("Проверить, что на вкладке `Saved` нет сохранённых страниц", () -> {
            $(id("org.wikipedia.alpha:id/nav_tab_reading_lists")).click();
            $(id("org.wikipedia.alpha:id/negativeButton")).click();
            $(id("org.wikipedia.alpha:id/empty_title")).shouldHave(text("No saved pages yet"));
        });
        step("Перейти на вкладку `Search`", () -> {
            $(id("org.wikipedia.alpha:id/nav_tab_search")).click();
        });
        step("Проверить, что на вкладке `Search` есть заголовок с историей поиска", () -> {
            $(id("org.wikipedia.alpha:id/history_title")).shouldHave(text("History"));
            $(id("org.wikipedia.alpha:id/history_title")).click();
        });
        step("Перейти на вкладку `Edits`", () -> {
            $(id("org.wikipedia.alpha:id/nav_tab_edits")).click();
        });
        step("Проверить, что на вкладке `Edits` есть заголовок с историей поиска", () -> {
            $(id("org.wikipedia.alpha:id/messageTitleView")).shouldHave(text("Did you know that everyone can edit Wikipedia?"));
        });
    }

    @Tag("wikipediaLocal")
    @Test
    void verifyNavMoreContainers() {
        back();
        step("Проверить, что на вкладке `Explore` есть ", () -> {
            $(id("org.wikipedia:id/nav_more_container")).click();
            $(id("org.wikipedia:id/main_drawer_account_container")).getAttribute("displayed");
            $(id("org.wikipedia:id/main_drawer_settings_container")).getAttribute("displayed");
            $(id("org.wikipedia:id/main_drawer_donate_container")).getAttribute("displayed");
        });
    }
}
