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

    @Override
    public boolean igualQue(Object q) {
        return false;
    }

    @Override
    public boolean menorQue(Object q) {
        return false;
    }

    @Override
    public boolean menorIgualQue(Object q) {
        return false;
    }

    @Override
    public boolean mayorQue(Object q) {
        return false;
    }

    @Override
    public boolean mayorIgualQue(Object q) {
        return false;
    }
    }
