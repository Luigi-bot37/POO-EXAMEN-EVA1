/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_examen;

/**
 *
 * @author leo, eduardo
 */
public class Password {

    private String usuario;
    private int contrasena;

    // Constructor
    public Password(String user, int contra) {
        usuario = user;
        contrasena = contra;
    }

    public Password() {
        usuario = "manolo";
        contrasena = 24;
    }

    // Método set para el atributo usuario
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    // Método set para el atributo contrasena
    public void setContrasena(int contrasena) {
        this.contrasena = contrasena;
    }

    public void ComprobadorDeContrasena(String u, int c) {
        if (usuario == u) {
            System.out.println("El usuario es correcto");
        } else if (usuario != u) {
            System.out.println("El usuario no es correcto");
        }
        if (contrasena == c) {
            System.out.println("La contrasena es correcto");
        } else if (contrasena != c) {
            System.out.println("La contrasena no es correcta");
        }
    }
}
