package com.tutorialsninja.demo.pages;

import com.aventstack.extentreports.Status;
import com.tutorialsninja.demo.customelisteners.CustomListeners;
import com.tutorialsninja.demo.utilies.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyAccounts extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccount;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement registerAccount;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Returning Customer')]")
    WebElement returningCustomer;

    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstName;

    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "input-email")
    WebElement email;

    @CacheLookup
    @FindBy(id = "input-telephone")
    WebElement Telephone;

    @CacheLookup
    @FindBy(id = "input-password")
    WebElement Password;

    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement PasswordConfirm;

    @CacheLookup
    @FindBy(xpath = "//fieldset[3]//input")
    WebElement subscribeRadioButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@name='agree']")
    WebElement policyCheckBox;

    @CacheLookup
    @FindBy(xpath = "//div[@class = 'buttons']//input[@value='Continue']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement verifyMyAccount;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')")
    WebElement accountLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement accountLogOut;



    public void clickOnMyAccount() {
        clickOnElement(myAccount);
        CustomListeners.test.log(Status.PASS,"clickOnMyAccount");
    }

    public String verifyText() {
        String text = getTextFromElement(registerAccount);
        CustomListeners.test.log(Status.PASS,"verifyText");
        return text;
    }

    public String verifyTheTextReturningCustomer() {
        String customer =  getTextFromElement(returningCustomer);
        CustomListeners.test.log(Status.PASS,"verifyTheTextReturningCustomer");
        return customer;
    }

    public void enterFirstName(String name) {
        sendTextToElement(firstName, "rudraa");
        CustomListeners.test.log(Status.PASS,"enterFirstName");
    }

    public void enterLastName(String name) {
        sendTextToElement(lastName, "parekh");
        CustomListeners.test.log(Status.PASS,"enterLastName");
    }

    public void enterEmailId(String name) {
        sendTextToElement(email, "parekhrudraa@gmail.com");
        CustomListeners.test.log(Status.PASS,"enterEmailId");
    }

    public void enterTelephoneNumber(String name) {
        sendTextToElement(Telephone, "1234567898");
        CustomListeners.test.log(Status.PASS,"enterTelephoneNumber");
    }

    public void enterPassword() {
        sendTextToElement(Password, "Ludhiana@123");
        CustomListeners.test.log(Status.PASS,"enterPassword");
    }

    public void enterPasswordConfirm() {
        sendTextToElement(PasswordConfirm, "Ludhiana@123");
        CustomListeners.test.log(Status.PASS,"enterPasswordConfirm");

    }

//    public void selectSubscribeRadioButton() {
//       selectByContainsTextFromDropDown(subscribeRadioButton);
//       CustomListeners.test.log(Status.PASS,"selectSubscribeRadioButton");
//   }

    public void clickOnPrivacyCheckBox() {
        clickOnElement(policyCheckBox);
        CustomListeners.test.log(Status.PASS,"clickOnPrivacyCheckBox");
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS,"clickOnContinueButton");
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS,"clickOnLoginButton");
    }

    public String verifyTheTextMyAccount() {
        String account = getTextFromElement(verifyMyAccount);
        CustomListeners.test.log(Status.PASS,"verifyTheTextMyAccount");
        return account;
    }

    public void clickOnMyAccountLink() {
        clickOnElement(accountLink);
        CustomListeners.test.log(Status.PASS,"clickOnMyAccountLink");
    }

    public String verifyTheAccountLogOut() {
        String logout = getTextFromElement(accountLogOut);
        CustomListeners.test.log(Status.PASS,"verifyTheAccountLogOut");
        return logout;
    }

}

