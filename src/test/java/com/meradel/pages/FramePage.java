package com.meradel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.meradel.utilities.Driver;

public class FramePage {
    public FramePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//iframe[contains(@id,'fancybox-frame')]")
    public WebElement frame;

    @FindBy(name = "Submit")
    public WebElement add_to_Card;

    @FindBy(id = "group_1")
    public WebElement dropDown;

    @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")
    public WebElement conShopping;

}
