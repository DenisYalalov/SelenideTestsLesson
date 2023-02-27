package github;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;

public class TestMovingSquaresTest {

    @Test

    void TestMovingSquaresTest() throws InterruptedException {

        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("div#column-a").dragAndDropTo($("div#column-b"));
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
        sleep(5000);
    }
}
