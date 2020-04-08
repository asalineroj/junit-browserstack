package com.browserstack;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.LocalFileDetector;

public class MobileTest extends BrowserStackJUnitTest {

    @Test
    public void test() throws Exception {

        driver.get("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));

//        driver.setFileDetector(new LocalFileDetector());
//        driver.get("https://www.fileconvoy.com/");
//        driver.findElement(By.id("upfile_0")).sendKeys("//Users/admin/Desktop/test.png");
//        driver.findElement(By.id("readTermsOfUse")).click();
//        driver.findElement(By.name("form_upload")).submit();

        element.sendKeys("BrowserStack");
        element.submit();

        System.out.println(driver.getTitle());
    }
}
