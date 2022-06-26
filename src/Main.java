public class Main {
    public static void main(String[] args) {
        /*
            Usuario: FrankMorro
            Crea una clase Persona con las siguientes variables:
            La edad
            El nombre
            El teléfono

            Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
            Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
            Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.

         */

        Cliente cliente = new Cliente();
        cliente.setNombre("Juan Acosta");
        cliente.setEdad(35);
        cliente.setTelefono("555-5555");
        cliente.setCredito(500000.00);

        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad() + " años");
        System.out.println("Teléfono: " + cliente.getTelefono());
        System.out.println("Crédito Máximo: " + cliente.getCredito() + " EUR");

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Johnny Martinez");
        trabajador.setEdad(40);
        trabajador.setTelefono("999-9999");
        trabajador.setSalario(150000);

        System.out.println("--- **** ---");
        System.out.println("Nombre Trabajador: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad() + " años");
        System.out.println("Teléfono: " + trabajador.getTelefono());
        System.out.println("Salario Anual: " + trabajador.getSalario() + " EUR/AÑO");

    }
}
class Persona{
    private int edad;
    private String nombre;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

class Cliente extends Persona {
    private double credito;

    public double getCredito() {
        return this.credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    private double salario;

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}