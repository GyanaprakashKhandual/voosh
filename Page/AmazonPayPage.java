package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonPayPage {

    WebDriver driver;

    // Constructor
    public AmazonPayPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locator for Amazon Pay button
    By amazonPayBtn = By.xpath("//a[@href='/gp/sva/dashboard?ref_=nav_cs_apay']");

    // Click on Amazon Pay button
    public void clickAmazonPay() {
        driver.findElement(amazonPayBtn).click();
    }
}
