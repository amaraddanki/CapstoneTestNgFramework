package TestCases;

import Pages.SearchResultsPage;
import Pages.CartPage;
import Pages.HomePage;
import Pages.ProductDetailspage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import util.BaseClass;
import util.utility;

import java.util.Properties;

public class BaseTest {

    protected SearchResultsPage searchResultsPage;
    protected ProductDetailspage productDetailspage;
    protected HomePage homePage;
    CartPage cartPage;
    WebDriver driver;
    Properties properties;
    static String URL;

    @BeforeSuite
    public void setUp() {
        String propertyPath = System.getProperty("user.dir") + "//src//test//resources//Env.properties";
        try {
        	
            driver = BaseClass.init_driver("chrome");
            properties = utility.loadProperties(propertyPath);
            URL = properties.getProperty("URL");

            searchResultsPage = new SearchResultsPage(driver);
            homePage = new HomePage(driver);
            productDetailspage=new ProductDetailspage(driver);
            cartPage=new CartPage(driver);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @AfterSuite
    public void destroyDriver() {
        driver.quit();
    }
}