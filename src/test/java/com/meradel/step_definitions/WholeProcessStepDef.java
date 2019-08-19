package com.meradel.step_definitions;

import com.meradel.pages.FramePage;
import com.meradel.pages.HomePage;
import com.meradel.pages.SummaryPage;
import com.meradel.pages.SummerDressPage;
import com.meradel.utilities.BrowserUtil;
import com.meradel.utilities.ConfigurationReader;
import com.meradel.utilities.Driver;
import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WholeProcessStepDef {
    HomePage homePage;
    SummaryPage summaryPage ;
    SummerDressPage summerDressPage;
    FramePage framePage;

    @When("I go to the URL")
    public void i_go_to_the_URL() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("Go to {string} and select {string}")
    public void go_to_and_select(String women, String summer_Dress) {
       homePage = new HomePage();
        BrowserUtil.hover(homePage.women);
        BrowserUtil.waitForVisibility(homePage.summerDressButtom,10);
        homePage.summerDressButtom.click();
    }

    @When("From the available products Grid View, mouse over {string} and click {string}")
    public void from_the_available_products_Grid_View_mouse_over_and_click(String string, String string2) {
        SummerDressPage summerDressPage = new SummerDressPage();
        BrowserUtil.hover(summerDressPage.Printed_Chiffon_Dress);
        summerDressPage.quickView.click();
    }

    @Then("Select {string} size and click on {string}")
    public void select_size_and_click_on(String string, String string2) {
        framePage = new FramePage();
        Driver.getDriver().switchTo().frame(framePage.frame);
        Select select = new Select(framePage.dropDown);
        select.selectByValue("2");
       framePage.add_to_Card.click();
        BrowserUtil.waitForClickablility(framePage.conShopping,20);

    }

    @Then("Click on {string}")
    public void click_on(String string) {
        framePage.conShopping.click();
        Driver.getDriver().switchTo().parentFrame();
    }

    @Then("Go to {string} and click {string}")
    public void go_to_and_click(String string, String string2) {
        BrowserUtil.hover(homePage.Cart);
        BrowserUtil.waitForVisibility(homePage.checkOut,10);
        homePage.checkOut.click();
    }

    @Then("Click {string}")
    public void click(String string) {
        summaryPage = new SummaryPage();
        summaryPage.checkOut.click();
    }

    @When("Enter an email and click on {string}")
    public void enter_an_email_and_click_on(String string) {
        summaryPage.emailInput.sendKeys(summaryPage.randomEmail());
        summaryPage.create.click();
    }

    @When("Fill in mandatory fields and click {string}")
    public void fill_in_mandatory_fields_and_click(String string) {
        BrowserUtil.waitForVisibility(summaryPage.firstName,10);
        summaryPage.fillMandetoryInfo();
    }

    @When("Click {string} on Address tab")
    public void click_on_Address_tab(String string) {
        summaryPage.proceedToCheckOut.click();
    }

    @When("Agree to {string} and Click {string} on Shipping tab")
    public void agree_to_and_Click_on_Shipping_tab(String string, String string2) {
        summaryPage.checkBox.click();
        summaryPage.proceedToCheckOut2.click();
    }

    @Then("Confirm the correct order on {string} tab’")
    public void confirm_the_correct_order_on_tab(String string) {
        Assert.assertEquals(summaryPage.product.getText(),"Printed Chiffon Dress");// verify product name
        Assert.assertTrue(summaryPage.productSize.getText().contains("M"));//verify product size

    }


}
