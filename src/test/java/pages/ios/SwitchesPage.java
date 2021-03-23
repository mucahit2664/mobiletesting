package pages.ios;

import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class SwitchesPage {
    public SwitchesPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }
    @FindBy(xpath = "(//XCUIElementTypeSwitch)[1]")
    public IOSElement firstSwitchButton;

    @FindBy(xpath = "(//XCUIElementTypeSwitch)[2]")
    public IOSElement secondSwitchButton;
}
