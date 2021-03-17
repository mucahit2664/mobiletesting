package pages.android;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class SwitchPage {
    public SwitchPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }
    @AndroidFindBy(xpath = "(//android.widget.Switch)[1]")
    public WebElement firstSwitchButton;
    @AndroidFindBy(xpath = "(//android.widget.Switch)[2]")
    public WebElement secondSwitchButton;
}
