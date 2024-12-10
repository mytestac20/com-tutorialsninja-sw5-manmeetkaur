package com.tutorialsninja.demo.testsuite;

import com.tutorialsninja.demo.customelisteners.CustomListeners;
import com.tutorialsninja.demo.pages.*;
import com.tutorialsninja.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class DesktopsTest extends TestBase {
    Desktops desktops;

    @BeforeMethod
    public void intIt(){
        desktops = new Desktops();
    }

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){

        // Mouse hover on the Desktops Tab. and click
        desktops.mouseHoverOnDesktop();

        //Click on “Show AllDesktops”
        desktops.clickOnShowAllDesktop();

        //Select Sort By position "Name: Z to A"
        desktops.selectSortByPositionName();

        //Verify the Product will be arranged in Descending order.

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){

        //2.1 Mouse hover on the Currency Dropdown and click
        //2.2 Mouse hover on the £Pound Sterling and click
        desktops.SelectCurrencyAsPoundSterling();

        //2.3 Mouse hover on the Desktops Tab
        desktops.mouseHoverOnDesktop();

        //2.4 Click on the “Show AllDesktops”
        desktops.clickOnShowAllDesktop();

        //2.5 Select the Sort By position "Name: A to Z
        desktops.SelectShortByPositionNameAtoZ();

        //2.6 Select product “HP LP3065”
        desktops.selectProductHpLP3065();

        //2.7 Verify the Text "HP LP3065
        desktops.verifyTextHP();
        String expectedText = "HP LP3065";
        String actualText = desktops.verifyTextHP();
        Assert.assertEquals(actualText,expectedText,"HP LP3065 Product not display");

        //2.8 Select Delivery Date "2024-11-27"
        String year = "2025";
        String month = "November";
        String date = "30";
        desktops.selectDeliveryDate();

        //2.9.Enter Qty "1” using Select class.
        desktops.usingSelectClassEnterQty();

        //2.10 Click on the “Add to Cart” button
        desktops.clickOnAddToCart();

        //2.11 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        desktops.verifyTheMessage();

        //2.12 Click on the link “shopping cart” displayed in a success message
        desktops.clickOnShoppingCart();

        //2.13 Verify the text "Shopping Cart"
        desktops.verifyTheText();
        String expectedText1 = "hopping Cart";
        String actualText1 = desktops.verifyTheText();
        Assert.assertEquals(actualText1,expectedText1,"hopping Cart not found");

        //2.14 Verify the Product name "HP LP3065"
        desktops.verifyTheProductName();
        String expectedProduct = "HP LP3065";
        String actualProduct = desktops.verifyTheProductName();
        Assert.assertEquals(actualProduct,expectedProduct,"Product name not matched");

        //2.15 Verify the Delivery Date "2024-11-27
        desktops.verifyTheDate();
        String expectedDate = "2024-11-27";
        String actualDate = desktops.verifyTheDate();
        Assert.assertEquals(actualDate,expectedDate,"Delivery date not matched");

        //2.16 Verify the Model "Product21"
        desktops.verifyTheModel();
        String expectedModel = "Product21";
        String actualModel = desktops.verifyTheModel();
        Assert.assertEquals(actualModel,expectedModel,"Model not matched");

    }

}