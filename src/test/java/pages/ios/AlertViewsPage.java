package pages.ios;

import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class AlertViewsPage {
    public AlertViewsPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='Text Entry']")
    public IOSElement textEntery;

    @FindBy(className = "XCUIElementTypeOther")
    public IOSElement textBox;

    @FindBy(id = "OK")
    public IOSElement OKButton;

    @FindBy(id = "Simple")
    public IOSElement simpleButton;

    @FindBy(xpath = "//XCUIElementTypeStaticText[@name='A Short Title Is Best']")
    public IOSElement popUpText;

}
