package guru.qa;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Configuration;
import java.io.File;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RegisterStudent {

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @BeforeEach
    void openUrl() {
        open("https://demoqa.com/automation-practice-form");
    }

    @DisplayName("Регистрация студента")
    @Test
    void registerStudent() {
        $("#firstName").setValue("Mirka");
        $("#lastName").setValue("Mendeleeva");
        $("#userEmail").setValue("test@gmail.com");
        $("[for='gender-radio-2']").click();
        $("#userNumber").setValue("9111111111");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue("5");
        $(".react-datepicker__year-select").selectOptionByValue("1987");
        $$(".react-datepicker__day").find(text("11")).click();
        $("#subjectsInput").setValue("Arts").pressEnter();
        $("[for='hobbies-checkbox-3']").click();
        $("#uploadPicture").uploadFile(new File("src/resources/123.png"));
        $("#currentAddress").setValue("Big city");
        $("#react-select-3-input").setValue("NCR").pressEnter();
        $("#react-select-4-input").setValue("Delhi").pressEnter();
        $("#submit").click();

        $(".table-responsive").shouldHave(text("Mirka Mendeleeva"), text("test@gmail.com"),
                                          text("Female"), text("9111111111"), text("11 June,1987"),
                                          text("Arts"), text("Music"), text("123.png"),
                                          text("Big city"), text("NCR Delhi"));
    }
}
