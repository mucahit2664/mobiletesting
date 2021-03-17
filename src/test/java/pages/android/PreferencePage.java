package pages.android;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class PreferencePage {
    public PreferencePage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='9. Switch']")
    public WebElement switchPage;



    @AndroidFindBy(xpath = "//android.widget.TextView[@text='5. Preferences from code']")
    public WebElement preferenceFromCodePage;




}
