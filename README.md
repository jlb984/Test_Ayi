# Test_Ayi

Automatización de casos de prueba para front-end usando **Selenium**, **Java** y **Cucumber**.

## Descripción

Este proyecto tiene como objetivo automatizar pruebas para aplicaciones web front-end utilizando **Selenium** como herramienta de automatización, **Java** como lenguaje de programación y **Cucumber** para la definición de escenarios de prueba. El proyecto sigue el **Patrón Page Object Model (POM)** para organizar el código de manera estructurada y modular, facilitando el mantenimiento y la escalabilidad.
Se utiliza la pagina de demo [Swag Labs (saucedemo.com)](https://www.saucedemo.com/v1/)

## Requisitos previos

- **Java 8 o superior** instalado.
- **Maven** instalado.
- **IntelliJ IDEA** (u otro IDE compatible con Java).
- Repositorio de código fuente en Git: [Test_Ayi](https://github.com/jlb984/Test_Ayi.git).

## Clonar el repositorio

Para clonar este proyecto, ejecuta el siguiente comando en tu terminal:

```bash
git clone https://github.com/jlb984/Test_Ayi.git
```

## Abrir el proyecto en IntelliJ IDEA

1. Abre IntelliJ IDEA.
2. Selecciona la opción **Open** y navega hasta el directorio donde has clonado el repositorio.
3. Asegúrate de que el proyecto utiliza un **SDK** de Java 8 o superior.
4. IntelliJ debería reconocer automáticamente el proyecto como un proyecto **Maven**. Si no es así, selecciona el archivo `pom.xml` en la raíz del proyecto y elige la opción **Add as Maven Project**.

## Ejecutar los tests

1. En IntelliJ, navega hasta la clase `runner.TestRunner` dentro del paquete `runner`.
2. Haz clic derecho sobre la clase `TestRunner` y selecciona **Run 'TestRunner'**.
3. IntelliJ ejecutará los tests utilizando **JUnit** como framework de ejecución.

**Nota** editando la linea 'tags' en el archivo TestRunner se puede seleccionar los escenarios a ejecutar

## Estructura del Proyecto

- **src/test/java**:
    - **pages**: Contiene las clases del Page Object Model (POM), que representan las páginas de la aplicación web y sus elementos.
    - **stepDefinition**: Contiene las clases de definición de pasos que enlazan los escenarios de Cucumber con el código de prueba de Selenium.

- **src/test/resources**: Contiene los archivos de características (**feature**) de Cucumber.
- **pom.xml**: Archivo de configuración de Maven que contiene las dependencias del proyecto.
