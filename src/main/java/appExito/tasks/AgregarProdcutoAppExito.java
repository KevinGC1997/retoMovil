package appExito.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static appExito.userInterface.InicioAppExitoUI.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AgregarProdcutoAppExito implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_CELULARES, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BTN_CELULARES),
                Click.on(BTN_COMPRA_RECOGE),
                Click.on(BTN_SELECCIONE_CIUDAD),
                Click.on(BTN_CIUDAD)

        );

    }
    public static AgregarProdcutoAppExito enElSitio(){
        return Instrumented.instanceOf(AgregarProdcutoAppExito.class).withProperties();
    }
}
