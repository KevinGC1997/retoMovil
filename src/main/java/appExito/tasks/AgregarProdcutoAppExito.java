package appExito.tasks;

import appExito.interactions.CerrarSesion;
import appExito.interactions.ExplicitWait;
import appExito.utils.RobotJava;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static appExito.userInterface.InicioAppExitoUI.*;
import static appExito.userInterface.ProductosCelulares.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class AgregarProdcutoAppExito implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_CELULARES),
                Click.on(BTN_ENVIO_DOMICILIO),
                Click.on(BTN_CONTINUAR),
                WaitUntil.the(TXT_PRODUCTO, isVisible()).forNoMoreThan(20).seconds()
        );
        String nombreProducto = TXT_PRODUCTO.resolveFor(actor).getText();
        System.out.println(nombreProducto);
        actor.attemptsTo(
                Click.on(BTN_AGREGAR),
                Click.on(BTN_CARRITO),
                WaitUntil.the(TXT_PRODUCTO_CARRITO, isVisible()).forNoMoreThan(20).seconds()
        );
        String nombreProducto2 = TXT_PRODUCTO_CARRITO.resolveFor(actor).getText();
        System.out.println(nombreProducto2);
        actor.attemptsTo(
                Ensure.that(nombreProducto2).isEqualTo(nombreProducto),
                CerrarSesion.here()
        );
    }
    public static AgregarProdcutoAppExito enElSitio(){
        return Instrumented.instanceOf(AgregarProdcutoAppExito.class).withProperties();
    }
}
