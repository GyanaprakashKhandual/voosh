package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElectronicsPage {

    WebDriver driver;

    // Constructor
    public ElectronicsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locator for Electronics button
    By electronicsBtn = By.xpath("//a[normalize-space()='Electronics']");

    // Click on Electronics button
    public void clickElectronics() {
        driver.findElement(electronicsBtn).click();
    }
}
