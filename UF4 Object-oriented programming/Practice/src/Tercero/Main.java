package Tercero;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));

        Operacion operacion1 = new Operacion();

        operacion1.sumar(numero1, numero2);
        operacion1.restar(numero1, numero2);
        operacion1.multiplicar(numero1, numero2);
        operacion1.dividir(numero1, numero2);

        operacion1.mostrarResultados();
    }
}
