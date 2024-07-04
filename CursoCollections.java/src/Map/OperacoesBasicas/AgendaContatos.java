package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributos

    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContatao(String nome, Integer telefone) {
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(agendaContatosMap.isEmpty()) {
            numeroPorNome = agendaContatosMap.get(nome);
        }
        return  numeroPorNome;
    }

    public static void main(String[] args){
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContatao("Romario", 66666);
        agendaContatos.adicionarContatao("Romario", 33333);
        agendaContatos.adicionarContatao("Romario Santana", 77777);
        agendaContatos.adicionarContatao("Romario Silva", 22222);
        agendaContatos.adicionarContatao("Yasmin", 77777);
        agendaContatos.adicionarContatao("Romario", 44444);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Romario Santana");
        agendaContatos.exibirContato();

        System.out.println("O numero é : " + agendaContatos.pesquisarPorNome("Yasmin"));
    }

}
