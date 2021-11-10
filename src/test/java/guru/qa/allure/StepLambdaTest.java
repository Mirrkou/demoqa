package guru.qa.allure;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StepLambdaTest {

    private static final String REPOSITORY = "eroshenkoam/allure-example";
    private static final Integer ISSUE_NUMBER = 56;
    private static final StepWithAnnotation steps = new StepWithAnnotation();

    @DisplayName("Lambda method")
    @Test
    public void testLambda() {
        step("Открыть главную страницу", ()-> {
            open("https://github.com");
        });
        step("Найти репозиторий " + REPOSITORY, () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys(REPOSITORY);
            $(".header-search-input").submit();
        });
        step("Перейти в репозиторий " + REPOSITORY, () -> {
            $(linkText("eroshenkoam/allure-example")).click();
        });
        step("Открыть вкладку Issues", () -> {
            $(partialLinkText("Issues")).click();
        });
        step("Проверить, что существует Issue с номером " + ISSUE_NUMBER, () -> {
            $(withText("#" + ISSUE_NUMBER)).should(visible);
        });
    }

    @DisplayName("Annotation method")
    @Test
    public void testAnnotation() {
        steps.openMainPage()
             .searchForRepository(REPOSITORY)
             .goToRepository(REPOSITORY)
             .openIssueTab()
             .shouldSeeIssueWithNumber(ISSUE_NUMBER);
    }
}
