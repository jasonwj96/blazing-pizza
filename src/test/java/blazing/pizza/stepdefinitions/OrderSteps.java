package blazing.pizza.stepdefinitions;

import blazing.pizza.tasks.Navigate;
import blazing.pizza.ui.UI;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class OrderSteps {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que {string} se encuentra en la página de ordenes de pizza")
    public void navega_a_la_pagina_de_ordenes_de_pizza(String actorName) {
        OnStage.theActorCalled(actorName).attemptsTo(Navigate.toTheOrdersPage());
    }

    @When("ordena una pizza {string}")
    public void ordena_una_pizza(String pizzaName) {
        if (null != pizzaName && "Buffalo Chicken".equalsIgnoreCase(pizzaName)) {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    WaitUntil.the(UI.BUFFALO_CHICKEN_PIZZA_BUTTON, isVisible()),
                    Click.on(UI.BUFFALO_CHICKEN_PIZZA_BUTTON),
                    Click.on(UI.ADD_ORDER_BUTTON)
            );
        }
    }

    @When("llena el campo {string} del destinatario con el valor {string}")
    public void llena_campos_de_destinatario(String fieldName, String value) {
        Target field = null;

        if ("nombre".equalsIgnoreCase(fieldName)) {
            field = UI.DELIVER_TO_NAME_FIELD;
        }
        if ("linea 1".equalsIgnoreCase(fieldName)) {
            field = UI.DELIVER_TO_LINE_1_FIELD;
        }
        if ("linea 2".equalsIgnoreCase(fieldName)) {
            field = UI.DELIVER_TO_LINE_2_FIELD;
        }
        if ("ciudad".equalsIgnoreCase(fieldName)) {
            field = UI.DELIVER_TO_CITY_FIELD;
        }
        if ("region".equalsIgnoreCase(fieldName)) {
            field = UI.DELIVER_TO_REGION_FIELD;
        }
        if ("codigo postal".equalsIgnoreCase(fieldName)) {
            field = UI.DELIVER_TO_POSTAL_CODE_FIELD;
        }

        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(field, isVisible()),
                Enter.theValue(value).into(field));
    }

    @When("confirma el envio de las ordenes de pizza")
    public void confirma_envio_de_ordenes() {
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(UI.SEND_ORDER_LIST_BUTTON));
    }

    @When("confirma las ordenes de pizza")
    public void confirma_las_ordenes_de_pizza() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(UI.CONFIRM_ORDER_LIST_BUTTON, isVisible()),
                Click.on(UI.CONFIRM_ORDER_LIST_BUTTON)
        );
    }

    @Then("debería ser redireccionado a la pantalla de inicio de sesión")
    public void deberia_ser_redireccionado_a_inicio_de_sesion() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.thatTheCurrentPage().title().isEqualTo("Blazing Pizza - Log in")
        );
    }

    @Then("deberia ver la orden realizada correctamente")
    public void verificar_orden_realizada() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(UI.ORDER_PLACED_TITLE).isDisplayed());
    }

    @Then("debería ser redireccionado a la pantalla de ordenes")
    public void deberia_ser_redireccionado_a_pantalla_ordenes() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Ensure.that(UI.BUFFALO_CHICKEN_PIZZA_BUTTON).isDisplayed()
        );
    }
}
