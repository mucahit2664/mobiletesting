package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AllPages;

public class AlertIOSStepDefs {
   AllPages allPages = new AllPages();
    @Given("user clicks on Simple page on IOS")
    public void user_clicks_on_simple_page_on_ios() {
        allPages.alertViewsPage().simpleButton.click();
    }

    @Then("verify Alert popup")
    public void verify_alert_popup() {
        Assert.assertTrue(allPages.alertViewsPage().popUpText.isDisplayed());
    }

    @Then("click OK")
    public void click_ok() {
        allPages.alertViewsPage().OKButton.click();
    }

}
