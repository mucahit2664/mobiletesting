package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AllPages;

public class ExpandableLisStepDefs {
AllPages allPages = new AllPages();
    @Given("user clicks on Expandable List")
    public void userClicksOnExpandableList() {
        allPages.viewsPage().expandableLists.click();
    }

    @And("user clicks on Customer Adapter")
    public void userClicksOnCustomerAdapter() {
      allPages.viewsPage().customAdapter.click();
    }

    @And("user clicks on People Names")
    public void userClicksOnPeopleNames() {
        allPages.viewsPage().peopleNames.click();
    }

    @Then("verify {string} is displayed")
    public void verifyIsDisplayed(String expectedText) {
        Assert.assertTrue(allPages.viewsPage().arnold.isDisplayed());
    }
}
