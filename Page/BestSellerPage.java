package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BestSellerPage {

    WebDriver driver;

    // Constructor
    public BestSellerPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locator for Best Seller button
    By bestSellerBtn = By.xpath("//a[@href='/gp/bestsellers/?ref_=nav_cs_bestsellers']");

    // Click on Best Seller button
    public void clickBestSeller() {
        driver.findElement(bestSellerBtn).click();
    }
}
