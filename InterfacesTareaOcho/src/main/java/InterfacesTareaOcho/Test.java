package InterfacesTareaOcho;
public class Test {
    public static void main (String[] arg){
        Alumno alumnoUno = new Alumno("7690-20-14225", "Merleen Guardado", 30);
        Alumno alumnoDos = new Alumno("7690-19-25465", "Jose Aregueta", 31);
        System.out.println("****Comparador de Edades****");
        if(alumnoUno.igualQue(alumnoDos)){
            System.out.println("alumnos tienen la misma edad.");
        }else{
            System.out.println("Alumnos No tienen la misma dedad.");
        }
        if(alumnoUno.menorQue(alumnoDos)){
            System.out.println("Merleen es menor que " + alumnoDos.Nombre+".");
        }else {
            System.out.println("Merleen no es menor que " + alumnoDos.Nombre+".");
        }
        if(alumnoUno.menorIgualQue(alumnoDos)){
            System.out.println("Merleen es mas joven o igual que " + alumnoDos.Nombre+".");

        }else{
            System.out.println("Merleen no es mas joven o igual que " + alumnoDos.Nombre+".");
        }
        Producto productoUno = new Producto(254,"Shampoo", 50.50);
        Producto productoDos = new Producto(255,"Jabon", 10.25);
        System.out.println("****Comparador de Precios****");
        if(productoUno.igualQue(productoDos)){
            System.out.println("los precios de los Productos son iguales.");
        }else {
            System.out.println("los precios de los Productos no son iguales.");
        }
        if (productoUno.mayorQue(productoDos)) {
            System.out.println("el precio del "+ productoUno.Nombre+ " es mas caro que "+ productoDos.Nombre);
        }else{
            System.out.println("el precio del "+ productoUno.Nombre+ " es no es mas caro que "+ productoDos.Nombre);
        }
        if(productoUno.mayorIgualQue(productoDos)){
            System.out.println("el precio del "+ productoUno.Nombre+" es mas caro o almenos igual que "+ productoDos.Nombre);
        }else{
            System.out.println("el precio del "+ productoUno.Nombre+" no es mas caro o almenos igual que "+ productoDos.Nombre);
        }
    }
}
