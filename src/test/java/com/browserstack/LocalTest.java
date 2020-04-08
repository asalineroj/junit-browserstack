package com.browserstack;

import static org.junit.Assert.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.junit.Test;

public class LocalTest extends BrowserStackJUnitTest {

  @Test
  public void test() throws Exception {
    driver.get("http://bs-local.com:45691/check");

    assertTrue(driver.getPageSource().contains("Up and running"));
    driver.get("http://localhost:8000");
    markTest("passed","");
  }
}
