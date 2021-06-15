package core.pages;

import static core.locators.RegistryLocators.BUTTON_SEARCH;
import static core.locators.RegistryLocators.BUTTON_SEARCH_LIST;
import static core.locators.RegistryLocators.DROPDOWN_END_MONTH_LIST;
import static core.locators.RegistryLocators.DROPDOWN_END_YEAR_LIST;
import static core.locators.RegistryLocators.DROPDOWN_MONTH_END_RANGE;
import static core.locators.RegistryLocators.DROPDOWN_MONTH_START_RANGE;
import static core.locators.RegistryLocators.DROPDOWN_REGISTRY_BABY_GIFT;
import static core.locators.RegistryLocators.DROPDOWN_REGISTRY_BIRTHDAY_GIFT;
import static core.locators.RegistryLocators.DROPDOWN_REGISTRY_CUSTOM_GIFT;
import static core.locators.RegistryLocators.DROPDOWN_REGISTRY_TYPE;
import static core.locators.RegistryLocators.DROPDOWN_REGISTRY_WEDDING_GIFT;
import static core.locators.RegistryLocators.DROPDOWN_START_MONTH_LIST;
import static core.locators.RegistryLocators.DROPDOWN_START_YEAR_LIST;
import static core.locators.RegistryLocators.DROPDOWN_YEAR_END_RANGE;
import static core.locators.RegistryLocators.DROPDOWN_YEAR_START_RANGE;
import static core.locators.RegistryLocators.TEXTFIELD_REGISTRANT_NAME;
import static core.locators.RegistryLocators.TEXTVIEW_DATE_LIST;
import static core.locators.RegistryLocators.TEXTVIEW_REGISTRY_TITLE;
import static core.locators.RegistryLocators.TEXT_VIEW_GIFT_LIST_TITLE;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;
import core.hooks.WebDriverHooks;

@Component("core.pages.RegistryPage")
public class RegistryPage {

  public void isOnRegistryPage() {
    Assert.assertThat("isn't registry page",
        WebDriverHooks.getDriver().findElements(TEXTVIEW_REGISTRY_TITLE).get(0).getText(),
        Matchers.equalTo("Registry & Gifting"));
  }

  public void enterRegistrantName(String name) {
    WebDriverHooks.getDriver().findElement(TEXTFIELD_REGISTRANT_NAME).sendKeys(name);
  }

  public void selectRegistryType(String type) {
    WebDriverHooks.getDriver().findElement(DROPDOWN_REGISTRY_TYPE).click();
    if (type.equalsIgnoreCase("Birthday")){
      WebDriverHooks.getDriver().findElement(DROPDOWN_REGISTRY_BIRTHDAY_GIFT).click();
    } else if (type.equalsIgnoreCase("Wedding")){
      WebDriverHooks.getDriver().findElement(DROPDOWN_REGISTRY_WEDDING_GIFT).click();
    } else if (type.equalsIgnoreCase("Baby")){
      WebDriverHooks.getDriver().findElement(DROPDOWN_REGISTRY_BABY_GIFT).click();
    } else {
      WebDriverHooks.getDriver().findElement(DROPDOWN_REGISTRY_CUSTOM_GIFT).click();
    }

    WebDriverHooks.getDriver().findElement(BUTTON_SEARCH).click();
  }

  public void checkListingIsAppears() {
    Assert.assertThat("list isn't appears", WebDriverHooks.getDriver()
            .findElements(By.xpath(String.format(TEXT_VIEW_GIFT_LIST_TITLE, "Wish list"))).get(0).getText(),
        Matchers.equalTo("Wish list"));
    Assert.assertThat("list isn't appears", WebDriverHooks.getDriver()
            .findElements(By.xpath(String.format(TEXT_VIEW_GIFT_LIST_TITLE, "Test"))).get(0).getText(),
        Matchers.equalTo("Test"));
  }

  public void selectStartDateRange(String startMonth, int startYear){
    WebDriverHooks.getDriver().findElement(DROPDOWN_MONTH_START_RANGE).click();
    WebDriverHooks.getDriver().findElement(By.xpath(String.format(DROPDOWN_START_MONTH_LIST, month(startMonth)))).click();
    WebDriverHooks.getDriver().findElement(DROPDOWN_YEAR_START_RANGE).click();
    WebDriverHooks.getDriver().findElement(By.xpath(String.format(DROPDOWN_START_YEAR_LIST, year(startYear)))).click();
  }

  public void selectEndDateRange(String endMonth, int endYear){
    WebDriverHooks.getDriver().findElement(DROPDOWN_MONTH_END_RANGE).click();
    WebDriverHooks.getDriver().findElement(By.xpath(String.format(DROPDOWN_END_MONTH_LIST, month(endMonth)))).click();
    WebDriverHooks.getDriver().findElement(DROPDOWN_YEAR_END_RANGE).click();
    WebDriverHooks.getDriver().findElement(By.xpath(String.format(DROPDOWN_END_YEAR_LIST, year(endYear)))).click();
  }

  public void clickSearchList(){
    WebDriverHooks.getDriver().findElement(BUTTON_SEARCH_LIST).click();
  }

  public void checkListingDateIsAppears() {
    Assert.assertThat("date range is not matches", WebDriverHooks.getDriver()
            .findElements(By.xpath(String.format(TEXTVIEW_DATE_LIST, "Apr 17,2021"))).get(0).getText(),
        Matchers.equalTo("Apr 17,2021"));
    Assert.assertThat("date range is not matches", WebDriverHooks.getDriver()
            .findElements(By.xpath(String.format(TEXTVIEW_DATE_LIST, "Mar 04,2021"))).get(0).getText(),
        Matchers.equalTo("Mar 04,2021"));
    Assert.assertThat("date range is not matches", WebDriverHooks.getDriver()
            .findElements(By.xpath(String.format(TEXTVIEW_DATE_LIST, "Jan 02,2021"))).get(0).getText(),
        Matchers.equalTo("Jan 02,2021"));

  }


  private Integer month(String month){
    int val;
    switch (month){
      case "January":
        val = 1;
        break;
      case "February":
        val = 2;
        break;
      case "March":
        val = 3;
      break;
      case "April":
        val = 4;
      break;
      case "May":
        val = 5;
      break;
      case "June":
        val = 6;
      break;
      case "July":
        val = 7;
      break;
      case "August":
        val = 8;
      break;
      case "September":
        val = 9;
      break;
      case "October":
        val = 10;
      break;
      case "November":
        val = 11;
      break;
      case "December":
        val = 12;
      break;
      default:
        throw new IllegalStateException("Unexpected value: " + month);
    }
    return val;
  }

  private Integer year(Integer year){
    int val;
    switch (year){
      case 2019:
        val = 1;
        break;
      case 2020:
        val = 2;
        break;
      case 2021:
        val = 3;
        break;
      case 2022:
        val = 4;
        break;
      case 2023:
        val = 5;
        break;
      case 2024:
        val = 6;
        break;
      case 2025:
        val = 7;
        break;
      case 2026:
        val = 8;
        break;
      case 2027:
        val = 9;
        break;
      case 2028:
        val = 10;
        break;
      default:
        throw new IllegalStateException("Unexpected value: " + year);
    }
    return val;
  }

}
