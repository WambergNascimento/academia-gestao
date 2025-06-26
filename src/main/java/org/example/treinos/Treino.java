package org.example.treinos;

import org.example.planosExecucao.Orientacao;

import java.util.ArrayList;
import java.util.List;

public class Treino {
    private String descricao;
    private List<Exercicio> exercicios;
    private Orientacao orientacao;

    public Orientacao getOrientacao() {
        return orientacao;
    }

    public Treino(String descricao, Orientacao orientacao) {
        this.descricao= descricao;
        this.orientacao = orientacao;
        this.exercicios = new ArrayList<>();
    }

    public void adicionarExercicio(Exercicio exercicio) {
        exercicios.add(exercicio);
    }

    public List<Exercicio> getExercicios() {
        return exercicios;
    }

    public String getDescricao() {
        return descricao;
    }
}
