package com.browserstack;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.remote.LocalFileDetector;

public class SingleTest extends BrowserStackJUnitTest {

  @Test
  public void test() throws Exception {
    WebDriverWait wait = new WebDriverWait(driver, 5);
    driver.get("https://www.google.com");

    //Explicit wait
    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));

    element.sendKeys("BrowserStack");
    element.submit();

    try{
      assertEquals("BrowserStack - Pesquisa Google", driver.getTitle());
    } catch (AssertionError e){
      markTest("failed","");
      throw e;
    }
    markTest("passed","");
  }
}
