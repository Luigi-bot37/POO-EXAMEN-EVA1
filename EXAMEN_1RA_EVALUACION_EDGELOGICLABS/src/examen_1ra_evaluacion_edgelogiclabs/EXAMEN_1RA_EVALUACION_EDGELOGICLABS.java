/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_1ra_evaluacion_edgelogiclabs;

import clases_examen.Atributos;
import clases_examen.CuentaBancaria;
import clases_examen.DatosIntegrantes;
import clases_examen.Password;
import clases_examen.TestCovid;
import java.util.Scanner;

/**
 *
 * @author Luis Mancera
 */
public class EXAMEN_1RA_EVALUACION_EDGELOGICLABS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DatosIntegrantes.imprimirDatosEquipo();
        DatosIntegrantes.imprimirProblemasResueltos();
        System.out.println("-------------------------");
        // Crear una instancia de la clase Password
        Password password = new Password("usuario", 1);
        Password pas = new Password("manolo", 24);
        // Ejemplo de uso: establecer nuevos valores para usuario y contraseña
        password.setUsuario("manolo");
        password.setContrasena(24);

        // Imprimir los valores usando los métodos get
        password.ComprobadorDeContrasena("manolo", 24);
        System.out.println("------------------------");
        TestCovid paciente = new TestCovid();
        paciente.setEdad(70);
        paciente.setEnfermo(true);
        paciente.setEstatura(1.90);
        paciente.setPeso(100);
        paciente.imprimirDatos();
        //Cuenta Bancaria

        System.out.println("------------------------");
        Scanner captura = new Scanner(System.in);
        CuentaBancaria cliente1 = new CuentaBancaria();
        cliente1.imprimirDatos();
        CuentaBancaria cliente2 = new CuentaBancaria("Luis", 12345, 80);
        cliente2.imprimirDatos();
        System.out.println("Cuanto desea depositar?");
        cliente2.depositarCuenta(captura.nextDouble());
        cliente2.imprimirDatos();
        System.out.println("Cuanto desea retirar?");
        cliente2.retirarDeCuenta(captura.nextDouble());
        cliente2.imprimirDatos();
        System.out.println("------------------------");
        Atributos ATRI = new Atributos();
        Atributos as = new Atributos(1, 1, 6);
        ATRI.setA1(2);
        ATRI.setA2(5);
        ATRI.setN(6);
        ATRI.Suma();
    }

}
