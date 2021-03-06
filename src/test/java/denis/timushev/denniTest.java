package denis.timushev;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class denniTest {

    @BeforeAll
    static void setUp() {
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void searchLeproTest() {
        open("https://leprosorium.ru/login/");
        $(".b-login_navigation_devito").click();
        $("[id=js-devito_post_body]").setValue("test test test");
        $("[id=js-devito_email]").setValue("testdenni@denni.com");
        $("[id=js-devito_form_submit]").click();
    }
}
