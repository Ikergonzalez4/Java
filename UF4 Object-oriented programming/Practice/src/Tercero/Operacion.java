package Tercero;

import javax.swing.*;

public class Operacion {

    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Metodo para pedirle al usuario qeu nos de los numeros
    public void pedirNumeros(){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));
    }

    //Metodo para sumar los numeros
    public void sumar(int numero1, int numero2){
        suma = numero1 + numero2;
    }
    //Metodo para restar los numeros
    public void restar(int numero1, int numero2){
        resta = numero1 - numero2;
    }
    //Metodo para multiplicar los numeros
    public void multiplicar(int numero1, int numero2){
        multiplicacion = numero1 * numero2;
    }
    //Metodo para dividir los numeros
    public void dividir(int numero1, int numero2){
        division = numero1 / numero2;
    }
    //Metodo para mostrar resultados
    public void mostrarResultados(){
        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La resta de los numeros es: " + resta);
        System.out.println("La multiplicacion de los numeros es: " + multiplicacion);
        System.out.println("La division de los numeros es: " + division);
    }

}

