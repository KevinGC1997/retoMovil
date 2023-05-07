package appExito.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class InicioAppExitoUI {

    public static final Target BTN_CELULARES = Target.the("boton de categoria celulares")
            .locatedBy("(//*[@resource-id='com.exito.appcompania:id/imageView_hall'])[2]");

    public static final Target BTN_COMPRA_RECOGE = Target.the("boton de compra y recoge")
            .locatedBy("//*[@resource-id='com.exito.appcompania:id/appCompatImageView_buy_and_collect']");

    public static final Target BTN_SELECCIONE_CIUDAD = Target.the("caja seleccionar ciudad")
            .locatedBy("//*[@resource-id='com.exito.appcompania:id/filled_exposed_dropdown_city']");

    public static final Target BTN_CIUDAD = Target.the("escoger ciudad")
            .locatedBy("//*[contains(@text, 'Cali')]");


}
