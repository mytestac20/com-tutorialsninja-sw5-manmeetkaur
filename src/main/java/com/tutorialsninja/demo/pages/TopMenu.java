package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customelisteners.CustomListeners;
import com.tutorialsninja.demo.utilies.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TopMenu  extends Utility {

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement Desktops;


    @CacheLookup
    @FindBy(linkText = "Show AllDesktops")
    WebElement selectMenu;


    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Desktops']")
    WebElement verifyText;


    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement LaptopsAndNotebooks;


    @CacheLookup
    @FindBy(linkText = "Show AllComponents")
    WebElement getSelectMenu1;


    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Laptops & Notebooks')]")
    WebElement verifyLaptopAndNoteBooks;


    @CacheLookup
    @FindBy(linkText = "Components")
    WebElement components;


    @CacheLookup
    @FindBy(linkText = "Show AllComponents")
    WebElement selectMenuComponents;


    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Components')]")
    WebElement verifyTheText1;


    public void mouseHourOnDesktops() {
        mouseHoverToElementAndClick(Desktops);
        CustomListeners.test.log(Status.PASS,"mouseHourOnDesktops");

    }

    public void clickAndSelectMenu() {
        clickOnElement(selectMenu);
        CustomListeners.test.log(Status.PASS,"clickAndSelectMenu");
    }

    public String verifyTheText() {
        String text = getTextFromElement(verifyText);
        CustomListeners.test.log(Status.PASS, "verifyTheText");
        return text;
    }

    public void clickLaptopsAndNotebooks() {
        mouseHoverToElementAndClick(LaptopsAndNotebooks);
        CustomListeners.test.log(Status.PASS,"clickLaptopsAndNotebooks");
    }

    public void clickAndSelectMenu1() {
        clickOnElement(getSelectMenu1);
        CustomListeners.test.log(Status.PASS,"clickAndSelectMenu1");
    }

    public String verifyTheLaptopAndNoteBooks() {
        String books =  getTextFromElement(verifyLaptopAndNoteBooks);
        CustomListeners.test.log(Status.PASS,"verifyTheLaptopAndNoteBooks");
        return books;
    }

    public void mouseHourOnComponents() {
        mouseHoverToElementAndClick(components);
        CustomListeners.test.log(Status.PASS,"mouseHourOnComponents");
    }

    public void ClickAndSelectComponents() {
        clickOnElement(selectMenuComponents);
        CustomListeners.test.log(Status.PASS,"ClickAndSelectComponents");
    }

    public String verifyTheTextComponents() {
        String components = getTextFromElement(verifyTheText1);
        CustomListeners.test.log(Status.PASS,"verifyTheTextComponents");
        return components;
    }
}