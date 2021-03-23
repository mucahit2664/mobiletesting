package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.bytebuddy.asm.Advice;
import org.junit.Assert;
import pages.AllPages;
import utilities.Driver;

import java.util.HashMap;

public class SwitchesIOSStepDefs {

    AllPages allPages = new AllPages();
    @Given("user clicks on Switches page on IOS")
    public void user_clicks_on_switches_page_on_ios() {
        HashMap<String, Object> scrollObject = new HashMap<>();

        scrollObject.put("direction", "down");
        scrollObject.put("value","Switches");

        Driver.getAppiumDriver().executeScript("mobile:scroll",scrollObject);

        allPages.mainPage().switches.click();
    }

    @Given("user switched on first button")
    public void user_switched_on_first_button() throws InterruptedException {
        Thread.sleep(3000);
        if (allPages.switchesPage().firstSwitchButton.getAttribute("value").equals("0")) {
            allPages.switchesPage().firstSwitchButton.click();
        }
    }

    @Given("user switched off second button")
    public void user_switched_off_second_button() throws InterruptedException {
        Thread.sleep(3000);
        if (allPages.switchesPage().secondSwitchButton.getAttribute("value").equals("1")){
            allPages.switchesPage().secondSwitchButton.click();
        }
    }

    @Then("verify them")
    public void verify_them() {
        Assert.assertEquals("1",allPages.switchesPage().firstSwitchButton.getAttribute("value"));
        Assert.assertEquals("0",allPages.switchesPage().secondSwitchButton.getAttribute("value"));
    }

}
