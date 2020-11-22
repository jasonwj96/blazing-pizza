package blazing.pizza.stepdefinitions;

import blazing.pizza.tasks.Navigate;
import blazing.pizza.ui.UI;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.Wait;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginSteps {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que {string} inició con el email {string} y la contraseña {string}")
    public void inicio_de_sesion(String actorName, String email, String password) {
        OnStage.theActorCalled(actorName).attemptsTo(
                Navigate.toTheLoginPage(),
                WaitUntil.the(UI.EMAIL_FIELD, isVisible()),
                Enter.theValue(email).into(UI.EMAIL_FIELD),
                WaitUntil.the(UI.PASSWORD_FIELD, isVisible()),
                Enter.theValue(password).into(UI.PASSWORD_FIELD),
                WaitUntil.the(UI.LOGIN_BUTTON, isVisible()),
                Click.on(UI.LOGIN_BUTTON)
        );
    }

    @Entonces("deberia ver un mensaje con el texto Invalid login attempt.")
    public void verificar_mensaje_de_inicio_de_sesion_invalido() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(UI.INVALID_LOGIN_MESSAGE, isVisible()),
                Ensure.that(UI.INVALID_LOGIN_MESSAGE).isDisplayed()
        );
    }
}