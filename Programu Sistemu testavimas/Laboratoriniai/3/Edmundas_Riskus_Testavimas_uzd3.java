package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ManoVGTUKalbaEN {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testManoVGTUKalbaEN() throws Exception {
    driver.get("http://mano.vgtu.lt/user/logout");
    driver.get("http://mano.vgtu.lt");
    driver.findElement(By.id("username")).click();
    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("2015xxxx");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("xxxxxxxx");
    driver.findElement(By.xpath("//form[@name='loginform']/descendant::input[@type='submit']")).click();
    driver.findElement(By.cssSelector("#site-language>.dropdown-toggle")).click();
    driver.findElement(By.linkText("English")).click();
    assertEquals("Dashboard", driver.findElement(By.cssSelector(".sidebar-menu>li>a[href='/site/index']>span")).getText());
    assertEquals("Software", driver.findElement(By.cssSelector(".sidebar-menu>li>a[href='/site/software']>span")).getText());
    assertEquals("Library", driver.findElement(By.cssSelector(".sidebar-menu>li>a[href='/site/library']>span")).getText());
    driver.findElement(By.id("user-menu-mini-foto")).click();
    driver.get("http://mano.vgtu.lt/user/logout");
  }

  @AfterMethod 
  public void takeScreenShotOnFailure(ITestResult testResult) throws IOException { 
    if (testResult.getStatus() == ITestResult.FAILURE) { 
      File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
      FileUtils.copyFile(scrFile, new File("errorScreenshots\\" + testResult.getName() + "-" 
        + Arrays.toString(testResult.getParameters()) +  ".jpg"));
    } 
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
