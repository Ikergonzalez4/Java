package Primero;

public class Coche {

    //Atributos
    String color;
    String marca;
    int km;

    //Metodo
    public static void main(String [] args){
      Coche coche1 = new Coche();

      coche1.color = "Rojo";
      coche1.marca = "Ferrari";
      coche1.km = 0;

        System.out.println("El color del coche1 es: " + coche1.color);
        System.out.println("La marca del coche1 es: " + coche1.marca);
        System.out.println("El kilometraje del coche1 es: " + coche1.km);

        Coche coche2 = new Coche();

        coche2.color = "Azul";
        coche2.marca = "Fiat";
        coche2.km = 100;

        System.out.println("El color del coche2 es: " + coche2.color);
        System.out.println("La marca del coche2 es: " + coche2.marca);
        System.out.println("El kilometraje del coche2 es: " + coche2.km);

    }
}
