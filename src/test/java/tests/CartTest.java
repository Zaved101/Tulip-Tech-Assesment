package cart;


import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ProductPage;

import static org.testng.Assert.assertTrue;


public class CartTest {


    Playwright playwright;
    Browser browser;
    BrowserContext context;
    Page page;


    @BeforeMethod
    public void setup() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch();
        context = browser.newContext();
        page = context.newPage();
    }


    @Test
    public void verifyCartUpdate() {
        ProductPage product = new ProductPage(page);
        product.selectProduct();
        product.addToCart();
        product.clickCartIcon();


        product.updateQuantity(3);
        String price = product.getPrice();


        assertTrue(price.matches(".*\\d+.*"));
    }


}