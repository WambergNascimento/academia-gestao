package org.example.treinos;

public class Exercicio {
    private String nome;
    private String descricao;

    public Exercicio(String nome, int carga, int repeticoes, int series) {
        this.nome = nome;
        this.carga = carga;
        this.repeticoes = repeticoes;
        this.series = series;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    private int carga;
    private int repeticoes;
    private int series;
}
