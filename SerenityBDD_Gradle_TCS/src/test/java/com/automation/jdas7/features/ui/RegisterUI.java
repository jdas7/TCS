package com.automation.jdas7.features.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterUI {

    public static final Target BUTTON_REGISTER = Target.the("boton registrar")
        .located(By.xpath("//*[@id=\"signin2\"]"));

    public static final Target USERNAME = Target.the("correo")
        .located(By.xpath("//*[@id=\"sign-username\"]"));

    public static final Target PASSWORD = Target.the("contraseña")
        .located(By.xpath("//*[@id=\"sign-password\"]"));

    public static final Target BUTTON_CONTINUE = Target.the("boton Sing Up")
        .located(By.xpath("//*[@id=\"signInModal\"]/div/div//button[2]"));

    public static final Target BUTTON_CAT = Target.the("boton de categorias")
        .located(By.xpath("//*[@id=\"cat\"]"));

}
