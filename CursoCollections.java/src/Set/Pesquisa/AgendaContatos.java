package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //Atributos
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
        //método implementado.
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    } //método aadicionado.

    public Set<Contato> pesquisarPorNome(String nome) {
       Set<Contato> contatosPorNome = new HashSet<>();
       for(Contato c : contatoSet) {
           if(c.getNome().startsWith(nome)) {
               contatosPorNome.add(c);
           }
       }
       return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Romario", 98571067);
        agendaContatos.adicionarContato("Yasmin", 983522698);
        agendaContatos.adicionarContato("Mirella", 996023024);
        agendaContatos.adicionarContato("Yasmin Soares", 998561425);
        agendaContatos.adicionarContato("Doracy", 98658745);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Yasmin"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Doracy", 998571057));

        agendaContatos.exibirContato();


    }
}
