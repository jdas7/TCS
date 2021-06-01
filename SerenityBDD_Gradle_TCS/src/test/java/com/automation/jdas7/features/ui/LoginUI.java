package com.automation.jdas7.features.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {

    public static final Target BUTTON_LOGIN = Target.the("boton login")
        .located(By.xpath("//*[@id=\"login2\"]"));

    public static final Target USERNAME = Target.the("username")
        .located(By.xpath("//*[@id=\"loginusername\"]"));

    public static final Target PASSWORD = Target.the("contraseña")
        .located(By.xpath("//*[@id=\"loginpassword\"]"));

    public static final Target BUTTON_CONTINUE = Target.the("boton Log in")
        .located(By.xpath("//*[@id=\"logInModal\"]/div/div//button[2]"));

}
