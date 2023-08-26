package appExito.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class ProductosCelulares {

    public static final Target BTN_AGREGAR = Target.the("boton agregar producto")
            .locatedBy("(//*[@resource-id='com.exito.appcompania:id/constraitLayout_add_item'])[1]");
    public static final Target TXT_PRODUCTO = Target.the("texto en categoria")
            .locatedBy("(//*[@resource-id='com.exito.appcompania:id/appCompatTextView_product_title'])[1]");
    public static final Target BTN_CARRITO = Target.the("boton a carrito")
            .locatedBy("//*[@resource-id='com.exito.appcompania:id/appCompatImageView_shopping_cart']");
    public static final Target TXT_PRODUCTO_CARRITO = Target.the("texto de producto agregado")
                .locatedBy("//*[contains(@text, 'Celular Xiaomi Redmi Note 12S 256Gb / 8Ram / 108Mp Gris')]");
    public static final Target BTN_RETROCEDER = Target.the("boton para volver")
            .locatedBy("//*[@resource-id='com.exito.appcompania:id/MaterialButton_cart_goBack']");
}
