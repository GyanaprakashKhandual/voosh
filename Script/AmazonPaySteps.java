package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.AmazonPayPage;
import Utils.Reuse;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonPaySteps {

    WebDriver driver;
    Reuse reuse;
    AmazonPayPage amazonPayPage;

    @Given("User launch the official amazon page")
    public void user_launch_the_official_amazon_page() {
        driver = new ChromeDriver();
        reuse = new Reuse(driver);
        reuse.openApp("https://www.amazon.in/");
    }

    @When("User clicks on the Amazon Pay button and Amazon Pay page is opened")
    public void user_clicks_on_the_amazon_pay_button_and_amazon_pay_page_is_opened() {
        amazonPayPage = new AmazonPayPage(driver);
        amazonPayPage.clickAmazonPay();
        reuse.waitFor10Seconds();
        reuse.getPageTitle("Amazon Pay");
    }

    @When("User clicks on the Amazon Pay button")
    public void user_clicks_on_the_amazon_pay_button() {
        amazonPayPage = new AmazonPayPage(driver);
        amazonPayPage.clickAmazonPay();
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

    @When("User clicks on the Amazon Pay button again")
    public void user_clicks_on_the_amazon_pay_button_again() {
        amazonPayPage = new AmazonPayPage(driver);
        amazonPayPage.clickAmazonPay();
        reuse.waitFor10Seconds();
    }

    @Then("User refresh the page")
    public void user_refresh_the_page() {
        reuse.refreshPage();
        reuse.waitFor10Seconds();
    }

    @Then("Amazon Pay page remains loaded")
    public void amazon_pay_page_remains_loaded() {
        reuse.getCurrentUrl("gp/sva/dashboard");
    }

    @Then("Close the browser")
    public void close_the_browser() {
        reuse.closeApp();
    }
}
