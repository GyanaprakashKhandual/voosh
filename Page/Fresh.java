package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fresh {
    
    WebDriver driver;
    public Fresh(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[normalize-space()='Fresh']") WebElement freshBtn;

    public void clickFresh() {
        freshBtn.click();
    }
}
