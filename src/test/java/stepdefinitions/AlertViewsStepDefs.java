package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AllPages;
import utilities.ReusableMethods;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

public class AlertViewsStepDefs {
    AllPages allPages = new AllPages();
    @Given("user clicks on Alert Views page on IOS")
    public void user_clicks_on_alert_views_page_on_ios() {
        ReusableMethods.clickOnPageIOSDevice("Alert Views");
     //  allPages.mainPage().alertViews.click();
    }

    @Given("user clicks on Text Entery page on IOS")
    public void user_clicks_on_text_entery_page_on_ios() {
       allPages.alertViewsPage().textEntery.click();
    }

    @Given("user provide {string} to text box")
    public void user_provide_to_text_box(String text) {

        allPages.alertViewsPage().textBox.sendKeys(text);
    }

    @Then("user clicks OK")
    public void user_clicks_ok() {
        allPages.alertViewsPage().OKButton.click();
    }

}
