# language: es

Característica: Login

  @login
  Esquema del escenario: Se realiza login exitoso
    Dado un usuario que ingresa <usuario> y <contrasenia>
    Cuando el usuario hace click en el boton Login
    Y espera 5 segundos
    Entonces se valida que ingresa a la pagina principal

    Ejemplos:
      |     usuario             |   contrasenia   |
      | standard_user           | secret_sauce    |
      | locked_out_user         | secret_sauce    |
      | problem_user            | secret_sauce    |
      | performance_glitch_user | secret_sauce    |

  @login
  Escenario: Se realiza login con error
    Dado un usuario que ingresa locked_out_user y secret_sauce
    Cuando el usuario hace click en el boton Login
    Entonces se comprueba mensaje de login erroneo

  @login
  Escenario: Se realiza login con error
    Dado un usuario que ingresa standard_user y secret_sauce
    Cuando el usuario hace click en el boton Login
    Entonces se comprueba mensaje de login erroneo