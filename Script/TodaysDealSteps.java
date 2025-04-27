package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.TodaysDealPage;
import Utils.Reuse;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TodaysDealSteps {

    WebDriver driver;
    Reuse reuse;
    TodaysDealPage todaysDealPage;

    @Given("User launch the official amazon page")
    public void user_launch_the_official_amazon_page() {
        driver = new ChromeDriver();
        reuse = new Reuse(driver);
        reuse.openApp("https://www.amazon.in/");
    }

    @When("User clicks on the Today's Deal button and Today's Deal page is opened")
    public void user_clicks_on_the_todays_deal_button_and_todays_deal_page_is_opened() {
        todaysDealPage = new TodaysDealPage(driver);
        todaysDealPage.clickTodaysDeal();
        reuse.waitFor10Seconds();
        reuse.getPageTitle("Today's Deals");
    }

    @When("User clicks on the Today's Deal button")
    public void user_clicks_on_the_todays_deal_button() {
        todaysDealPage = new TodaysDealPage(driver);
        todaysDealPage.clickTodaysDeal();
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

    @When("User clicks on the Today's Deal button again")
    public void user_clicks_on_the_todays_deal_button_again() {
        todaysDealPage = new TodaysDealPage(driver);
        todaysDealPage.clickTodaysDeal();
        reuse.waitFor10Seconds();
    }

    @Then("User refresh the page")
    public void user_refresh_the_page() {
        reuse.refreshPage();
        reuse.waitFor10Seconds();
    }

    @Then("Today's Deal page remains loaded")
    public void todays_deal_page_remains_loaded() {
        reuse.getCurrentUrl("deals");
    }

    @Then("Close the browser")
    public void close_the_browser() {
        reuse.closeApp();
    }
}
