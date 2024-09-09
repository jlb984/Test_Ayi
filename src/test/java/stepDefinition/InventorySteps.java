package stepDefinition;

import io.cucumber.java.es.Entonces;
import org.junit.Assert;
import pages.InventoryPage;

public class InventorySteps {

    @Entonces("se valida que ingresa a la pagina principal")
    public void seValidaQueIngresaALaPaginaPrincipal() {
        Assert.assertTrue( "No se visualiza el Titulo de la pagina Principal", InventoryPage.comprobarTitulo());
    }
}