package core;

import core.pages.RegistryPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistryStepDefs {


  RegistryPage registryPage;

  @When("User search registrant name {string}")
  public void userSearchRegistrantName(String userName) {
    registryPage.enterRegistrantName(userName);
  }

  @When("User select type is {string}")
  public void userSelectTypeIs(String registryType) {
    registryPage.selectRegistryType(registryType);
    registryPage.checkListingIsAppears();
  }

  @When("User edit criteria with date range {string} {int} to {string} {int}")
  public void userEditCriteriaWithDateRangeTo(String startMonth, int startYear, String endMonth,
      int endYear) {
    registryPage.selectStartDateRange(startMonth, startYear);
    registryPage.selectEndDateRange(endMonth, endYear);
    registryPage.clickSearchList();
  }

  @Then("User verify date time accordance to that times")
  public void userVerifyDateTimeAccordanceToThatTimes() {
    registryPage.checkListingDateIsAppears();
  }
}
