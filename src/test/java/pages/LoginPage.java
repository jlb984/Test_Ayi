package pages;

import org.openqa.selenium.By;
import static utility.EsperaHelper.esperaVisibilidad;
import static utility.Hooks.driver;

public class LoginPage {
    public static By campoUserName = By.id("user-name");
    public static By campoPassword = By.id("password");
    public static By botonLogin = By.id("login-button");
    public static By botonErrorLogin = By.xpath("//button[@class='error-button']");

    public static void ingresarUsuario(String usuario) {
        esperaVisibilidad(campoUserName, 10);
        driver.findElement(campoUserName).sendKeys(usuario);
    }

    public static void ingresarPassword(String password) {
        esperaVisibilidad(campoPassword, 10);
        driver.findElement(campoPassword).sendKeys(password);
    }

    public static void clickLogin() {
        esperaVisibilidad(botonLogin, 10);
        driver.findElement(botonLogin).click();
    }

    public static boolean comprobarErrorLogin() {
        boolean existe = false;
        esperaVisibilidad(botonErrorLogin, 10);

        try {
            existe = driver.findElement(botonErrorLogin).isDisplayed();
        } catch (Exception e) {
        }
        return existe;
    }
}