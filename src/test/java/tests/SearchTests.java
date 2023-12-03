package tests;

import com.codeborne.selenide.Condition;
import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;

public class SearchTests extends TestBase {

    @DisplayName("Проверка наличия элементов в результатах поиска")
    @Test
    @Tag("android")
    void successfulSearchTest() {
        step("Ввести в строку поиска значение Appium", () -> {
            $(accessibilityId("Search Wikipedia")).click();
            $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Appium");
        });
        step("Проверить, что количество найденных элементов больше нуля", () ->
                $$(id("org.wikipedia.alpha:id/page_list_item_title"))
                        .shouldHave(sizeGreaterThan(0)));
    }

    @DisplayName("Проверка наличия в меню кнопки логина и её текста")
    @Test
    @Tag("android")
    void successfulSearchTest2() {
        step("Нажать на кнопку с тремя точками", () -> {
            $(id("org.wikipedia.alpha:id/menu_overflow_button")).click();
        });
        step("Проверить наличие кнопки логина", () ->
                $(id("org.wikipedia.alpha:id/explore_overflow_account_name"))
                        .should(exist)
                        .shouldHave(text("Log in to Wikipedia"))
        );
    }

    @Test
    @Tag("ios")
    void uiElementsTest() {
        step("Проверка отображения элементов на главной", () -> {
            $(AppiumBy.className("XCUIElementTypeStaticText")).$(AppiumBy.name("UI Elements")).should(exist);
            $(AppiumBy.name("Text Button")).shouldBe(Condition.visible);
            $(AppiumBy.name("Text")).shouldBe(Condition.visible);
            $(AppiumBy.name("Tab Bar")).should(exist);
            $(AppiumBy.name("Web View")).should(exist);
            $(AppiumBy.name("Local Testing")).should(exist);
        });
    }
}