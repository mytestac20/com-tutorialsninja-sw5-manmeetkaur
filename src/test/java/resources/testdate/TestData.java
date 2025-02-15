package resources.testdate;

import org.testng.annotations.DataProvider;

public class TestData {


    @DataProvider(name = "productData")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"product","qty","successMessage","ProductName","Model","Total"},
                {"HTC Touch HD", 1, "Success: You have added HTC Touch HD to your shopping cart!", "HTC Touch HD", "Product 1", "£74.73"},
                {"iPhone", 2, "Success: You have added iPhone to your shopping cart!", "iPhone", "product 11", "£150.92"},
                {"Palm Treo Pro", 3, "Success: You have added Palm Treo Pro to your shopping cart!", "Palm Treo Pro", "Product 2", "£1,242.11"}
        };

        return data;
    }
}
