
public class MainImprimir {
public static void main(String[] args) {
    // Crear un objeto Banco
    Banco banco = new Banco("Mi Banco");

    // Crear algunas cuentas
    banco.adicionarCuenta("1234", 5000.0, "Ahorros", "123456789", "Juan Pérez");
    banco.adicionarCuenta("5678", 10000.0, "Corriente", "987654321", "María Gómez");
    banco.adicionarCuenta("9012", 2500.0, "Ahorros", "456789123", "Carlos Rodríguez");

    // Buscar una cuenta y realizar operaciones
    Cuenta cuenta1 = banco.buscarCuenta("1234");
    if (cuenta1 != null) {
        System.out.println("Cuenta encontrada: " + cuenta1.getNumero());
        System.out.println("Titular: " + cuenta1.getTitular().getNombre());
        System.out.println("Saldo actual: " + cuenta1.getSaldo());

        cuenta1.consignar(1000.0);
        System.out.println("Nuevo saldo después de consignar $1000: " + cuenta1.getSaldo());

        boolean operacionExitosa = cuenta1.retirar(7000.0);
        if (operacionExitosa) {
            System.out.println("Retiro exitoso. Nuevo saldo: " + cuenta1.getSaldo());
        } else {
            System.out.println("Saldo insuficiente para retirar.");
        }
    } else {
        System.out.println("Cuenta no encontrada");
    }

    // Consultar el total de dinero en el banco
    double totalDinero = banco.consultarTotalDinero();
    System.out.println("Total de dinero en el banco: $" + totalDinero);

    // Consultar el cliente con el mayor saldo
    String clienteMayorSaldo = banco.consultarClienteMayorSaldo();
    System.out.println("Cliente con el mayor saldo: " + clienteMayorSaldo);


    // Y asi poedemos realizar con las demas cuentas para consultarlas 
    //......
}
}