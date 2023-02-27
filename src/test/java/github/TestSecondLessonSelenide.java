package github;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
class TestSecondLessonSelenide {
    @Test
    public void SecondLessonSelenide() throws InterruptedException {
        open("https://github.com/");
        $("div.header-menu-wrapper").$(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $(".h1-mktg").shouldHave(text("Build like the best"));
        Thread.sleep(5000);


    }


}
