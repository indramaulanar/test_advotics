package core.locators;

import org.openqa.selenium.By;

public interface RegistryLocators {

  By TEXTVIEW_REGISTRY_TITLE = By.xpath("//div[contains(text(),'Registry & Gifting')]");
  By TEXTFIELD_REGISTRANT_NAME = By.xpath("//input[contains(placaholder(), 'Search by Registrant name')]");
  By DROPDOWN_REGISTRY_TYPE = By.xpath("//span[contains(text(),'Select a registry or gift list type')]");
  By DROPDOWN_REGISTRY_WEDDING_GIFT = By.id("dropdown1_0");
  By DROPDOWN_REGISTRY_BABY_GIFT = By.id("dropdown1_1");
  By DROPDOWN_REGISTRY_BIRTHDAY_GIFT = By.id("dropdown1_2");
  By DROPDOWN_REGISTRY_CUSTOM_GIFT = By.id("dropdown1_3");
  By BUTTON_SEARCH = By.xpath("//button[contains(text(),'Search')]");
  String TEXT_VIEW_GIFT_LIST_TITLE = "//a[contains(text(),'%s')]";
  By DROPDOWN_MONTH_START_RANGE = By.id("a-autoid-1-announce");
  By DROPDOWN_YEAR_START_RANGE = By.id("a-autoid-2-announce");
  By DROPDOWN_MONTH_END_RANGE = By.id("a-autoid-3-announce");
  By DROPDOWN_YEAR_END_RANGE = By.id("a-autoid-4-announce");
  String DROPDOWN_START_MONTH_LIST = "//a[@id='gr-search-from-month-dropdown_%s']";
  String DROPDOWN_START_YEAR_LIST = "//a[@id='gr-search-from-year-dropdown_%s']";
  String DROPDOWN_END_MONTH_LIST = "//a[@id='gr-search-to-month-dropdown_%s']";
  String DROPDOWN_END_YEAR_LIST = "//a[@id='gr-search-to-year-dropdown_%s']";
  By BUTTON_SEARCH_LIST = By.id("a-autoid-5-announce");
  String TEXTVIEW_DATE_LIST = "//div[contains(text(),'%s')]";



}
