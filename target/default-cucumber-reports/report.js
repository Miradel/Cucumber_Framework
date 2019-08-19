$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/whole_procees_buy_product.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Buy a product",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I go to the URL",
  "keyword": "When "
});
formatter.match({
  "location": "WholeProcessStepDef.i_go_to_the_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Go to \u0027Women\u0027 and select \u0027Summer Dresses\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "WholeProcessStepDef.go_to_and_select(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "From the available products Grid View, mouse over \u0027Printed Chiffon Dress\u0027 and click \u0027Quick view\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "WholeProcessStepDef.from_the_available_products_Grid_View_mouse_over_and_click(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select \u0027M\u0027 size and click on \u0027Add to Cart\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "WholeProcessStepDef.select_size_and_click_on(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on \u0027Continue shopping\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "WholeProcessStepDef.click_on(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cspan\u003e...\u003c/span\u003e is not clickable at point (768, 394). Other element would receive the click: \u003cdiv class\u003d\"fancybox-overlay fancybox-overlay-fixed\" style\u003d\"display: block; width: auto; height: auto; opacity: 0.0256;\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d75.0.3770.100)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Miradels-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:63:bee6:ce7d:8d0f%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.5\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 75.0.3770.100, chrome: {chromedriverVersion: 75.0.3770.8 (681f24ea911fe7..., userDataDir: /var/folders/99/kghhs0g14cj...}, goog:chromeOptions: {debuggerAddress: localhost:62128}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 6340a297b3837c03442ff5a7bf343094\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\n\tat com.meradel.step_definitions.WholeProcessStepDef.click_on(WholeProcessStepDef.java:54)\n\tat ✽.Click on \u0027Continue shopping\u0027(file:src/test/resources/features/whole_procees_buy_product.feature:9)\n",
  "status": "failed"
});
formatter.step({
  "name": "Go to \u0027Cart\u0027 and click \u0027Check Out\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "WholeProcessStepDef.go_to_and_click(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click \u0027Proceed to checkout\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "WholeProcessStepDef.click(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Enter an email and click on \u0027Create an Account\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "WholeProcessStepDef.enter_an_email_and_click_on(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Fill in mandatory fields and click \u0027Register\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "WholeProcessStepDef.fill_in_mandatory_fields_and_click(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click \u0027Proceed to checkout\u0027 on Address tab",
  "keyword": "And "
});
formatter.match({
  "location": "WholeProcessStepDef.click_on_Address_tab(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Agree to \u0027Terms of service\u0027 and Click \u0027Proceed to checkout\u0027 on Shipping tab",
  "keyword": "When "
});
formatter.match({
  "location": "WholeProcessStepDef.agree_to_and_Click_on_Shipping_tab(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Confirm the correct order on \u0027Payment\u0027 tab’",
  "keyword": "Then "
});
formatter.match({
  "location": "WholeProcessStepDef.confirm_the_correct_order_on_tab(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});