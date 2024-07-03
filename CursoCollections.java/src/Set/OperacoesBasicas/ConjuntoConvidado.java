package Set.OperacoesBasicas;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    //Atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }
    //Adicionando métodos
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidaoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidado() {
        return convidadoSet.size();
    }

    public void exibirConvidado() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidados = new ConjuntoConvidado();

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

        conjuntoConvidados.exibirConvidado();

        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidados dentro do Set de convidados");

        conjuntoConvidados.removerConvidaoPorCodigoConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidado() + " convidados dentro do Set de convidados");

        conjuntoConvidados.exibirConvidado();






    }
}
