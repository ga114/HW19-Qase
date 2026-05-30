package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseTest {

    @BeforeAll
    public static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        //делать скриншоты при падении
        Configuration.screenshots = true;
        //сохранять в папке
        Configuration.reportsFolder = "build/reports/tests";
        //сохранять страницу, на которой упало
        Configuration.savePageSource = true;
        Configuration.baseUrl = "https://app.qase.io/";
        Configuration.browser = "firefox";
        Configuration.timeout = 10000;
        Configuration.clickViaJs = true;
        Configuration.headless = false;
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        Configuration.browserCapabilities = options;
        //WebDriver driver = new ChromeDriver(options);

    }

}
