package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import util.BaseClass;

public class ProductDetailspage extends BaseClass {
	
    public ProductDetailspage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[text()='Add to cart']")
    WebElement addToCartButton;
    
    @FindBy(xpath = "//span[text()='Cart']/parent::a")
    WebElement cartIcon;
    
    public void clickAddToCartButton()
    {
    	wait.until(ExpectedConditions.elementToBeClickable(addToCartButton));
    	addToCartButton.click();
    }
    
    public void clickCartIcon()
    {
    	wait.until(ExpectedConditions.elementToBeClickable(cartIcon));
    	cartIcon.click();
    	
    }
}
