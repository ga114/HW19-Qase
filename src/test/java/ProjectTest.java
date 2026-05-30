import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ProjectTest extends BaseTest {

    @Test
            public void checkCreateProject(){
    open("/login");
    $("[name=email]").setValue("gorev1995andrey@gmail.com");
    $("[name=password]").setValue("gorev1995andrey");
    $(byText("Sign in")).click();

    sleep(1000);
    $(byText("Projects")).click();

    }
    public void deleteProject(String projectName){
        $(byText(projectName))



    }

}