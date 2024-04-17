import java.util.Scanner;
public class OperacionesBanco {
    public Banco banco;
    public Scanner scanner;

    public OperacionesBanco(Banco banco) {
        this.banco = banco;
        this.scanner = new Scanner(System.in);
    }

    public void menuOpciones() {
        System.out.println("Bienvenido al Banco " + banco.getNombre());
        System.out.println("Seleccione una opción:");
        System.out.println("1. Crear una cuenta");
        System.out.println("2. Consultar total de dinero en el banco");
        System.out.println("3. Salir");
    }

    public void crearCuenta() {
        System.out.println("Ingrese los datos para crear una nueva cuenta:");
        System.out.print("Número de cuenta: ");
        String numero = scanner.nextLine();
        System.out.print("Saldo inicial: ");
        double saldoInicial = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea pendiente
        System.out.print("Tipo de cuenta: ");
        String tipo = scanner.nextLine();
        System.out.print("Cédula del titular: ");
        String cedulaTitular = scanner.nextLine();
        System.out.print("Nombre del titular: ");
        String nombreTitular = scanner.nextLine();

        if (banco.adicionarCuenta(numero, saldoInicial, tipo, cedulaTitular, nombreTitular)) {
            System.out.println("¡Cuenta creada exitosamente!");
        } else {
            System.out.println("Error al crear la cuenta. Por favor, verifique los datos e intente de nuevo.");
        }
    }

    public void consultarTotal() {
        System.out.println("El total de dinero en el banco es: " + banco.consultarTotalDinero());
    }
}