package pages.ios;

import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class PickerViewPage {
    public PickerViewPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }

    @FindBy(id = "Red color component value")
    public IOSElement firstPicker;

    @FindBy(id = "Green color component value")
    public IOSElement secondPicker;

    @FindBy(id ="Blue color component value")
    public IOSElement thirdPicker;



}
