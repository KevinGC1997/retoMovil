package appExito.stepDefinitions;

import appExito.driverAppExito.AppiumAndroidDriver;
import appExito.models.AppExitoInicio;
import appExito.tasks.AgregarProdcutoAppExito;
import appExito.tasks.InicioSesionAppExito;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.io.IOException;
import java.util.List;

public class agregarProductoAppExitoStepDefinition {

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^que brandon abre exitosamente la app$")
    public void queBrandonAbreExitosamenteLaApp() throws IOException {
        OnStage.theActorCalled("Kevin").can(BrowseTheWeb.with((AppiumAndroidDriver.appium().on())));
    }

    @When("^inicia sesion en la app$")
    public void iniciaSesionEnLaApp(List<AppExitoInicio> appExito) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                InicioSesionAppExito.enElSitio(appExito.get(0).getCorreo(),appExito.get(0).getContrasena()),
                AgregarProdcutoAppExito.enElSitio());

}

    @Then("^valida que el producto se agrego correctamente$")
    public void validaQueElProductoSeAgregoCorrectamente() {

    }
}
