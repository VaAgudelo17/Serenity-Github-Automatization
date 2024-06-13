package starter.duckduckgo;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;
import org.openqa.selenium.Keys;

public class LoginActions extends UIInteractions {
  @Step("Enter the username {0}")
  public void enterUsername(String username) {
    $("#login_field").type(username);
  }

  @Step("Enter the password ********")
  public void enterPassword(String password) {
    $("#password").type(password).sendKeys(Keys.ENTER);
  }
}