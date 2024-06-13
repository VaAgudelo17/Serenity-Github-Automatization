package starter.duckduckgo;

import io.github.cdimascio.dotenv.Dotenv;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SerenityJUnit5Extension.class)
class LogginGithubTest {

        @Managed(driver = "chrome", options = "headless")
        WebDriver driver;

        NavigateActions navigate;
        LoginActions login;
        SearchResult searchResult;

        static Dotenv dotenv;

        @BeforeAll
        static void loadEnv(){
                dotenv = Dotenv.load();
        }

        @Test
        void theKeywordShouldAppearInTheResultsSidebar() {
                String username = dotenv.get("GITHUB_USERNAME");
                String password = dotenv.get("GITHUB_PASSWORD");

                navigate.toTheGitHubLoginPage();
                login.enterUsername(username);
                login.enterPassword(password);
                navigate.toTheGitHubProfilePage();

                Serenity.reportThat("Login was successful", () -> {
                        assertThat(searchResult.getTitle()).contains(username);
                });
        }
}
