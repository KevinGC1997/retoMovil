package appExito.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static appExito.userInterface.InicioAppExitoUI.*;
import static appExito.userInterface.ProductosCelulares.BTN_RETROCEDER;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CerrarSesion implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_RETROCEDER),
                Click.on(BTN_MI_CUENTA),
                WaitUntil.the(BTN_CERRAR_SESION,isVisible()).forNoMoreThan(20).seconds(),
                Click.on(BTN_CERRAR_SESION),
                Click.on(BTN_ACEPTAR_CERRAR_SESION)
        );
    }
    public static CerrarSesion here(){
        return Instrumented.instanceOf(CerrarSesion.class).withProperties();
    }
}
