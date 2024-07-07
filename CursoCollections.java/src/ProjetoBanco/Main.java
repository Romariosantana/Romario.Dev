package ProjetoBanco;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Cliente Romario = new Cliente();
        Romario.setNome("Romario");

        Conta cc = new ContaCorrente(Romario);
        Conta poupanca = new ContaPoupanca(Romario);

        cc.depositar(250);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
