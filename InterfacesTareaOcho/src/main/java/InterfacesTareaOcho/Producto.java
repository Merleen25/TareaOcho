package InterfacesTareaOcho;

public class Producto implements Comparador {
    int noProducto;
    String Nombre;
    double precio;

    public Producto(int noProducto, String nombre, double precio) {
        this.noProducto = noProducto;
        Nombre = nombre;
        this.precio = precio;
    }

    public boolean igualQue(Object q) {
        Producto a = (Producto) q;
        return this.precio == a.precio;
    }

    public boolean menorQue(Object q) {
        Producto a = (Producto) q;
        return this.precio < a.precio;
    }
    public boolean menorIgualQue(Object q) {
        Producto a = (Producto) q;
        return this.precio <= a.precio;
    }
    public boolean mayorQue(Object q) {
        Producto a = (Producto) q;
        return this.precio > a.precio;
    }

    public boolean mayorIgualQue(Object q) {
        Producto a = (Producto) q;
        return this.precio >= a.precio;
    }
}
