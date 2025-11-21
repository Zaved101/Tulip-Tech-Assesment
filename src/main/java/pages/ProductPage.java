package pages;


import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;


public class ProductPage extends BasePage {


    private Locator addToCartBtn;
    private Locator quantityInput;
    private Locator updateBtn;
    private Locator priceLabel;
    private Locator clickCartIcon;
    private Locator selectProduct;


    public ProductPage(Page page) {
        super(page);
        selectProduct = page.locator("(//h5[normalize-space()='Combination Pliers'])[1]");
        addToCartBtn = page.locator("(//button[normalize-space()='Add to cart'])[1]");
        quantityInput = page.locator("(//input[@id='quantity-input'])[1]");
        updateBtn = page.locator("text=Update");
        priceLabel = page.locator(".price");
        clickCartIcon = page.locator("(//*[name()='path'][@fill='currentColor'])[1]");
    }

    @Override
    public void navigate(String url) {
        super.navigate("https://practicesoftwaretesting.com/");
    }

    public void selectProduct() {
       selectProduct.click();
    }

    public void addToCart() {
        addToCartBtn.click();
    }

    public void clickCartIcon() {
        clickCartIcon.click();
    }
    public void updateQuantity(int qty) {
        quantityInput.fill(String.valueOf(qty));
        if (updateBtn.count() > 0) updateBtn.click();
    }


    public String getPrice() {
        return priceLabel.first().innerText();
    }
}