package test;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;

import java.util.*;

/*
 *  Author: Pierpaolo Spaziani
 */

public class LoginTestPierpaoloWeb {
  private WebDriver driver;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void loginTestPierpaolo() {
    driver.get("http://localhost:8080/FindIT/");
    driver.manage().window().setSize(new Dimension(1920, 979));
    driver.findElement(By.linkText("Profile")).click();
    driver.findElement(By.xpath("//button[@onclick=\"location.href = \'loginView.jsp\';\"]")).click();
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys("Pierpaolo");
    driver.findElement(By.name("password")).sendKeys("pier");
    driver.findElement(By.cssSelector(".searchButton")).click();
  }
}
