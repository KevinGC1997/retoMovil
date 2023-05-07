package appExito.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static appExito.userInterface.InicioSesionAppExitoUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InicioSesionAppExito implements Interaction {

    String correo;
    String contrasena;

    public InicioSesionAppExito(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_INGRESAR),
                WaitUntil.the(LBL_CORREO_ELECTRONICO, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(correo).into(LBL_CORREO_ELECTRONICO),
                Enter.theValue(contrasena).into(LBL_CONTRASENA),
                Click.on(BTN_INGRESAR)
        );
    }
    public static InicioSesionAppExito enElSitio(String correo, String contrasena){
        return Instrumented.instanceOf(InicioSesionAppExito.class).withProperties(correo, contrasena);
    }
}
