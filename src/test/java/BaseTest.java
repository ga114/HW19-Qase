import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {

    @BeforeMethod
    public void setup(){
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        Configuration.baseUrl = "https://app.qase.io/";
        Configuration.clickViaJs = true;
        Configuration.headless = false;
       // ChromeOptions options =
    }

    @AfterMethod
    public void quit(){
        getWebDriver().quit();
    }

}
