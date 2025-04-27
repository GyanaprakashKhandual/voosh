package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.GreatSummerSalePage;
import Utils.Reuse;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreatSummerSaleSteps {

    WebDriver driver;
    Reuse reuse;
    GreatSummerSalePage greatSummerSalePage;

    @Given("User launch the official amazon page")
    public void user_launch_the_official_amazon_page() {
        driver = new ChromeDriver();
        reuse = new Reuse(driver);
        reuse.openApp("https://www.amazon.in/");
    }

    @When("User clicks on the Great Summer Sale button and Great Summer Sale page is opened")
    public void user_clicks_on_the_great_summer_sale_button_and_great_summer_sale_page_is_opened() {
        greatSummerSalePage = new GreatSummerSalePage(driver);
        greatSummerSalePage.clickGreatSummerSale();
        reuse.waitFor10Seconds();
        reuse.getPageTitle("Great Summer Sale");
    }

    @When("User clicks on the Great Summer Sale button")
    public void user_clicks_on_the_great_summer_sale_button() {
        greatSummerSalePage = new GreatSummerSalePage(driver);
        greatSummerSalePage.clickGreatSummerSale();
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

    @When("User clicks on the Great Summer Sale button again")
    public void user_clicks_on_the_great_summer_sale_button_again() {
        greatSummerSalePage = new GreatSummerSalePage(driver);
        greatSummerSalePage.clickGreatSummerSale();
        reuse.waitFor10Seconds();
    }

    @Then("User refresh the page")
    public void user_refresh_the_page() {
        reuse.refreshPage();
        reuse.waitFor10Seconds();
    }

    @Then("Great Summer Sale page remains loaded")
    public void great_summer_sale_page_remains_loaded() {
        reuse.getCurrentUrl("summer-sale");
    }

    @Then("Close the browser")
    public void close_the_browser() {
        reuse.closeApp();
    }
}
