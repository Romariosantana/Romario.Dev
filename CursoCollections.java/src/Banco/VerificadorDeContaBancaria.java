package Banco;

import java.util.Scanner;
public class VerificadorDeContaBancaria {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o número da conta bancária: ");
            String numeroConta = scanner.nextLine();

            try {
                if (numeroConta.length() == 8) {
                    System.out.println("Número de conta válido.");
                } else {
                    throw new IllegalArgumentException("Erro: Número de conta inválido. Digite exatamente 8 dígitos.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
    }

}
