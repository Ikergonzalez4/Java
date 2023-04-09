import java.util.Scanner;

public class TiendaElectronicaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TiendaElectronica tienda = new TiendaElectronica();

        int opcion;
        do {
            System.out.println("1. Agregar producto");
            System.out.println("2. Buscar producto");
            System.out.println("3. Actualizar precio");
            System.out.println("4. Actualizar stock");
            System.out.println("5. Mostrar catálogo");
            System.out.println("6. Salir");
            System.out.print("Ingrese opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del producto: ");
                    String nombre = scanner.next();
                    System.out.print("Ingrese marca del producto: ");
                    String marca = scanner.next();
                    System.out.print("Ingrese precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Ingrese stock del producto: ");
                    int stock = scanner.nextInt();
                    tienda.agregarProducto(new ProductoElectronico(nombre, marca, precio, stock));
                    break;
                case 2:
                    System.out.print("Ingrese nombre del producto: ");
                    nombre = scanner.next();
                    System.out.print("Ingrese marca del producto: ");
                    marca = scanner.next();
                    int indice = tienda.buscarProducto(nombre, marca);
                    if (indice != -1) {
                        System.out.println("El producto se encuentra en el índice " + indice);
                    } else {
                        System.out.println("No se encontró el producto");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese nombre del producto: ");
                    nombre = scanner.next();
                    System.out.print("Ingrese marca del producto: ");
                    marca = scanner.next();
                    System.out.print("Ingrese nuevo precio del producto: ");
                    precio = scanner.nextDouble();
                    tienda.actualizarPrecio(nombre, marca, precio);
                    break;
                case 4:
                    System.out.print("Ingrese nombre del producto: ");
                    nombre = scanner.next();
                    System.out.print("Ingrese marca del producto: ");
                    marca = scanner.next();
                    System.out.print("Ingrese nuevo stock del producto: ");
                    stock = scanner.nextInt();
                    tienda.actualizarStock(nombre, marca, stock);
                    break;
                case 5:
                    tienda.imprimirCatalogo();
                    break;
                case 6:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 6);
    }
}

