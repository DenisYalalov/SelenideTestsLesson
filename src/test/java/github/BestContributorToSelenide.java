package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.Thread.sleep;


public class BestContributorToSelenide {


    @Test
    void andreiSolntsevSholdBeTheFirstContributor() throws InterruptedException {

    open ("https://github.com/selenide/selenide");
        $("div.Layout-sidebar").$(byText("Contributors"))
                //.closest("BorderGrid-cell").$$("ul li").first().hover();
                        .closest("h2").sibling(0).$$("li").first().hover();
        $(".Popover-message").shouldHave(text("Andrei Solntsev"));

        sleep(5000);




    }
}


