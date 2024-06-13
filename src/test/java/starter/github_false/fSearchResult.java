package starter.duckduckgo;

import net.serenitybdd.core.pages.PageComponent;

public class fSearchResult extends PageComponent {

  public String getFlashMessage() {
    return $("div.flash-container div.flash div.js-flash-alert").getText();
  }
}
