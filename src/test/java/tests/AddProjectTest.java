package tests;

import dto.User;
import org.testng.annotations.Test;
import pages.*;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AddProjectTest extends BaseTest {

    private final String PROJECT_NAME = "ProjectDemo";
    private final String PROJECT_CODE = "DemoCode";

    LoginPage loginPage = new LoginPage();
    ProjectPage projectsPage = new ProjectPage();

    @Test
            public void checkCreateProject(){

        loginPage.login(User.testUser().login(), User.testUser().password());
        projectsPage.createNewProject(PROJECT_NAME, PROJECT_CODE);
        $(byText(PROJECT_NAME)).shouldBe(visible);
        projectsPage.removeProject(PROJECT_NAME);
    }
}