public class Conta {
    String numero;
    double saldo;

    Conta(String numero, double valor) {
        this.numero = numero;
        this.saldo = valor;
    }

    void sacar(double valor) {
        saldo = saldo - valor;
    }

    void depositar(double valor) {
        saldo = saldo + valor;
    }

    double consultarSaldo() {
        return saldo;
    }

    void transferir(Conta destino, double valor) {
        this.sacar(valor);
        destino.depositar(valor);
    }

}
