package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.files.DownloadActions.click;
import static java.lang.Thread.sleep;

public class SecondLessonSelenide {


    @Test

    void SecondLessonSelenide() throws InterruptedException {

        open("https://github.com/");
        $("div.header-menu-wrapper").$(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        Object like;
        $(".h1-mktg").shouldHave(text("Build like the best"));

        Thread.sleep(5000);


    }


}
