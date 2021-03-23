package pages;

import pages.android.*;
import pages.ios.AlertViewsPage;
import pages.ios.MainPage;
import pages.ios.PickerViewPage;
import pages.ios.SwitchesPage;


public class AllPages {

    public AllPages(){
    }
    //create private object for each class
    private ApiDemosPage apiDemosPage;
    private HomePage homePage;
    private PreferencePage preferencePage;
    private ViewsPage viewsPage;
    private SwitchPage switchPage;
    private PreferencesFromCodePage preferencesFromCodePage;
    private DragDropPage dragDropPage;
    private DateWidgetsPage dateWidgetsPage;
    private TextSwitcherPage textSwitcherPage;
    private MainPage mainPage;
    private AlertViewsPage alertViewsPage;
    private SwitchesPage switchesPage;
    private PickerViewPage pickerViewPage;
private SpinnerPage spinnerPage;


    //create public method with class return type and put  if condition and if object is equal to null create new object and return it
    public HomePage homePage(){
        if (homePage == null){
            homePage = new HomePage();
        }return homePage;
    }

    public ApiDemosPage apiDemosPage(){
        if (apiDemosPage == null){
            apiDemosPage =  new ApiDemosPage();
        }return apiDemosPage;
    }
    public PreferencePage preferencePage(){
        if (preferencePage == null){
            preferencePage =  new PreferencePage();
        }return preferencePage;
    }

    public PreferencesFromCodePage preferencesFromCodePage(){
        if (preferencesFromCodePage == null){
            preferencesFromCodePage = new PreferencesFromCodePage();
        }return preferencesFromCodePage;
    }

    public DragDropPage dragDropPage(){
        if (dragDropPage == null){
            dragDropPage = new DragDropPage();
        }return dragDropPage;
    }

    public ViewsPage viewsPage(){
        if (viewsPage == null){
            viewsPage = new ViewsPage();
        }return viewsPage;
    }


    public SwitchPage switchPage(){
        if (switchPage == null){
            switchPage =  new SwitchPage();
        }return switchPage;
    }

    public DateWidgetsPage dateWidgetsPage(){
        if(dateWidgetsPage == null){
            dateWidgetsPage = new DateWidgetsPage();
        }return dateWidgetsPage;
    }

    public TextSwitcherPage textSwitcherPage(){
        if (textSwitcherPage == null){
            textSwitcherPage = new TextSwitcherPage();
        }return textSwitcherPage;
    }

    public MainPage mainPage(){
        if(mainPage == null){
            mainPage = new MainPage();
        }return mainPage;
    }

    public AlertViewsPage alertViewsPage(){
        if (alertViewsPage == null){
            alertViewsPage = new AlertViewsPage();
        }return alertViewsPage;
    }

    public SwitchesPage switchesPage(){
        if (switchesPage == null){
            switchesPage = new SwitchesPage();
        }return switchesPage;
    }

    public PickerViewPage pickerViewPage(){
        if (pickerViewPage == null){
            pickerViewPage = new PickerViewPage();
        }return  pickerViewPage;
    }

    public SpinnerPage spinnerPage(){
        if (spinnerPage == null){
            spinnerPage = new SpinnerPage();
        }return spinnerPage;
    }


}
