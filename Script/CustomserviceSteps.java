package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.CustomServicePage;
import Utils.Reuse;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomserviceSteps {

    WebDriver driver;
    Reuse reuse;
    CustomServicePage customServicePage;

    @Given("User launch the official amazon page")
    public void user_launch_the_official_amazon_page() {
        driver = new ChromeDriver();
        reuse = new Reuse(driver);
        reuse.openApp("https://www.amazon.in/");
    }

    @When("User clicks on the Custom Service button and Custom Service page is opened")
    public void user_clicks_on_the_custom_service_button_and_custom_service_page_is_opened() {
        customServicePage = new CustomServicePage(driver);
        customServicePage.clickCustomService();
        reuse.waitFor10Seconds();
        reuse.getPageTitle("Customer Service");
    }

    @When("User clicks on the Custom Service button")
    public void user_clicks_on_the_custom_service_button() {
        customServicePage = new CustomServicePage(driver);
        customServicePage.clickCustomService();
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

    @When("User clicks on the Custom Service button again")
    public void user_clicks_on_the_custom_service_button_again() {
        customServicePage = new CustomServicePage(driver);
        customServicePage.clickCustomService();
        reuse.waitFor10Seconds();
    }

    @Then("User refresh the page")
    public void user_refresh_the_page() {
        reuse.refreshPage();
        reuse.waitFor10Seconds();
    }

    @Then("Custom Service page remains loaded")
    public void custom_service_page_remains_loaded() {
        reuse.getCurrentUrl("customer-service");
    }

    @Then("Close the browser")
    public void close_the_browser() {
        reuse.closeApp();
    }
}
