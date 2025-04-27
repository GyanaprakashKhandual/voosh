package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewReleasePage {

    WebDriver driver;

    // Constructor
    public NewReleasePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locator for New Release button
    By newReleaseBtn = By.xpath("//a[@href='/gp/new-releases/?ref_=nav_cs_newreleases']");

    // Click on New Release button
    public void clickNewRelease() {
        driver.findElement(newReleaseBtn).click();
    }
}
