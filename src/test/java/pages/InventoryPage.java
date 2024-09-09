package pages;

import org.openqa.selenium.By;
import static utility.EsperaHelper.esperaVisibilidad;
import static utility.Hooks.driver;

public class InventoryPage {
    public static By titulo = By.xpath("//div[@class='app_logo']");
    public static By botonMenu = By.id("react-burger-menu-btn");

    public static boolean comprobarTitulo() {
        boolean existe = false;
        esperaVisibilidad(titulo, 10);
        try {
            existe = driver.findElement(titulo).isDisplayed();
        } catch (Exception e) {
        }
        return existe;
    }

    public static void clickMenu() {
        driver.findElement(botonMenu).click();
    }
}