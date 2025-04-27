package Page;

import java.time.Duration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllPage {

    WebDriver driver;

    public AllPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    

     @FindBy(id = "nav-hamburger-menu")
    WebElement AllBtn;
    @FindBy(xpath = "//div[normalize-space()='Trending']")
    WebElement AllMenu;

    public void checkAllBtn() {
        AllBtn.click();
        // Wait until the AllMenu is visible (max 10 seconds)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         wait.until(ExpectedConditions.visibilityOf(AllMenu));
         assertTrue("All menu is not displayed", AllMenu.isDisplayed());
         System.out.println("All menu is displayed");
    }

    public void checkAllmenuDis() {
        AllMenu.isDisplayed();
        assertFalse(AllMenu.isDisplayed());
        System.out.println("All menu is not displayed");
    }
}
