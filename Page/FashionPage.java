package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FashionPage {

    WebDriver driver;

    // Constructor
    public FashionPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locator for Fashion button
    By fashionBtn = By.xpath("//a[normalize-space()='Fashion']");

    // Click on Fashion button
    public void clickFashion() {
        driver.findElement(fashionBtn).click();
    }
}
