// Clase Banco
import java.util.ArrayList;
import java.util.List;

public class Banco {
    public String nombre;
    public List<Cuenta> cuentas;

    public Banco(String nombre) {
        this.nombre = nombre;
        this.cuentas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public boolean adicionarCuenta(String numero, double saldoInicial, String tipo, String cedulaTitular, String nombreTitular) {
        Cliente titular = new Cliente(cedulaTitular, nombreTitular);
        Cuenta cuenta = new Cuenta(numero, saldoInicial, tipo, titular);
        return cuentas.add(cuenta);
    }

    public Cuenta buscarCuenta(String numero) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero().equals(numero)) {
                return cuenta;
            }
        }
        return null;
    }

    public double consultarTotalDinero() {
        double total = 0;
        for (Cuenta cuenta : cuentas) {
            total += cuenta.getSaldo();
        }
        return total;
    }

    public String consultarClienteMayorSaldo() {
        double maxSaldo = Double.MIN_VALUE;
        Cliente clienteMayorSaldo = null;
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getSaldo() > maxSaldo) {
                maxSaldo = cuenta.getSaldo();
                clienteMayorSaldo = cuenta.getTitular();
            }
        }
        if (clienteMayorSaldo != null) {
            return clienteMayorSaldo.getNombre();
        } else {
            return "No hay clientes con cuentas en el banco.";
        }
    }
}