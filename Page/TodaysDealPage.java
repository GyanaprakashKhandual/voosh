package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TodaysDealPage {

    WebDriver driver;

    // Constructor
    public TodaysDealPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locator for Today's Deal button
    By todaysDealBtn = By.xpath("//a[@href='/deals?ref_=nav_cs_gb']");

    // Click on Today's Deal button
    public void clickTodaysDeal() {
        driver.findElement(todaysDealBtn).click();
    }
}
