package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static utility.Hooks.driver;

public class EsperaHelper {
    /**
     * Espera a que el elemento este  visible
     * @param elemento
     * @param segundos
     */
    public static void esperaVisibilidad(By elemento, long segundos) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(segundos));
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
    }
}