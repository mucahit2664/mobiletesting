package pages.ios;

import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class MainPage {
    public MainPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Activity Indicators']")
    public IOSElement activityIndicator;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Alert Views']")
    public IOSElement alertViews;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Switches']")
    public IOSElement switches;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Picker View']")
    public IOSElement pickerView;
}
