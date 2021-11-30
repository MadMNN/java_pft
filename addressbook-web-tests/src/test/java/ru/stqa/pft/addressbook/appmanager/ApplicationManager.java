package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

  WebDriver wd;
  private SessionHelper SessionHelper;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper ;
  private JavascriptExecutor js;

  public void init() {
    System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk1.8.0_202\\bin\\chromedriver.exe");
   wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    js = (JavascriptExecutor) wd;
    wd.get("http://localhost/addressbook/group.php");
    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    SessionHelper = new SessionHelper(wd);
    SessionHelper.login("admin", "secret");
  }



  public void stop() {
    wd.quit();
  }



  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}
