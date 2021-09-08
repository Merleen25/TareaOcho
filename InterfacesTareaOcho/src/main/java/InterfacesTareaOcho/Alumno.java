package InterfacesTareaOcho;
    public class Alumno implements Comparador{
        String carnet;
        String Nombre;
        int edad;

        public Alumno(String carnet, String nombre, int edad) {
            this.carnet = carnet;
            Nombre = nombre;
            this.edad = edad;
        }
        public boolean igualQue(Object q) {

            return false;
        }
        public boolean menorQue(Object q) {
            return false;
        }
        public boolean menorIgualQue(Object q) {
            return false;
        }
        public boolean mayorQue(Object q) {
            return false;
        }
        public boolean mayorIgualQue(Object q) {
            return false;
        }
    }

