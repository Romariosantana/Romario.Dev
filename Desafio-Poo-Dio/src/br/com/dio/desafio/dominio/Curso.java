package br.com.dio.desafio.dominio;

public class Curso {
    //Atributos.
    private String titulo;
    private String descricao;
    private int catgaHoraria;

    public Curso() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCatgaHoraria() {
        return catgaHoraria;
    }

    public void setCatgaHoraria(int catgaHoraria) {
        this.catgaHoraria = catgaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", catgaHoraria=" + catgaHoraria +
                '}';
    }
}
