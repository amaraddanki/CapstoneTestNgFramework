package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import util.BaseClass;

public class HomePage extends BaseClass {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@placeholder='Search for Products, Brands and More']")
    WebElement searchTextbox;

    @FindBy(xpath = "//button[@title='Search for Products, Brands and More']")
    WebElement searchIcon;
    
    @FindBy(xpath = "//span[text()='✕']")
    WebElement closeIcon;
    
    public void enterSearchTexbox(String product)
    {
    	searchTextbox.sendKeys(product);
    }
    
    public void clickSearchIcon()
    {
    	searchIcon.click();
    }
    
    public void clickCloseIcon()
    {
    	closeIcon.click();
    }



}
