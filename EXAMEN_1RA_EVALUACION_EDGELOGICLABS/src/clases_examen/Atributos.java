/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_examen;

/**
 *
 * @author Elias
 */
public class Atributos {

    private int A1;
    private int A2;
    private int N;

    public Atributos(int a1, int a2, int n) {
        A1 = a1;
        A2 = a2;
        N = n;
    }

    public Atributos() {
        A1 = 1;
        A2 = 1;
        N = 6;

    }

    public void setA1(int a1) {
        A1 = a1;
    }

    public int getA1() {
        return A1;
    }

    public void setA2(int a2) {
        A2 = a2;
    }

    public int getA2() {
        return A2;
    }

    public void setN(int n) {
        N = n;
    }

    public int getN() {
        return N;
    }

    public void Suma() {
        System.out.print("Fibonacci Series of " + N + " numbers:");
        for (int i = 1; i <= N; ++i) {
            System.out.print(A1 + " ");
            int sum = A1 + A2;
            A1 = A2;
            A2 = sum;
        }
    }
}
