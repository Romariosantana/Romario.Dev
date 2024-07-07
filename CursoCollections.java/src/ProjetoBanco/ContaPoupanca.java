package ProjetoBanco;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        super.imprimirInfosComuns();
    }
}
