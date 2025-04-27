package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GreatSummerSalePage {

    WebDriver driver;

    // Constructor
    public GreatSummerSalePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locator for Great Summer Sale button
    By greatSummerSaleBtn = By.xpath("//a[@aria-label='Big Savings, More Happiness']");

    // Click on Great Summer Sale button
    public void clickGreatSummerSale() {
        driver.findElement(greatSummerSaleBtn).click();
    }
}
