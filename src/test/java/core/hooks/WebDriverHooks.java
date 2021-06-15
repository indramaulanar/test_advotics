package core.hooks;

import io.cucumber.java.Scenario;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverHooks {

  private static final String CHROME_KEY = "webdriver.chrome.driver";
  private static final String CHROME_VALUE = "./drivers/chromedriver";
  private static WebDriver driver;
  private static WebDriverWait waitDriver;

  public static WebDriver getDriver() {
    return driver;
  }

  @Before
  public void before() {
    System.setProperty(CHROME_KEY, CHROME_VALUE);
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    waitDriver = new WebDriverWait(driver, 10);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
  }

  @After
  public void tearDown(Scenario scenario) {
    if (scenario.isFailed()) {
      byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
      if (screenshot != null) {
        scenario.embed(screenshot, "image/png");
      }
    }
    driver.close();
  }
}
