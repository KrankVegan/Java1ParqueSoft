package b3;


public class FuncionesOMetodos {

    public static void main(String[] args) {
        Persona persona = new Persona();
       //metodo o funcion de instancia
        persona.respirar();

        Estudiante.respirar();

        pintar();

    }

    public static void pintar(){
        System.out.println("pintar");
    }
}
