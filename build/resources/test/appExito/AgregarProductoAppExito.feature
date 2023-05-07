Feature: agragar producto a carrito y validar que se agrego

  Scenario Outline: Brandon ingresa y agrega un producto en app exito
    Given que brandon abre exitosamente la app
    When inicia sesion en la app
      | correo   | contrasena   |
      | <correo> | <contrasena> |
    Then valida que el producto se agrego correctamente
    Examples:
      | correo                  | contrasena |
      | kevin.guerrero@sqasa.co | Prueba1234  |