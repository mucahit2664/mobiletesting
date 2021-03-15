package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;

public class LunchApp {
    @Given("aplikasyonu telefona kur")
    public void aplikasyonu_telefona_kur() {
        Driver.getAppiumDriver();
    }
}
