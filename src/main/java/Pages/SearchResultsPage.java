package Pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import util.BaseClass;

public class SearchResultsPage extends BaseClass {

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='_1fQZEK']")
    List<WebElement> firstProduct;
    
    public void selectFirstProduct() throws InterruptedException
    {
    	firstProduct.get(0).click();
    	Thread.sleep(2000);
    	List<String> allWindows=new ArrayList<String>(driver.getWindowHandles());
    	driver.switchTo().window(allWindows.get(1));
    }




}
