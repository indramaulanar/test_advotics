package core;

import core.pages.OnBoardPage;
import io.cucumber.java.en.Given;

public class OnBoardingStepDef {

  static OnBoardPage onBoardPage = new OnBoardPage();

  @Given("Users access to the amazon web")
  public void usersAccessToTheAmazonWeb() {
    onBoardPage.accessingPage();
  }

  @Given("Users goes to the registry page")
  public void usersGoesToTheRegistryPage() {
    onBoardPage.clickRegistryTab();
  }
}
