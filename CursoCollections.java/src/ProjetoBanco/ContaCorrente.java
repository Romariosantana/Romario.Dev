package ProjetoBanco;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {

    }

    public void imprimirExtrato() {
        System.out.println("=== Banco MarioBank ===");
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

}
