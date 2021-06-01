package com.automation.jdas7.features.tasks;

import com.automation.jdas7.features.ui.BuyUI;
import com.automation.jdas7.features.ui.ContactUI;
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

public class Buy implements Task {

  @Step("Ingresa a editar su informacion")
  public static Task buyItem() {
    return Instrumented.instanceOf(Buy.class).withProperties();
  }

  @Step("Envio mis datos de contacto")
  public <T extends Actor> void performAs(T user) {
    user.attemptsTo(
        WaitUntil.the(BuyUI.BUTTON_LAPTOPS, isVisible()),
        WaitUntil.the(BuyUI.BUTTON_LAPTOPS, isEnabled()),
        Click.on(BuyUI.BUTTON_LAPTOPS),
        WaitUntil.the(BuyUI.MAC_BOOK_PRO, isVisible()),
        WaitUntil.the(BuyUI.MAC_BOOK_PRO, isEnabled()),
        Click.on(BuyUI.MAC_BOOK_PRO),
        WaitUntil.the(BuyUI.ADD_TO_CART, isVisible()),
        WaitUntil.the(BuyUI.ADD_TO_CART, isEnabled()),
        Click.on(BuyUI.ADD_TO_CART),
        WaitUntil.the(BuyUI.CART, isVisible()),
        WaitUntil.the(BuyUI.CART, isEnabled()),
        Click.on(BuyUI.CART));
    Hit.the(Keys.ENTER);

  }


}
