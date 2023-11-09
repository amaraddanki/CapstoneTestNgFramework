package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyAddToCart extends BaseTest {


    @Test
    public void addProdcutToCart() throws InterruptedException {
        driver.get(URL);
        homePage.clickCloseIcon();
        homePage.enterSearchTexbox("Macbook air m2");
        homePage.clickSearchIcon();
        searchResultsPage.selectFirstProduct();
        productDetailspage.clickAddToCartButton();
        productDetailspage.clickCartIcon();
        cartPage.verifyProduct();

    }



}
