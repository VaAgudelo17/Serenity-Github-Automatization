package starter.duckduckgo;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class NavigateActions extends UIInteractions {
    @Step("Navigate to the GitHub login page")
    public void toTheGitHubLoginPage() {
        openUrl("https://github.com/login");
    }

    @Step("Navigate to the user's Github profile page")
    public void toTheGitHubProfilePage() {
        openUrl("https://github.com/VaAgudelo17");
    }
}
