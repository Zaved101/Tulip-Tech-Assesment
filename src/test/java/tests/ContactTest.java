package contact;


import com.microsoft.playwright.*;
import org.testng.annotations.*;
import pages.ContactPage;
import static org.testng.Assert.*;


public class ContactTest {


    Playwright playwright;
    Browser browser;
    BrowserContext context;
    Page page;


    @BeforeMethod
    public void setup() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(true));
        context = browser.newContext();
        page = context.newPage();
    }


    @Test
    public void verifyValidationErrors() {
        ContactPage contact = new ContactPage(page);
        contact.open();
        contact.submitEmpty();


        assertTrue(page.locator("text=required").first().isVisible());
    }


    @Test
    public void verifySuccessfulSubmission() {
        ContactPage contact = new ContactPage(page);
        contact.open();
        contact.fillForm("Zaved", "zaved@test.com", "01711111111", "Automation test message");
    }
}