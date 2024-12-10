package com.tutorialsninja.demo.testsuite;

import com.tutorialsninja.demo.pages.MyAccounts;
import com.tutorialsninja.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountsTest  extends TestBase {

    MyAccounts myAccounts ;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        myAccounts = new MyAccounts();

    }


//    @Test(groups = {"sanity"})
//    public void selectMyAccountOptions(String option){
//        myAccounts.AccountOptions(option);
//
//        //1.2 Call the method “selectMyAccountOptions()” method and pass the  parameter “Register”
//        myAccounts.AccountOptions("Register");
//
//        //2.2 Call the method “selectMyAccountOptions()” method and pass the  parameter “Login”
//        myAccounts.AccountOptions("Login");
//
//        //3.2 Call the method “selectMyAccountOptions()” method and pass the  parameter “Register”
//        myAccounts.AccountOptions("Register");
//
//        //3.15 Call the method “selectMyAccountOptions()” method and pass the parameter “Logout”
//        myAccounts.AccountOptions("Logout");
//
//        //4.2 Call the method “selectMyAccountOptions()” method and pass the  parameter “Login”
//        myAccounts.AccountOptions("Login");
//
//        //4.9 Call the method “selectMyAccountOptions()” method and pass the parameter “Logout”
//        myAccounts.AccountOptions("Logout");
//    }


    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){

        //1.1 Click on the My Account Link
        myAccounts.clickOnMyAccount();

        //1.3 Verify the text “Register Account”
        myAccounts.verifyText();
        String expectedText = "Register Account";
        String actualText = myAccounts.verifyText();
        Assert.assertEquals(actualText,expectedText,"Register page not displayed");

    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){

        //2.1 Click on the My Account Link
        myAccounts.clickOnMyAccount();

        //2.3 Verify the text “Returning Customer”
        myAccounts.verifyTheTextReturningCustomer();
        String expectedMessage = "Returning Customer";
        String actualMessage = myAccounts.verifyTheTextReturningCustomer();
        Assert.assertEquals(actualMessage,expectedMessage,"Login page not displayed");

    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully(){
        //3.1 Click on the My Account Link
        myAccounts.clickOnMyAccount();

        //3.3 Enter the First Name
        myAccounts.enterFirstName(" getAlphaNumericString(4)");

        //3.4 Enter Last Name
        myAccounts.enterLastName("getAlphaNumericString(4)");

        //3.5 Enter Email
        myAccounts.enterEmailId(" getAlphaNumericString(4) " + "@gmail.com");

        //3.6 Enter Telephone
        myAccounts.enterTelephoneNumber("1234567898");

        //3.7 Enter Password
        myAccounts.enterPassword();

        //3.8 Enter Password Confirm
        myAccounts.enterPasswordConfirm();

        //3.9 Select Subscribe Yes radio button
      //  myAccounts.selectSubscribeRadioButton();

        //3.10 Click on the Privacy Policy check box
        myAccounts.clickOnPrivacyCheckBox();

        //3.11 Click on Continue button
        myAccounts.clickOnContinueButton();

        //3.12 Verify the message “Your Account Has Been Created!”

        //3.13 Click on Continue button
        myAccounts.clickOnContinueButton();

        //3.14 Click on the My Account Link
        myAccounts.clickOnMyAccount();

        //3.16 Verify the text “Account Logout”

        //3.17 Click on Continue button
        myAccounts.clickOnContinueButton();

    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
        //4.1 Click on the My Account Link
        myAccounts.clickOnMyAccount();

        //4.3 Enter Email
        myAccounts.enterEmailId(" getAlphaNumericString(4) " + "@gmail.com");


        //4.4 Enter Last Name
        myAccounts.enterLastName("getAlphaNumericString(4)");


        //4.5 Enter Password
        myAccounts.enterPassword();

        //4.6 Click on the Login button
        myAccounts.clickOnLoginButton();

        //4.7 Verify text “My Account"
        myAccounts.verifyTheTextMyAccount();
        String expectedPage = "My Account";
        String actualPage = myAccounts.verifyTheTextMyAccount();
        Assert.assertEquals(actualPage,expectedPage,"My Account not found");

        //4.8 Click on My Account Link.
        myAccounts.clickOnMyAccountLink();

        //4.10 Verify the text “Account Logout”
        myAccounts.verifyTheAccountLogOut();
        String expectedText = "Account Logout";
        String actualText = myAccounts.verifyTheAccountLogOut();
        Assert.assertEquals(actualText,expectedText,"Not logged out");


        //4.11 Click on Continue button
        myAccounts.clickOnContinueButton();


    }
}