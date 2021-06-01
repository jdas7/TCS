package com.automation.jdas7.features.tasks;

import com.automation.jdas7.features.ui.LoginUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {

  private final String username;
  private String password;

  @Step("ingresa usuario y contraseña")
  public static Task loginU(String username, String password) {
    return Instrumented.instanceOf(Login.class).withProperties(username, password);
  }

  public Login(String username, String password) {
    this.username = username;
    this.password = password;
  }

  @Step("realiza el login")
  public <T extends Actor> void performAs(T user) {
    user.attemptsTo(
        WaitUntil.the(LoginUI.BUTTON_LOGIN, isVisible()),
        WaitUntil.the(LoginUI.BUTTON_LOGIN, isEnabled()),
        Click.on(LoginUI.BUTTON_LOGIN),
        WaitUntil.the(LoginUI.USERNAME, isVisible()),
        WaitUntil.the(LoginUI.USERNAME, isEnabled()),
        Enter.theValue(username).into(LoginUI.USERNAME),
        WaitUntil.the(LoginUI.PASSWORD, isVisible()),
        WaitUntil.the(LoginUI.PASSWORD, isEnabled()),
        Enter.theValue(password).into(LoginUI.PASSWORD),
        WaitUntil.the(LoginUI.BUTTON_CONTINUE, isVisible()),
        WaitUntil.the(LoginUI.BUTTON_CONTINUE, isEnabled()),
        Click.on(LoginUI.BUTTON_CONTINUE));

  }


}
