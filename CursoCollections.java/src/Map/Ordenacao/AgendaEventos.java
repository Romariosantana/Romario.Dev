package Map.Ordenacao;

import Map.OperacoesBasicas.AgendaContatos;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    //Atributos

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEventos(LocalDate data, String nome, String atracao) {
       // Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximoEvento);
                break;
            }
        }
    }
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEventos(LocalDate.of(2022, Month.JULY, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEventos(LocalDate.of(2024, Month.DECEMBER, 9), "Evento 2", "Atração 2");
        agendaEventos.adicionarEventos(LocalDate.of(2002, Month.JANUARY, 18), "Evento 3", "Atração 3");
        agendaEventos.adicionarEventos(LocalDate.of(2020, Month.JULY, 25), "Evento 4", "Atração 4");
        agendaEventos.adicionarEventos(LocalDate.of(2021, Month.SEPTEMBER, 3), "Evento 5", "Atração 5");
        agendaEventos.adicionarEventos(LocalDate.of(2024, Month.APRIL, 21), "Evento 6", "Atração 6");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}
