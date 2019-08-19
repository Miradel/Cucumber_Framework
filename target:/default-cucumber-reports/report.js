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
  "status": "passed"
});
formatter.step({
  "name": "Go to \u0027Cart\u0027 and click \u0027Check Out\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "WholeProcessStepDef.go_to_and_click(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click \u0027Proceed to checkout\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "WholeProcessStepDef.click(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter an email and click on \u0027Create an Account\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "WholeProcessStepDef.enter_an_email_and_click_on(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fill in mandatory fields and click \u0027Register\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "WholeProcessStepDef.fill_in_mandatory_fields_and_click(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click \u0027Proceed to checkout\u0027 on Address tab",
  "keyword": "And "
});
formatter.match({
  "location": "WholeProcessStepDef.click_on_Address_tab(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Agree to \u0027Terms of service\u0027 and Click \u0027Proceed to checkout\u0027 on Shipping tab",
  "keyword": "When "
});
formatter.match({
  "location": "WholeProcessStepDef.agree_to_and_Click_on_Shipping_tab(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Confirm the correct order on \u0027Payment\u0027 tab’",
  "keyword": "Then "
});
formatter.match({
  "location": "WholeProcessStepDef.confirm_the_correct_order_on_tab(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});