

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PruebaSumaSelenium {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.gecko.driver", "C:/Users/Administrador/Documents/Docencia/Material/Procesos_Software/geckodriver-v0.23.0-win64/geckodriver.exe");
    driver = new FirefoxDriver();
    System.out.println("Creado el driver");
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testPruebaSuma() throws Exception {
    driver.get("http://127.0.0.1:8080/ucpark-war/");
    Thread.sleep(5000);
    driver.findElement(By.id("j_idt6:op1")).click();
    driver.findElement(By.id("j_idt6:op1")).clear();
    driver.findElement(By.id("j_idt6:op1")).sendKeys("3");
    driver.findElement(By.xpath("//html")).click();
    driver.findElement(By.id("j_idt6:op2")).click();
    driver.findElement(By.id("j_idt6:op2")).clear();
    driver.findElement(By.id("j_idt6:op2")).sendKeys("2");
    driver.findElement(By.id("j_idt6:buttonAdd")).click();
   // Thread.sleep(5000);
    
    assertEquals("6", driver.findElement(By.id("j_idt6:result")).getText());
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.close();
  }

  @After
  public void tearDown() throws Exception {
   // driver.quit();
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
