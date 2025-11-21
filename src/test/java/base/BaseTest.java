package base;

import com.microsoft.playwright.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.nio.file.Paths;

public class BaseTest {
    protected Playwright playwright;
    protected Browser browser;
    protected BrowserContext context;
    protected Page page;

    @BeforeClass
    public void setup() {

        System.setProperty("PLAYWRIGHT_SKIP_BROWSER_DOWNLOAD", "1");

        // Create Playwright instance
        playwright = Playwright.create();

        // Launch Chromium using manually downloaded executable
        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions()
                        .setExecutablePath(
                                Paths.get("C:/Users/Mir Info (GP)/Downloads/chromium-win64/chrome-win/chrome.exe"))
                        .setHeadless(false) // change to true if you want headless
        );

        // Create browser context and new page
        context = browser.newContext();
        page = context.newPage();
    }

    @AfterClass
    public void tearDown() {
        // Close all Playwright resources
        if (page != null) page.close();
        if (context != null) context.close();
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
    }
}