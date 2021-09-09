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
            Alumno a = (Alumno) q;
            return this.edad == a.edad;
        }
        public boolean menorQue(Object q) {
            Alumno a = (Alumno) q;
            return this.edad < a.edad;
        }
        public boolean menorIgualQue(Object q) {
            Alumno a = (Alumno) q;
            return this.edad <= a.edad;
        }
        public boolean mayorQue(Object q) {
            Alumno a = (Alumno) q;
            return this.edad > a.edad;
        }
        public boolean mayorIgualQue(Object q) {
            Alumno a = (Alumno) q;
            return this.edad >= a.edad;
        }
    }

