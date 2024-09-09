package stepDefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.Assert;
import pages.LoginPage;

import static java.lang.Thread.sleep;

public class LoginSteps {

    @Dado("^un usuario que ingresa (.*) y (.*)$")
    public void unUsuarioQueIngresaUsuarioYContrasenia(String usuario, String contrasenia){
        LoginPage.ingresarUsuario(usuario);
        LoginPage.ingresarPassword(contrasenia);
    }

    @Cuando("el usuario hace click en el boton Login")
    public void elUsuarioHaceClickEnElBotonLogin() {
        LoginPage.clickLogin();
    }

    @Y("espera {int} segundos")
    public void esperaSegundos(int segundos) throws InterruptedException {
        sleep(segundos * 1000L);
    }

    @Entonces("se comprueba mensaje de login erroneo")
    public void seCompruebaMensajeDeLoginErroneo() {
        Assert.assertTrue("No se visualiza Error Login", LoginPage.comprobarErrorLogin());
    }
}
