package DesignPattern.Creational.Factory2;

import DesignPattern.Creational.Factory2.Factory.AndroidUIComponent;
import DesignPattern.Creational.Factory2.Factory.IOSUIComponent;
import DesignPattern.Creational.Factory2.Factory.UIComponent;

public class UIComponentHelper {

    static UIComponent getUIComponentForPlatform(String platform){
        UIComponent uiComponent = null;
        if(platform.equals("Android")){
            uiComponent = new AndroidUIComponent();
        } else if (platform.equals("IOS")) {
            uiComponent = new IOSUIComponent();
        }

        return uiComponent;
    }
}
