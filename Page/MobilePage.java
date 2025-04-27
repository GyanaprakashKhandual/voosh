package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MobilePage {

    WebDriver driver;

    // Constructor
    public MobilePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locator for Mobile button
    By mobileBtn = By.xpath("//a[normalize-space()='Mobiles']");

    // Click on Mobile button
    public void clickMobile() {
        driver.findElement(mobileBtn).click();
    }
}
