package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomServicePage {

    WebDriver driver;

    // Constructor
    public CustomServicePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locator for Custom Service
    By customServiceBtn = By.xpath("//header[@id='navbar-main']//li[1]//div[1]");

    // Click on Custom Service
    public void clickCustomService() {
        driver.findElement(customServiceBtn).click();
    }
}
