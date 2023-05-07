package appExito.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class InicioSesionAppExitoUI {

    public static final Target BTN_INGRESAR = Target.the("BOTON PARA INGRESAR A INICIO")
            .locatedBy("//*[@resource-id='com.exito.appcompania:id/AppCompatButton_ingresar']");

    public static final Target LBL_CORREO_ELECTRONICO = Target.the("caja para ingresa correo")
            .locatedBy("//*[@resource-id='com.exito.appcompania:id/TextInputEditText_email']");

    public static final Target LBL_CONTRASENA = Target.the("caja para contraseña")
            .locatedBy("//*[contains(@text, 'Contraseña')]");
}
