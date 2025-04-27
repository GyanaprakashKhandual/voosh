package Script;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Utils.Reuse;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fresh {

    WebDriver driver;
    Reuse reuse;
    Page.Fresh freshPage;

    @Given("^I am on the amazon home page$")
    public void i_am_on_the_amazon_home_page() {
        driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "Pixel 2");
        options.setExperimentalOption("mobileEmulation", mobileEmulation);
        driver = new ChromeDriver(options);
        reuse = new Reuse(driver);
        freshPage = new Page.Fresh(driver);
        reuse.openApp("https://www.amazon.com/");

    }

    @When("^I click on the Fresh button$")
    public void i_click_on_the_fresh_button() {
        freshPage.clickFresh();
    }

    @Then("^I should see the Fresh page$")
    public void i_should_see_the_fresh_page() {
        reuse.getCurrentUrl("nav_cs_fresh");
        reuse.closeApp();
    }
}
