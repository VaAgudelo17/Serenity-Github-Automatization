package starter.duckduckgo;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class fNavigateActions extends UIInteractions {
    @Step("Navigate to the GitHub login page")
    public void toTheGitHubLoginPage() {
        openUrl("https://github.com/login");
    }
}
