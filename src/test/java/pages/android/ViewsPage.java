package pages.android;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.
        pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

public class ViewsPage {
    public ViewsPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(30)),this);
    }
    @AndroidFindBy(xpath = "//*[@text='Drag and Drop']")
    public WebElement dragDropButton;

    @AndroidFindBy(xpath = "//*[@text='Date Widgets']")
    public WebElement dateWidgets;

    @AndroidFindBy(xpath = "//*[@text='Visibility']")
    public List<WebElement> visibility;

    @AndroidFindBy(xpath = "//*[@text='Expandable Lists']")
    public WebElement expandableLists;

    @AndroidFindBy(xpath = "//*[@text='1. Custom Adapter']")
    public WebElement customAdapter;

    @AndroidFindBy(xpath = "//*[@text='People Names']")
    public WebElement peopleNames;

    @AndroidFindBy(xpath = "//*[@text='Arnold']")
    public WebElement arnold;
}
