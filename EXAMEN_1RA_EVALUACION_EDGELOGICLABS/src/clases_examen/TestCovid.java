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
public class TestCovid {

    private int edad;
    private boolean enfermo;
    private double peso;
    private double estatura;

    //Metodos SET y GET
    public void setEdad(int num) {
        edad = num;
    }

    public int getEdad() {
        return edad;
    }

    public void setEnfermo(boolean sick) {
        enfermo = sick;
    }

    public String getEnfermo() {
        if (enfermo == true) {
            return "Si";
        } else {
            return "No";
        }

    }

    public void setPeso(double num) {
        peso = num;
    }

    public double getPeso() {
        return peso;
    }

    public void setEstatura(double num) {
        estatura = num;
    }

    public double getEstatura() {
        return estatura;
    }

    public void imprimirDatos() {
        System.out.println("Edad: " + getEdad());
        System.out.println("Tiene enfermedad crinica? " + getEnfermo());
        System.out.println("Peso: " + getPeso());
        System.out.println("Estatura: " + getEstatura());
        System.out.println("IMC: " + calcularIMC());
        System.out.println(calcularPersonaRiesgo());
    }

    private double calcularIMC() {
        return getPeso() / (Math.pow(getEstatura(), 2));
    }

    private String calcularPersonaRiesgo() {

        int riesgo = 0;
        if (edad >= 65) {
            riesgo++;
        }
        if (enfermo == true) {
            riesgo++;
        }
        if (calcularIMC() > 30) {
            riesgo++;
        }
        switch (riesgo) {
            case 1:
                return "Persona de Riesgo Bajo";

            case 2:
                return "Persona de Riesgo Medio";

            case 3:
                return "Persona de Riesgo Alto";

            default:
                return "Persona sin Riesgo";
        }

    }
}
