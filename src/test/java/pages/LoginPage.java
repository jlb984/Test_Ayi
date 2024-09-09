package pages;

import org.openqa.selenium.By;
import static utility.Hooks.driver;

public class LoginPage {
    public static By campoUserName = By.id("user-name");
    public static By campoPassword = By.id("password");
    public static By botonLogin = By.id("login-button");
    public static By botonErrorLogin = By.xpath("//button[@class='error-button']");

    public static void ingresarUsuario(String usuario) {
        driver.findElement(campoUserName).sendKeys(usuario);
    }

    public static void ingresarPassword(String password) {
        driver.findElement(campoPassword).sendKeys(password);
    }

    public static void clickLogin() {
        driver.findElement(botonLogin).click();
    }

    public static boolean comprobarErrorLogin() {
        boolean existe = false;

        try {
            existe = driver.findElement(botonErrorLogin).isDisplayed();
        } catch (Exception e) {
        }
        return existe;
    }
}