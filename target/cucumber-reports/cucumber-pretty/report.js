$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/DesktopsPageFeatures.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Desktop Page Items",
  "description": "",
  "id": "verify-desktop-page-items",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1686779000,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on retail website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on Desktops tab",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User click on show all Desktops",
  "keyword": "And "
});
formatter.match({
  "location": "DesktopPageStepDefinitions.user_is_on_retail_website()"
});
formatter.result({
  "duration": 2072106100,
  "status": "passed"
});
formatter.match({
  "location": "DesktopPageStepDefinitions.user_click_on_Desktops_tab()"
});
formatter.result({
  "duration": 479205000,
  "status": "passed"
});
formatter.match({
  "location": "DesktopPageStepDefinitions.user_click_on_show_all_Desktops()"
});
formatter.result({
  "duration": 3839921200,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User add HP LP 3065 from Desktops tab to the cart",
  "description": "",
  "id": "verify-desktop-page-items;user-add-hp-lp-3065-from-desktops-tab-to-the-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@AddHPtoCart"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User click ADD TO CART option on ‘HP LP3065’item",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User select quantity (.+)",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User click add to Cart button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User should see a message ‘Success: you have added HP LP 3065 to your Shopping cart!’",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "3065",
      "offset": 39
    }
  ],
  "location": "DesktopPageStepDefinitions.user_click_ADD_TO_CART_option_on_HP_LP_item(int)"
});
formatter.result({
  "duration": 3364869200,
  "error_message": "org.openqa.selenium.NoAlertPresentException: no such alert\n  (Session info: chrome\u003d88.0.4324.150)\nBuild info: version: \u00273.7.0\u0027, revision: \u00272321c73\u0027, time: \u00272017-11-02T22:22:35.584Z\u0027\nSystem info: host: \u0027DESKTOP-CNQMBI4\u0027, ip: \u0027192.168.0.191\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 88.0.4324.150, chrome: {chromedriverVersion: 88.0.4324.96 (68dba2d8a0b14..., userDataDir: C:\\Users\\ROMA\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:49693}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 9bab54d1923bf9dce8004a9439a8c863\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:657)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteTargetLocator.alert(RemoteWebDriver.java:986)\r\n\tat utilities.WebDriverUtility.acceptAlert(WebDriverUtility.java:49)\r\n\tat stepDefinitions.DesktopPageStepDefinitions.user_click_ADD_TO_CART_option_on_HP_LP_item(DesktopPageStepDefinitions.java:57)\r\n\tat ✽.And User click ADD TO CART option on ‘HP LP3065’item(Features/DesktopsPageFeatures.feature:15)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "(.+)",
      "offset": 21
    }
  ],
  "location": "DesktopPageStepDefinitions.user_select_quantity(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "DesktopPageStepDefinitions.user_click_add_to_Cart_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "3065",
      "offset": 57
    }
  ],
  "location": "DesktopPageStepDefinitions.user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 4688800900,
  "status": "passed"
});
});