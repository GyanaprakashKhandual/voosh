package Utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;

public class Reuse {

    WebDriver driver;

    // Constructor
    public Reuse(WebDriver driver) {
        this.driver = driver;
    }

    // Launch app and maximize window
    public void openApp(String url) {
        driver.get(url);
        driver.manage().window().maximize();
    }

    // Close browser
    public void closeApp() {
        driver.quit();
    }

    // Verify page title
    public String getPageTitle(String expectedTitle) {
        String actualTitle = driver.getTitle();
        assertEquals("Page title does not match!", expectedTitle, actualTitle);
        return actualTitle;
    }

    // Verify current URL contains expected part
    public String getCurrentUrl(String expectedUrlPart) {
        String actualUrl = driver.getCurrentUrl();
        assertTrue("URL does not contain expected text!", actualUrl.contains(expectedUrlPart));
        return actualUrl;
    }

    public void backToPreviousPage() {
        driver.navigate().back();
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }
    public void waitFor10Seconds() {
        try {
            Thread.sleep(10000); // 10 seconds = 10000 milliseconds
            System.out.println("Waited for 10 seconds.");
        } catch (InterruptedException e) {
            
        }
    }
    
}
