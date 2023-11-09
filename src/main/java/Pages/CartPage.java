package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import util.BaseClass;

public class CartPage extends BaseClass {
	
    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='_2Kn22P gBNbID']")
    WebElement productName;
    
    public void verifyProduct()
    {
    	wait.until(ExpectedConditions.elementToBeClickable(productName));
    	String expectedProductText="APPLE 2022 MacBook AIR M2 - (8 GB/256 GB SSD/Mac OS Monterey) MLY33HN/A";
    	String actualProductText=productName.getText();
    	Assert.assertEquals(actualProductText, expectedProductText);
    }
}
