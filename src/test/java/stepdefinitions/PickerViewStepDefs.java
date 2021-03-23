package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AllPages;

public class PickerViewStepDefs {

    AllPages allPages = new AllPages();


    @Given("user clicks on Picker View page on IOS")
    public void user_clicks_on_picker_view_page_on_ios() {
      allPages.mainPage().pickerView.click();
    }

    @Given("select first one as {string}")
    public void select_first_one_as(String picker1) {
       allPages.pickerViewPage().firstPicker.sendKeys(picker1);
    }

    @Given("select second one as {string}")
    public void select_second_one_as(String  picker2) {
        allPages.pickerViewPage().secondPicker.sendKeys(picker2);
    }

    @Given("select third one as {string}")
    public void selectThirdOneAs(String picker3) {
        allPages.pickerViewPage().thirdPicker.sendKeys(picker3);
    }

    @Then("verify all pickers")
    public void verifyAllPickers() {
        Assert.assertEquals("50",allPages.pickerViewPage().firstPicker.getAttribute("value"));
        Assert.assertEquals("200",allPages.pickerViewPage().secondPicker.getAttribute("value"));
        Assert.assertEquals("150",allPages.pickerViewPage().thirdPicker.getAttribute("value"));
    }
}
