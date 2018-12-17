package de.mueller104.informatik.fmbg_app;

import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;

public class Login extends Form implements HandlesEventDispatching {
    public void $define(){

    }

    @Override
    public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] args) {
        return false; //no
    }
}

