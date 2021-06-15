package core.pages;

import static core.locators.OnBoardLocators.TEXTVIEW_REGISTRY_PAGE;

import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;
import core.hooks.WebDriverHooks;

public class OnBoardPage {

  public void accessingPage(){
    WebDriverHooks.getDriver().get("https://www.amazon.com/");
  }

  public void clickRegistryTab() {
    WebDriverHooks.getDriver().findElement(TEXTVIEW_REGISTRY_PAGE).click();
  }

}
