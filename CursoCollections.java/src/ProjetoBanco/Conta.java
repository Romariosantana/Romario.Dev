package ProjetoBanco;

import java.util.Date;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1011;
    private static int SEQUENCIAL = 10110;

    protected int agencia;
    protected int conta;
    protected  double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }
    public void depositar(double valor) {
        saldo += valor;
    }
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }


    protected void imprimirInfosComuns() {
        System.out.println(String.format("Cliente: %s ", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d ", this.agencia));
        System.out.println(String.format("Conta: %d ", this.conta));
        System.out.println(String.format("Saldo: %.2f ", this.saldo));
    }
}
