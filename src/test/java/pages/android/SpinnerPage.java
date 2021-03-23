package pages.android;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class SpinnerPage {
    public SpinnerPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }

     @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/spinner1")
    public WebElement spinner1;

    @AndroidFindBy(id = "com.touchboarder.android.api.demos:id/spinner2")
    public WebElement spinner2;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='green']")
    public WebElement green;

    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Mars']")
    public WebElement mars;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='green']")
    public WebElement selectedGreen;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Mars']")
    public WebElement selectedMars;
}
