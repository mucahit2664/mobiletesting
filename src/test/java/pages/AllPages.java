package pages;

import pages.android.*;


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



}
