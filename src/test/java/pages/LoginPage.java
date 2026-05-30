package pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    final String EMAIL = "[name=email]";
    final String SIGN_IN = "Sign in";
    final String PASSWORD = "[name=password]";
    final String NVLINK = "a[href='/projects']";

    public void openLoginPage() {
        Selenide.open("login");
    }

    public void login(String login, String password) {

        openLoginPage();
        $(EMAIL).shouldBe(visible).setValue(login);
        $(PASSWORD).setValue(password);
        $(byText(SIGN_IN)).click();
        $(NVLINK).shouldBe(visible).click();
    }
}
