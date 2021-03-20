package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AllPages;
import pages.android.ApiDemosPage;
import pages.android.DragDropPage;
import pages.android.HomePage;
import pages.android.PreferencePage;

public class SwitchStepDefs {

    AllPages allPages = new AllPages();

    @Given("user clicks API Demos page")
    public void user_clicks_api_demos_page() {
        allPages.homePage().apiDemosPage.click();
    }
    @Given("user clicks Preference page")
    public void user_clicks_preference_page() {
        allPages.apiDemosPage().preferencePage.click();
    }
    @Given("user clicks Switch")
    public void user_clicks_switch() {
        allPages.preferencePage().switchPage.click();
    }
    @Given("first switch button should switched on")
    public void first_switch_button_should_switched_on() {
        if(allPages.switchPage().firstSwitchButton.getText().equals("OFF")){
            allPages.switchPage().firstSwitchButton.click();
        }
    }
    @Then("verify first switch button switched on")
    public void verify_first_switch_button_switched_on() {
        Assert.assertEquals("ON",allPages.switchPage().firstSwitchButton.getText());
    }
    @Given("second switch button should switched off")
    public void second_switch_button_should_switched_off() throws InterruptedException {
        Thread.sleep(5000);
        if(allPages.switchPage().secondSwitchButton.getText().equals("YES")){
            allPages.switchPage().secondSwitchButton.click();
        }
    }

    @Then("verify second switch button switch")
    public void verifySecondSwitchButtonSwitch() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals("NO",allPages.switchPage().secondSwitchButton.getText());
    }


    @Given("user switched on switch button")
    public void userSwitchedOnSwitchButton() {
        if (allPages.preferencesFromCodePage().switchButton.getText().equals("OFF")){
            allPages.preferencesFromCodePage().switchButton.click();
        }
    }

    @Then("verify the button switched on")
    public void verifyTheButtonSwitchedOn() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals("ON",allPages.preferencesFromCodePage().switchButton.getText());
    }

    @Given("user clicks Preference from code page")
    public void userClicksPreferenceFromCodePage() {
        allPages.preferencePage().preferenceFromCodePage.click();

    }


}
