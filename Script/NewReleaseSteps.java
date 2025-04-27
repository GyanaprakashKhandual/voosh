package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.NewReleasePage;
import Utils.Reuse;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewReleaseSteps {

    WebDriver driver;
    Reuse reuse;
    NewReleasePage newReleasePage;

    @Given("User launch the official amazon page")
    public void user_launch_the_official_amazon_page() {
        driver = new ChromeDriver();
        reuse = new Reuse(driver);
        reuse.openApp("https://www.amazon.in/");
    }

    @When("User clicks on the New Release button and New Release page is opened")
    public void user_clicks_on_the_new_release_button_and_new_release_page_is_opened() {
        newReleasePage = new NewReleasePage(driver);
        newReleasePage.clickNewRelease();
        reuse.waitFor10Seconds();
        reuse.getPageTitle("New Releases");
    }

    @When("User clicks on the New Release button")
    public void user_clicks_on_the_new_release_button() {
        newReleasePage = new NewReleasePage(driver);
        newReleasePage.clickNewRelease();
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

    @When("User clicks on the New Release button again")
    public void user_clicks_on_the_new_release_button_again() {
        newReleasePage = new NewReleasePage(driver);
        newReleasePage.clickNewRelease();
        reuse.waitFor10Seconds();
    }

    @Then("User refresh the page")
    public void user_refresh_the_page() {
        reuse.refreshPage();
        reuse.waitFor10Seconds();
    }

    @Then("New Release page remains loaded")
    public void new_release_page_remains_loaded() {
        reuse.getCurrentUrl("new-releases");
    }

    @Then("Close the browser")
    public void close_the_browser() {
        reuse.closeApp();
    }
}
