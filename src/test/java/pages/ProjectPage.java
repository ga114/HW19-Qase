package pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ProjectPage {

    final String CREATE_NEW_PROJECT = "Create new project";
    final String PROJECT_NAME = "#project-name";
    final String PROJECT_CODE = "#project-code";
    final String SUBMIT_BUTTON = "Create project";
    final String PRO_NAV_LINK = "a[href='/projects']";
    final String REMOVE_OPTION = "[data-testid='remove']";
    final String DELETE_BUTTON = "Delete project";

    public void openProjectPage() {
        open("projects");
    }

    public void createNewProject(String projectName, String projectCode) {
        $(byText(CREATE_NEW_PROJECT)).shouldBe(visible).click();
        $(PROJECT_NAME).setValue(projectName);
        $(PROJECT_CODE).setValue(projectCode);
        $(byText(SUBMIT_BUTTON)).click();
        $(PRO_NAV_LINK).click();
    }

    public void removeProject(String projectName) {
        $(byText(projectName))
                .shouldBe(visible)
                .closest("tr")
                .$("button[aria-label='Open action menu']")
                .click();

        $(REMOVE_OPTION).shouldBe(visible).click();
        $(byText(DELETE_BUTTON)).shouldBe(visible).click();
    }
}
