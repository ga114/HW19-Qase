package tests;

import dto.User;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProjectPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RemoveProjectTest extends BaseTest{

    final String PROJECT_NAME = "ProjectDemo";
    final String PROJECT_CODE = "DemoCode";

    LoginPage loginPage = new LoginPage();
    ProjectPage projectsPage = new ProjectPage();

    @Test
    public void removeProjectAndCheck(){
        loginPage.login(User.testUser().login(), User.testUser().password());
        projectsPage.createNewProject(PROJECT_NAME, PROJECT_CODE);
        projectsPage.openProjectPage();
        projectsPage.removeProject(PROJECT_NAME);
        projectsPage.openProjectPage();
        $(byText(PROJECT_NAME)).shouldBe(visible);
    }
}
