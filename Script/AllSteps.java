package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.AllPage;
import Utils.Reuse;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AllSteps {

    WebDriver driver;
    AllPage allPage;
    Reuse reuse;

    // ========== Scenario 1 ==========

    @Given("^User launch the official amazon page$")
    public void user_launch_the_official_amazon_page() {
        driver = new ChromeDriver();
        reuse = new Reuse(driver);
        allPage = new AllPage(driver);
        reuse.openApp(
                "https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=17732138508530020850&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299882&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
    }

    @When("^User clicks on the All side dropdown and the dropdown is opened$")
    public void user_clicks_on_the_all_side_dropdown_and_the_dropdown_is_opened() {
        allPage.checkAllBtn();
        reuse.getCurrentUrl("googhydrabk1");
    }

    @Then("^Close the browser$")
    public void close_the_browser() {
        reuse.closeApp();
    }

    // ========== Scenario 2 ==========

    @Given("^User lauch the amazon page$")
    public void user_lauch_the_amazon_page() {
        driver = new ChromeDriver();
        reuse = new Reuse(driver);
        allPage = new AllPage(driver);
        reuse.openApp("https://www.amazon.in/");
    }

    @When("^User clicks on the All side dropdown$")
    public void user_clicks_on_the_all_side_dropdown() {
        allPage.checkAllBtn();
    }

    @Then("^User clicks on the back button$")
    public void user_clicks_on_the_back_button() {
        reuse.waitFor10Seconds();
        reuse.backToPreviousPage();
    }

    @And("^User on the amazon hoem page$")
    public void user_on_the_amazon_hoem_page() {
        reuse.getCurrentUrl("amazon");
    }

    // ========== Scenario 3 ==========

    @Given("^User lauch the amazon page again$")
    public void user_lauch_the_amazon_page_again() {
        driver = new ChromeDriver();
        reuse = new Reuse(driver);
        allPage = new AllPage(driver);
        reuse.openApp("https://www.amazon.in/");
    }

    @When("^User clicks on the All side dropdown again$")
    public void user_clicks_on_the_all_side_dropdown_again() {
        allPage.checkAllBtn();
    }

    @Then("^User refresh the page$")
    public void user_refresh_the_page() {
        reuse.waitFor10Seconds();
        reuse.refreshPage();
    }

    @And("^Side dropdown is not visible$")
    public void side_dropdown_is_not_visible() {
        allPage.checkAllmenuDis();
    }
}
