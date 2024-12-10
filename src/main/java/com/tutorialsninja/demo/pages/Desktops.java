package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customelisteners.CustomListeners;
import com.tutorialsninja.demo.utilies.Utility;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class Desktops extends Utility {

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement Desktop;

    @CacheLookup
    @FindBy(linkText = "Show AllDesktops")
    WebElement showAllDesktop;


    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement shortByPositionName;


    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Currency')]")
    WebElement currency;



    @CacheLookup
    @FindBy(xpath = "//ul[@class = 'dropdown-menu']/li")
    WebElement poundSterling;


    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
    WebElement selectProductHP;


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'HP LP3065')]")
    WebElement verify;


    @CacheLookup
    @FindBy(xpath = "//div[@class = 'input-group date']//button")
    WebElement deliveryDate;


    @CacheLookup
    @FindBy(name = "quantity")
    WebElement enterQty;


    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement addToCart;


    @CacheLookup
    @FindBy(css = "body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible")
    WebElement verifyMessage;


    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart;


    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1\")).contains(\"Shopping Cart")
    WebElement verifyText;


    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement verifyProduct;


    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]")
    WebElement verifyDate;


    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[3]")
    WebElement verifyModel;



    public void mouseHoverOnDesktop() {
        mouseHoverToElementAndClick(Desktop);
        CustomListeners.test.log(Status.PASS,"mouseHour on desktop ");
    }

    public void clickOnShowAllDesktop() {
        clickOnElement(showAllDesktop);
        CustomListeners.test.log(Status.PASS,"click on show all desktop");
    }

    public void selectSortByPositionName() {
        selectByVisibleTextFromDropDown(shortByPositionName, "Name (Z - A)");
        CustomListeners.test.log(Status.PASS,"selectSortByPositionName ");
    }

    public void SelectCurrencyAsPoundSterling() {
        clickOnElement(currency);
        //selectByContainsTextFromDropDown(poundSterling, "£Pound Sterling");
        CustomListeners.test.log(Status.PASS,"SelectCurrencyAsPoundSterling ");

    }

    public void SelectShortByPositionNameAtoZ() {
        selectByVisibleTextFromDropDown(shortByPositionName, "Name (A - Z)");
        CustomListeners.test.log(Status.PASS,"SelectShortByPositionNameAtoZ ");
    }

    public void selectProductHpLP3065() {
        clickOnElement(selectProductHP);
        CustomListeners.test.log(Status.PASS,"selectProductHpLP3065 ");
    }

    public String verifyTextHP() {
        CustomListeners.test.log(Status.PASS,"verifyTextHP ");
        return getTextFromElement(verify);
    }

    public void selectDeliveryDate() {
        clickOnElement(deliveryDate);
        CustomListeners.test.log(Status.PASS,"selectDeliveryDate ");

    }

    public void usingSelectClassEnterQty() {
        sendTextToElement(enterQty, "1");
        CustomListeners.test.log(Status.PASS,"usingSelectClassEnterQty ");
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
        CustomListeners.test.log(Status.PASS,"clickOnAddToCart ");
    }

    public String verifyTheMessage() {
        String message =  getTextFromElement(verifyMessage);
        CustomListeners.test.log(Status.PASS,"verifyTheMessage ");
        return message;
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
        CustomListeners.test.log(Status.PASS,"clickOnShoppingCart ");
    }

    public String verifyTheText() {
        String text = getTextFromElement(verifyText);
        CustomListeners.test.log(Status.PASS,"verifyTheText ");
        return text;
    }

    public String verifyTheProductName() {
        String productName =  getTextFromElement(verifyProduct);
        CustomListeners.test.log(Status.PASS,"verifyTheProductName ");
        return productName;
    }

    public String verifyTheDate() {
        String date = getTextFromElement(verifyDate);
        CustomListeners.test.log(Status.PASS,"verifyTheDate ");
        return date;
    }

    public String verifyTheModel() {
        String model = getTextFromElement(verifyModel);
        CustomListeners.test.log(Status.PASS,"verifyTheModel ");
        return model;
    }
}