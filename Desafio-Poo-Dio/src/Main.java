import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descricao mentoria java");
        mentoria.setData(LocalDate.now());


       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRomario = new Dev();
        devRomario.setNome("Romario");
        devRomario.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Romario:" + devRomario.getConteudosInscritos());
        devRomario.progredir();
        devRomario.progredir();
        devRomario.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Romario:" + devRomario.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Romario:" + devRomario.getConteudosConcluidos());
        System.out.println("XP:" + devRomario.calcularTotalXp());

        System.out.println("-------");

        Dev devYasmin = new Dev();
        devYasmin.setNome("Yasmin");
        devYasmin.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Yasmin:" + devYasmin.getConteudosInscritos());
        devYasmin.progredir();
        devYasmin.progredir();
        devYasmin.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Yasmin:" + devYasmin.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Yasmin:" + devYasmin.getConteudosConcluidos());
        System.out.println("XP:" + devYasmin.calcularTotalXp());

    }
}
