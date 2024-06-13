package starter.duckduckgo;

import net.serenitybdd.core.pages.PageComponent;

public class SearchResult extends PageComponent {

  public String getTitle() {
    return $("h1 span.p-nickname").getText();
  }
}