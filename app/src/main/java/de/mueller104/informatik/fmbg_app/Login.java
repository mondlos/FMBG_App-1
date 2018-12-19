package de.mueller104.informatik.fmbg_app;

import android.util.EventLog;

import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.CheckBox;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Layout;
import com.google.appinventor.components.runtime.PasswordTextBox;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.VerticalArrangement;

import java.security.MessageDigest;

public class Login extends Form implements HandlesEventDispatching {
    private PasswordTextBox Password;
    private Label Info;
    private Label Info2;
    private Label Info3;
    private CheckBox auto;
    private VerticalArrangement Layout1;
    private HorizontalArrangement Layout2;
    private HorizontalArrangement Layout3;
    private Label Space1;
    private Label Space2;
    private Button Weiter;
    private boolean automatic = false;
    MessageDigest md = MessageDigest.getInstance("SHA-256");
    //private String HashedPassword = ;
    private String Salt = "";



    public void $define(){
        getWindow().setSoftInputMode(2);
        Info = new Label(this);
        Info.Text("FMBG-App");
        //Info.Text(hashed);
        Info.FontBold(true);
        Layout1 = new VerticalArrangement(this);
        Layout1.WidthPercent(100);
        Layout1.HeightPercent(50);
        Layout1.AlignHorizontal(3); //center
        Layout1.AlignVertical(2);
        Password = new PasswordTextBox(Layout1);
        Info2 = new Label(Layout1);
        Info2.Text("Geben Sie bitte das Passwort ein");
        //String hashed = ;
        Space1 = new Label(Layout1);
        Space1.HeightPercent(10);
        Layout2 = new HorizontalArrangement(Layout1);
        Layout2.WidthPercent(90);
        Layout2.AlignHorizontal(2);
        Info3 = new Label(Layout2);
        Info3.Text("automatich einloggen");
        auto = new CheckBox(Layout2);
        Layout3 = new HorizontalArrangement(Layout1);
        Layout3.WidthPercent(100);
        Layout3.AlignHorizontal(2);
        Weiter = new Button(Layout3);
        Weiter.Text("Einloggen");
        EventDispatcher.registerEventForDelegation(this, "2", "Click");
    }

    @Override
    public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] args) {
        if(component.equals(Weiter) && eventName.equals("Click")){

            return true;
        }
        return false;
    }
}

