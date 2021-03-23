package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AllPages;
import utilities.Driver;

public class SpinnerStepDefs {
     AllPages allPages = new AllPages();
    @When("user clicks Spinner page")
    public void user_clicks_spinner_page() {
        AndroidDriver driver = (AndroidDriver) Driver.getAppiumDriver();
       //it scroll until -in this case- Spinner text
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Spinner\"))");

        allPages.viewsPage().spinner.click();

    }

    @When("user select {string} from first dropdown")
    public void user_select_from_first_dropdown(String string) {
        allPages.spinnerPage().spinner1.click();
        allPages.spinnerPage().green.click();
        Assert.assertTrue(allPages.spinnerPage().selectedGreen.isDisplayed());
    }

    @When("user select {string} from second dropdown")
    public void user_select_from_second_dropdown(String string) {
      allPages.spinnerPage().spinner2.click();
      allPages.spinnerPage().mars.click();
      Assert.assertTrue(allPages.spinnerPage().selectedMars.isDisplayed());
    }


}
