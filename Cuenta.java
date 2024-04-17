// Clase Cuenta
class Cuenta {
    public String numero;
    public double saldo;
    public String tipo;
    public Cliente titular;

    public Cuenta(String numero, double saldoInicial, String tipo, Cliente titular) {
        this.numero = numero;
        this.saldo = saldoInicial;
        this.tipo = tipo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNumero() {
        return numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void consignar(double cantidad) {
        saldo += cantidad;
    }

    public boolean retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }
}