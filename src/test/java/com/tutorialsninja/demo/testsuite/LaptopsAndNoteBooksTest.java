package com.tutorialsninja.demo.testsuite;

import com.tutorialsninja.demo.customelisteners.CustomListeners;
import com.tutorialsninja.demo.pages.LaptopsAndNotebooks;
import com.tutorialsninja.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LaptopsAndNoteBooksTest extends TestBase {

    LaptopsAndNotebooks laptopsAndNotebooks;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        laptopsAndNotebooks = new LaptopsAndNotebooks();

    }

    @Test(groups = {"sanity"})
    public void verifyProductsPriceDisplayHighToLowSuccessfully(){

        //1.1 Mouse hover on the Laptops & Notebooks Tab. and click
        laptopsAndNotebooks.mouseHoverLaptopAndNoteBook();

        //1.2 Click on “Show AllLaptops & Notebooks”
        laptopsAndNotebooks.clickOnLaptopAndNotebook();

        //1.3 Select the Sort By "Price (High > Low)
        laptopsAndNotebooks.sortByHighToLow();

    }

    @Test(groups = {"sanity","smoke"})
    public void verifyThatUserPlaceOrderSuccessfully(){

        //2.1 Mouse hover on the Laptops & Notebooks Tab. and click
        laptopsAndNotebooks.mouseHoverLaptopAndNoteBook();

        //2.2 Click on “Show AllLaptops & Notebooks”
        laptopsAndNotebooks.clickOnLaptopAndNotebook();


        //2.3 Select the Sort By "Price (High > Low)
        laptopsAndNotebooks.sortByHighToLow();

        //2.4 Select Product “MacBook”
        laptopsAndNotebooks.selectMacBook();

        //2.5 Verify the text “MacBook”
        laptopsAndNotebooks.verifyTheTextMacbook();
        String expected = "MacBook";
        String actual = laptopsAndNotebooks.verifyTheTextMacbook();
        Assert.assertEquals(expected,actual,"MacBook Product not display");

        //2.6 Click on ‘Add To Cart’ button
        laptopsAndNotebooks.clickOnButton();

        //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”

        //2.8 Click on link “shopping cart” display into success message
        laptopsAndNotebooks.clickOnShoppingCart();

        //2.9 Verify the text "Shopping Cart"
        laptopsAndNotebooks.verifyTheShoppingCart();
        String expectedText = "Shopping Cart";
        String actualText = laptopsAndNotebooks.verifyTheShoppingCart();
        Assert.assertEquals(actualText,expectedText,"Shopping Cart not found");

        //2.10 Verify the Product name "MacBook"
        laptopsAndNotebooks.verifyTheProductNameMacbook();
        String expectedProduct = "MacBook";
        String actualProduct = laptopsAndNotebooks.verifyTheProductNameMacbook();
        Assert.assertEquals(actualProduct,expectedProduct,"Product name not matched");

        //2.11 Change Quantity "2"
        laptopsAndNotebooks.changeTheQty();

        //2.12 Click on “Update” Tab
        laptopsAndNotebooks.clickOnUpdate();

        //2.14 Verify the Total £737.45
        laptopsAndNotebooks.verifyTheTotal();
        String expectedTotal = "£737.45";
        String actualTotal = laptopsAndNotebooks.verifyTheTotal();
        Assert.assertEquals(actualTotal,expectedTotal,"Total not matched");



    }
}
