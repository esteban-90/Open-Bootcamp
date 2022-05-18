public class Main {
    public static void main (String[] args) {
        Cliente cliente = new Cliente();

        cliente.setEdad(20);
        cliente.setNombre("Cliente");
        cliente.setTeléfono("123456");
        cliente.setCrédito(500.45f);

        System.out.println(cliente.getEdad());
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTeléfono());
        System.out.println(cliente.getCrédito());

        Trabajador trabajador = new Trabajador();

        trabajador.setEdad(25);
        trabajador.setNombre("Trabajador");
        trabajador.setTeléfono("654321");
        trabajador.setSalario(300.70f);

        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getTeléfono());
        System.out.println(trabajador.getSalario());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private String teléfono;

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

    public String getTeléfono ( ) {
        return this.teléfono;
    }

    public void setTeléfono (String teléfono) {
        this.teléfono = teléfono;
    }
}

class Cliente extends Persona {
    private float crédito;

    public float getCrédito ( ) {
        return this.crédito;
    }

    public void setCrédito (float crédito) {
        this.crédito = crédito;
    }
}

class Trabajador extends Persona {
    private float salario;

    public float getSalario ( ) {
        return this.salario;
    }

    public void setSalario (float salario) {
        this.salario = salario;
    }
}
