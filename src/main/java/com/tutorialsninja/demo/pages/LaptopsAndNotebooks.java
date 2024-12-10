package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customelisteners.CustomListeners;
import com.tutorialsninja.demo.utilies.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LaptopsAndNotebooks extends Utility {
    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement laptopAndNoteBook;

    @CacheLookup
    @FindBy(linkText = "Show AllLaptops & Notebooks")
    WebElement showAllLaptopAndNotebook;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement highToLow;

    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement macBook;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'MacBook')]")
    WebElement verifyMacbook;

    @CacheLookup
    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement button;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')")
    WebElement shoppingCart;

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']//h1")
    WebElement verifyShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")
    WebElement verifyProductMacbook;

    @CacheLookup
    @FindBy(xpath = "//input[contains(@name, 'quantity')]")
    WebElement Qty;

    @CacheLookup
    @FindBy(xpath = "//button[contains(@data-original-title, 'Update')]")
    WebElement update;

    @CacheLookup
    @FindBy(xpath = "table-responsive']/table/tbody/tr/td[6]")
    WebElement verifyTotal;


    public void mouseHoverLaptopAndNoteBook() {
        mouseHoverToElementAndClick(laptopAndNoteBook);
        CustomListeners.test.log(Status.PASS, "laptopAndNotebook");
    }

    public void clickOnLaptopAndNotebook() {
        clickOnElement(showAllLaptopAndNotebook);
        CustomListeners.test.log(Status.PASS, "click on laptop and NoteBook");
    }

    public void sortByHighToLow() {
        selectByVisibleTextFromDropDown(highToLow, "Price (Low > High)");
        CustomListeners.test.log(Status.PASS, "sort ByHigh To Low");
    }

    public void selectMacBook() {
        clickOnElement(macBook);
        CustomListeners.test.log(Status.PASS, "select on MacBook");
    }

    public String verifyTheTextMacbook() {
        CustomListeners.test.log(Status.PASS, "verify The TextMacbook");
        return getTextFromElement(verifyMacbook);
    }

    public void clickOnButton() {
        clickOnElement(button);
        CustomListeners.test.log(Status.PASS, "click On Button");
    }
    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
        CustomListeners.test.log(Status.PASS, "click On Shopping Cart");


    }

    public String verifyTheShoppingCart() {
        String cart = getTextFromElement(verifyShoppingCart);
        return cart;
    }

    public String verifyTheProductNameMacbook() {
        CustomListeners.test.log(Status.PASS, "verifyT heProduct NameMacbook ");
        return getTextFromElement(verifyProductMacbook);
    }

    public void changeTheQty() {
        sendTextToElement(Qty, "2");
        CustomListeners.test.log(Status.PASS, "change The Qty ");

    }

    public void clickOnUpdate() {
    }

    public String verifyTheTotal() {
        CustomListeners.test.log(Status.PASS, "verify The Total ");
        return getTextFromElement(verifyTotal);


    }
}
