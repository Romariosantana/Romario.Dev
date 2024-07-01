package JavaList.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
//Atributos.

    private String nome;

    private int idade;

    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    } //método para fazer a ordenação da idade.

    //cria os métodos Getts para ter acesso aos atributos, pois estão privados.
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }
    //cria o ToString para poder visualizar no console a idade, altura etc.;
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }

}

class ComparatorPoraltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }

}
