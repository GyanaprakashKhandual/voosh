package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.BestSellerPage;
import Utils.Reuse;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BestSellerSteps {

    WebDriver driver;
    Reuse reuse;
    BestSellerPage bestSellerPage;

    @Given("User launch the official amazon page")
    public void user_launch_the_official_amazon_page() {
        driver = new ChromeDriver();
        reuse = new Reuse(driver);
        reuse.openApp("https://www.amazon.in/");
    }

    @When("User clicks on the Best Seller button and Best Seller page is opened")
    public void user_clicks_on_the_best_seller_button_and_best_seller_page_is_opened() {
        bestSellerPage = new BestSellerPage(driver);
        bestSellerPage.clickBestSeller();
        reuse.waitFor10Seconds();
        reuse.getPageTitle("Amazon Bestsellers");
    }

    @When("User clicks on the Best Seller button")
    public void user_clicks_on_the_best_seller_button() {
        bestSellerPage = new BestSellerPage(driver);
        bestSellerPage.clickBestSeller();
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

    @When("User clicks on the Best Seller button again")
    public void user_clicks_on_the_best_seller_button_again() {
        bestSellerPage = new BestSellerPage(driver);
        bestSellerPage.clickBestSeller();
        reuse.waitFor10Seconds();
    }

    @Then("User refresh the page")
    public void user_refresh_the_page() {
        reuse.refreshPage();
        reuse.waitFor10Seconds();
    }

    @Then("Best Seller page remains loaded")
    public void best_seller_page_remains_loaded() {
        reuse.getCurrentUrl("bestsellers");
    }

    @Then("Close the browser")
    public void close_the_browser() {
        reuse.closeApp();
    }
}
