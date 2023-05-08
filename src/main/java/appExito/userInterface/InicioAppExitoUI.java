package appExito.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class InicioAppExitoUI {

    public static final Target BTN_CELULARES = Target.the("boton de categoria celulares")
            .locatedBy("(//*[@resource-id='com.exito.appcompania:id/imageView_hall'])[2]");

    public static final Target BTN_ENVIO_DOMICILIO = Target.the("boton de envio domicilio")
            .locatedBy("//*[@resource-id='com.exito.appcompania:id/appCompatImageView_item_image']");

    public static final Target BTN_CONTINUAR = Target.the("caja seleccionar ciudad")
            .locatedBy("//*[@resource-id='com.exito.appcompania:id/appCompatButton_continue']");
    public static final Target BTN_MI_CUENTA = Target.the("boton mi cuenta")
            .locatedBy("//*[@text='Mi cuenta']");
    public static final Target BTN_CERRAR_SESION = Target.the("boton cerrar sesion")
            .locatedBy("//*[@text='Cerrar sesión']");
    public static final Target BTN_ACEPTAR_CERRAR_SESION = Target.the("boton aceptar")
            .locatedBy("//*[@text='Aceptar']");




}
