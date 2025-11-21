package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ContactPage extends BasePage {

    private Locator firstNameInput;
    private Locator lastNameInput;
    private Locator emailInput;
    private Locator messageInput;
    private Locator sendButton;

    public ContactPage(Page page) {
        super(page);

        firstNameInput = page.locator("(//input[@id='first_name'])[1]");
        lastNameInput = page.locator("(//input[@id='last_name'])[1]");
        emailInput = page.locator("(//input[@id='email'])[1]");
        messageInput = page.locator("(//textarea[@id='message'])[1]");
        sendButton = page.locator("(//input[@value='Send'])[1]");
    }

    public void open() {
        navigate("https://practicesoftwaretesting.com/contact");
        waitForLoad();
    }

    public void submitEmpty() {
        sendButton.click();
    }

    public void fillForm(String firstName, String lastName, String email, String message) {
        firstNameInput.fill(firstName);
        lastNameInput.fill(lastName);
        emailInput.fill(email);
        messageInput.fill(message);
    }

    public void submit() {
        sendButton.click();
    }
}