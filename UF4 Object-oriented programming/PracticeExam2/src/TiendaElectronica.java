import java.util.Arrays;

public class TiendaElectronica {
    private ProductoElectronico[] catalogo;

    public TiendaElectronica() {
        catalogo = new ProductoElectronico[0];
    }

    public void agregarProducto(ProductoElectronico producto) {
        catalogo = Arrays.copyOf(catalogo, catalogo.length + 1);
        catalogo[catalogo.length - 1] = producto;
    }

    public int buscarProducto(String nombre, String marca) {
        for (int i = 0; i < catalogo.length; i++) {
            if (catalogo[i].getNombre().equals(nombre) && catalogo[i].getMarca().equals(marca)) {
                return i;
            }
        }
        return -1;
    }

    public void actualizarPrecio(String nombre, String marca, double nuevoPrecio) {
        int indice = buscarProducto(nombre, marca);
        if (indice != -1) {
            catalogo[indice].setPrecio(nuevoPrecio);
        } else {
            System.out.println("No se encontró el producto");
        }
    }

    public void actualizarStock(String nombre, String marca, int nuevoStock) {
        int indice = buscarProducto(nombre, marca);
        if (indice != -1) {
            catalogo[indice].setStock(nuevoStock);
        } else {
            System.out.println("No se encontró el producto");
        }
    }

    public void imprimirCatalogo() {
        for (ProductoElectronico producto : catalogo) {
            System.out.println(producto);
        }
    }
}
