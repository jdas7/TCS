package com.automation.jdas7.features.stepdefinitions;

import com.automation.jdas7.config.StepBase;
import com.automation.jdas7.features.questions.ApprovalQuestion;
import com.automation.jdas7.features.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.util.EnvironmentVariables;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class TcsStepDefinitions extends StepBase {

  private String theRestApiBaseUrl;
  private EnvironmentVariables environmentVariables;
  private static final int WAIT_NEXT_WINDOW = 2;
  private static final String PASSWORD = "password";
  private static final String USERNAME = "username";
  private static final String EMAIL = "email";
  private static final String NAME = "name";
  private static final String MESSAGE = "message";

  @Before
  public void setTheStage() {
    theRestApiBaseUrl = environmentVariables.getProperty("restapi.baseurl");
    OnStage.setTheStage(OnlineCast.whereEveryoneCan(
        CallAnApi.at(theRestApiBaseUrl)
    ));
  }

  @Cuando("realizo un registro exitoso")
  public void registerUser() {
    OnStage.withCurrentActor(
        Register.registro(
            dataProvider.getUserData().get(USERNAME).getAsString(),
            dataProvider.getUserData().get(PASSWORD).getAsString()));

  }

  @Cuando("realizo un login")
  public void loginUser() {
    OnStage.withCurrentActor(
        Login.loginU(
            dataProvider.getUserData().get(USERNAME).getAsString(),
            dataProvider.getUserData().get(PASSWORD).getAsString()));

  }

  @Cuando("ingreso y editar mi informacion de contacto")
  public void editInfoContact() {
    OnStage.withCurrentActor(
        Contact.editContact(
            dataProvider.getUserData().get(EMAIL).getAsString(),
            dataProvider.getUserData().get(NAME).getAsString(),
            dataProvider.getUserData().get(MESSAGE  ).getAsString()));
  }

  @Cuando("agrego un producto a la cesta de compras")
  public void addItem() {
    OnStage.withCurrentActor(
        Buy.buyItem());
  }

  @Entonces("visualizo ordenes de pago y productos de la tienta para comprar")
  public void registerSuccess() {
    theActorInTheSpotlight()
        .should(seeThat("Valida el texto:", ApprovalQuestion.textForm(),
            equalTo("CATEGORIES")));
  }

  @Entonces("visualizo que realice el login")
  public void loginSuccess() {
    theActorInTheSpotlight()
        .should(
            seeThat("Valida el texto:", ApprovalQuestion.textForm(), equalTo("CATEGORIES")),
            seeThat("Valida el texto:", ApprovalQuestion.loginSuccess(), equalTo("Welcome frito")));
  }

  @Entonces("puedo continuar realizando mi compra")
  public void contactEditSuccess() {
    theActorInTheSpotlight()
        .should(
            seeThat("Valida el texto:", ApprovalQuestion.textForm(), equalTo("CATEGORIES")),
            seeThat("Valida el texto:", ApprovalQuestion.loginSuccess(), equalTo("Welcome frito")));
  }

  @Entonces("puedo visualizar los productos que quiero comprar")
  public void cartSuccess() {
    theActorInTheSpotlight()
        .should(
            seeThat("Valida el texto:", ApprovalQuestion.itemCartExist(), equalTo("MacBook Pro")));
  }


}
