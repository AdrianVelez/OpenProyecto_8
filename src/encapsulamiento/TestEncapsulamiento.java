package encapsulamiento;

public class TestEncapsulamiento {

    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setNombre("Adrian Velez");
        System.out.println("nombre: " + persona.getNombre());

        persona.setEdad(27);
        System.out.println("Edad: "+ persona.getEdad());

        persona.setTelefono("1234567890");
        System.out.println("Telefono: "+ persona.getTelefono());
    }



}
