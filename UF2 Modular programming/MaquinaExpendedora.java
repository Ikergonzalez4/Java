import java.util.Scanner;

public class MaquinaExpendedora {
    static Scanner sc = new Scanner(System.in);

    static int ticket;
    static double cost = 0;
    static double finalCost = 0;
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }

    public static void opciones(){
        System.out.println("1. Billete sencillo");
        System.out.println("2. Tarjeta de 10 viajes");
        System.out.println("3. T-Casual");
        System.out.println("4. T-Familiar");
        System.out.println("5. T-Joven");
        ticket = sc.nextInt();
        if (ticket == 1){
            cost = 2.25;
        }else if (ticket == 2){
            cost = 10.00;
        } else if (ticket == 3){
            cost = 12.50;
        } else if (ticket == 4){
            cost = 90;
        } else if (ticket == 5){
            cost = 75;
        }
    }

    public static int entero() {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        while (!valido) {
            if (ticket >= 1 && ticket <= 5) {
                valido = true;
            } else {
                System.out.println("Número inválido, por favor intente de nuevo.");
                System.out.println("1. Billete sencillo");
                System.out.println("2. Tarjeta de 10 viajes");
                System.out.println("3. T-Casual");
                System.out.println("4. T-Familiar");
                System.out.println("5. T-Joven");
                ticket = sc.nextInt();
                if (ticket == 1){
                    cost = 2.25;
                }else if (ticket == 2){
                    cost = 10.00;
                } else if (ticket == 3){
                    cost = 12.50;
                } else if (ticket == 4){
                    cost = 90;
                } else if (ticket == 5){
                    cost = 75;
                }

            }
        }
        return ticket;
    }

    public static int checkZones() {
        int zonas;
        System.out.println("¿De cuantas zonas quieres comprar el billete? (1,2,3)");
        zonas = sc.nextInt();
        while(zonas < 1 || zonas > 3) {
            System.out.println("Número de zonas inválido, por favor intente de nuevo.");
            System.out.print("Introduce un número de zonas entre 1 y 3: ");
            zonas = sc.nextInt();
        }
        return zonas;
    }

    public static double calculo(int zonas){
        if (zonas == 1){
            finalCost = cost;
        }else if (zonas == 2){
            finalCost =  cost * 1.3;
        }else if(zonas == 3){
            finalCost =  cost * 1.5;
        }
        return cost;
    }

    public static void pay(double precioFinal) {
        Scanner sc = new Scanner(System.in);
        double paid;
        System.out.println("Introduce el dinero:");
        paid = sc.nextDouble();
        while(paid < precioFinal) {
            System.out.println("Dinero insuficiente, por favor introduzca una cantidad mayor o igual a: " + precioFinal);
            paid = sc.nextDouble();
        }
        double change = paid - precioFinal;
        System.out.println("El cambio es: " + change);

        double[] notes = {500, 200, 100, 50, 20, 10};
        double[] coins = {5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};

        for (double note : notes) {
            if (change >= note) {
                int count = (int) (change / note);
                change = change - (count * note);
                System.out.println(count + " billete(s) de " + note);
            }
        }
        for (double coin : coins) {
            if (change >= coin) {
                int count = (int) (change / coin);
                change = change - (count * coin);
                System.out.println(count + " moneda(s) de " + coin + " euros");
            }
        }
    }

    public static void menu(){
        opciones();
        ticket = entero();
        int zones = checkZones();
        calculo(checkZones());
        System.out.println("El precio del billete es: " + finalCost);
        pay(finalCost);
    }
}