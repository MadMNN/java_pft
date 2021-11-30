package ru.stqa.pft.addressbook;


import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class ContactCreationTest {
  private WebDriver wd;
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk1.8.0_202\\bin\\chromedriver.exe");
    wd = new ChromeDriver();
    wd.get("http://localhost/addressbook/");
    login("admin", "secret");
  }

  private void login(String admin, String secret) {
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(admin);
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(secret);
    wd.findElement(By.xpath("//input[@value='Login']")).click();
  }

  @Test
  public void testContactCreation() throws Exception {

    FillContactForm(new GroupContact("maxim", "Михайлов", "улица Живописная 2-30", "89101201276", "madmnn22@gmail.com"));
    HomeAndLogout();
  }

  private void HomeAndLogout() {
    wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    wd.findElement(By.linkText("home page")).click();
    wd.findElement(By.linkText("Logout")).click();
  }

  private void FillContactForm(GroupContact groupContact) {
    wd.findElement(By.linkText("add new")).click();
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys(groupContact.getFirst());
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys(groupContact.getLast());
    wd.findElement(By.name("address")).clear();
    wd.findElement(By.name("address")).sendKeys(groupContact.getAddr());
    wd.findElement(By.name("mobile")).clear();
    wd.findElement(By.name("mobile")).sendKeys(groupContact.getTel());
    wd.findElement(By.name("email")).clear();
    wd.findElement(By.name("email")).sendKeys(groupContact.getEmail());


  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.quit();

  }

  private boolean isElementPresent(By by) {
    try {
      wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }


}
