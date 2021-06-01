package com.automation.jdas7.features.tasks;

import com.automation.jdas7.features.ui.RegisterUI;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;


import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Register implements Task {

  private final String username;
  private String password;

  @Step("ingresa usuario y contraseña")
  public static Task registro(String username, String password) {
    return Instrumented.instanceOf(Register.class).withProperties(username, password);
  }

  public Register(String username, String password) {
    this.username = username;
    this.password = password;
  }


  @Step("realiza el registro")
  public <T extends Actor> void performAs(T user) {

    user.attemptsTo(
        WaitUntil.the(RegisterUI.BUTTON_REGISTER, isVisible()),
        WaitUntil.the(RegisterUI.BUTTON_REGISTER, isEnabled()),
        Click.on(RegisterUI.BUTTON_REGISTER),
        WaitUntil.the(RegisterUI.USERNAME, isVisible()),
        WaitUntil.the(RegisterUI.USERNAME, isEnabled()),
        Enter.theValue(username).into(RegisterUI.USERNAME),
        WaitUntil.the(RegisterUI.PASSWORD, isVisible()),
        WaitUntil.the(RegisterUI.PASSWORD, isEnabled()),
        Enter.theValue(password).into(RegisterUI.PASSWORD),
        WaitUntil.the(RegisterUI.BUTTON_CONTINUE, isVisible()),
        WaitUntil.the(RegisterUI.BUTTON_CONTINUE, isEnabled()),
        Click.on(RegisterUI.BUTTON_CONTINUE));
    Hit.the(Keys.ENTER);

  }


}
