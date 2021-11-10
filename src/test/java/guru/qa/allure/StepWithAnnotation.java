package guru.qa.allure;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

import io.qameta.allure.Step;

public class StepWithAnnotation {

    @Step("Открыть главную страницу")
    public StepWithAnnotation openMainPage() {
        open("https://github.com");
        return this;
    }

    @Step("Найти репозиторий {repository}")
    public StepWithAnnotation searchForRepository(String repository) {
        $(".header-search-input").click();
        $(".header-search-input").sendKeys(repository);
        $(".header-search-input").submit();
        return this;
    }

    @Step("Перейти в репозиторий {repository}")
    public StepWithAnnotation goToRepository(String repository) {
        $(linkText(repository)).click();
        return this;
    }

    @Step("Открыть вкладку Issues")
    public StepWithAnnotation openIssueTab() {
        $(partialLinkText("Issues")).click();
        return this;
    }

    @Step("Проверить, что существует Issue с номером {number}")
    public StepWithAnnotation shouldSeeIssueWithNumber(int number) {
        $(withText("#" + number)).should(visible);
        return this;
    }
}
