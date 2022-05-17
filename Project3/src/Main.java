public class Main {
    public static void main (String[] args) {
        Persona persona = new Persona();

        persona.setEdad(31);
        persona.setNombre("Esteban");
        persona.setTelefono("0984530162");

        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.print(persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad ( ) {
        return this.edad;
    }

    public void setEdad (int edad) {
        this.edad = edad;
    }

    public String getNombre ( ) {
        return this.nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono ( ) {
        return this.telefono;
    }

    public void setTelefono (String telefono) {
        this.telefono = telefono;
    }
}
