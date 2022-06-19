package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticeFormTest {
    @BeforeAll
    static void beforeAll(){
        Configuration.startMaximized = true;
        Configuration.baseUrl = "https://demoqa.com";
    }
    @Test
    void formTest(){
        open("/automation-practice-form");
        $("#firstName").setValue("Ilya");
        $("#lastName").setValue("Kochetkov");
        $("#userEmail").setValue("kochetkov@gmail.com");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("7939759565");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("July");
        $(".react-datepicker__year-select").selectOption("1997");
        $(".react-datepicker__day--031").click();
        $("#subjectsInput").setValue("English").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbiesWrapper").$(byText("Music")).click();
        $("#uploadPicture").uploadFromClasspath("img/myPhoto.img");
        $("#currentAddress").setValue("Samara Novo-Sadovaya");
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Noida")).click();
        $("#submit").click();

        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Ilya"),
                text("Kochetkov"),
                text("kochetkov@gmail.com"),
                text("Male"),
                text("7939759565"),
                text("31 July,1997"),
                text("English"),
                text("Sports"),
                text("Music"),
                text("myPhoto.img"),
                text("Samara Novo-Sadovaya"),
                text("NCR"),
                text("Noida"));
    }
}
