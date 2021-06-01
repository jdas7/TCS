package com.automation.jdas7.features.tasks;

import com.automation.jdas7.features.ui.ContactUI;
import com.automation.jdas7.features.ui.LoginUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Contact implements Task {

  private final String email;
  private String name;
  private String message;

  @Step("Ingresa a editar su informacion")
  public static Task editContact(String email, String name, String message) {
    return Instrumented.instanceOf(Contact.class).withProperties(email, name, message);
  }

  public Contact(String email, String name, String message) {
    this.email = email;
    this.name = name;
    this.message = message;
  }

  @Step("Envio mis datos de contacto")
  public <T extends Actor> void performAs(T user) {
    user.attemptsTo(
        WaitUntil.the(ContactUI.BUTTON_CONTACT, isVisible()),
        WaitUntil.the(ContactUI.BUTTON_CONTACT, isEnabled()),
        Click.on(ContactUI.BUTTON_CONTACT),
        WaitUntil.the(ContactUI.EMAIL, isVisible()),
        WaitUntil.the(ContactUI.EMAIL, isEnabled()),
        Enter.theValue(email).into(ContactUI.EMAIL),
        WaitUntil.the(ContactUI.NAME, isVisible()),
        WaitUntil.the(ContactUI.NAME, isEnabled()),
        Enter.theValue(name).into(ContactUI.NAME),
        WaitUntil.the(ContactUI.MESSAGE, isVisible()),
        WaitUntil.the(ContactUI.MESSAGE, isEnabled()),
        Enter.theValue(message).into(ContactUI.MESSAGE),
        WaitUntil.the(ContactUI.BUTTON_SEND, isVisible()),
        WaitUntil.the(ContactUI.BUTTON_SEND, isEnabled()),
        Click.on(ContactUI.BUTTON_SEND));
    Hit.the(Keys.ENTER);

  }


}
