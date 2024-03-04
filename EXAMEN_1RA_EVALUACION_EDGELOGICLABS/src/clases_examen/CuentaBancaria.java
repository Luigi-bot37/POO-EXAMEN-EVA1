/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_examen;

/**
 *
 * @author Luis Mancera
 */
public class CuentaBancaria {

    private int numCuenta;
    private String nomCliente;
    private double saldo;

    public CuentaBancaria() {
        numCuenta = 0;
        nomCliente = "";
        saldo = 0;
    }

    public CuentaBancaria(String nombre, int num, double money) {
        numCuenta = num;
        nomCliente = nombre;
        saldo = money;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int num) {
        numCuenta = num;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nombre) {
        nomCliente = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositarCuenta(double num) {
        saldo += num;
        System.out.println("Has depositado: $" + num);
    }

    public void retirarDeCuenta(double num) {
        System.out.println("Cuanto desea retirar? ");
        if (num <= saldo) {
            saldo -= num;
            System.out.println("Realizaste un retiro exitoso de: $" + num);
        } else {
            System.out.println("Saldo Insuficiente, solo tienes: $" + saldo);
        }
    }

    public void imprimirDatos() {
        System.out.println("Nombre del cliente: " + getNomCliente());
        System.out.println("Numero de cuenta: " + getNumCuenta());
        System.out.println("Saldo actual: $" + getSaldo());
    }
}
