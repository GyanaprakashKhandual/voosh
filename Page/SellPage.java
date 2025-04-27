package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SellPage {

    WebDriver driver;

    // Constructor
    public SellPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locator for Sell button
    By sellBtn = By.xpath("//a[normalize-space()='Sell']");

    // Click on Sell button
    public void clickSell() {
        driver.findElement(sellBtn).click();
    }
}
