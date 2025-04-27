package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.FashionPage;
import Utils.Reuse;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FashionSteps {

    WebDriver driver;
    Reuse reuse;
    FashionPage fashionPage;

    @Given("User launch the official amazon page")
    public void user_launch_the_official_amazon_page() {
        driver = new ChromeDriver();
        reuse = new Reuse(driver);
        reuse.openApp("https://www.amazon.in/");
    }

    @When("User clicks on the Fashion button and Fashion page is opened")
    public void user_clicks_on_the_fashion_button_and_fashion_page_is_opened() {
        fashionPage = new FashionPage(driver);
        fashionPage.clickFashion();
        reuse.waitFor10Seconds();
        reuse.getPageTitle("Fashion Store");
    }

    @When("User clicks on the Fashion button")
    public void user_clicks_on_the_fashion_button() {
        fashionPage = new FashionPage(driver);
        fashionPage.clickFashion();
        reuse.waitFor10Seconds();
    }

    @Then("User clicks on the back button")
    public void user_clicks_on_the_back_button() {
        reuse.backToPreviousPage();
        reuse.waitFor10Seconds();
    }

    @Then("User should be on the amazon home page")
    public void user_should_be_on_the_amazon_home_page() {
        reuse.getPageTitle("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
    }

    @When("User clicks on the Fashion button again")
    public void user_clicks_on_the_fashion_button_again() {
        fashionPage = new FashionPage(driver);
        fashionPage.clickFashion();
        reuse.waitFor10Seconds();
    }

    @Then("User refresh the page")
    public void user_refresh_the_page() {
        reuse.refreshPage();
        reuse.waitFor10Seconds();
    }

    @Then("Fashion page remains loaded")
    public void fashion_page_remains_loaded() {
        reuse.getCurrentUrl("fashion");
    }

    @Then("Close the browser")
    public void close_the_browser() {
        reuse.closeApp();
    }
}
