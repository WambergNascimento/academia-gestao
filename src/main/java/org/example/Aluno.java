package org.example;

import org.example.assinaturas.Assinatura;
import org.example.assinaturas.AssinaturaEstado;
import org.example.treinos.Treino;

import java.util.Observable;
import java.util.Observer;

public class Aluno implements Observer {

    private String nome;
    private Assinatura assinatura;
    private String ultimaNotificacao;
    private Treino treino;

    public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }

    public Aluno (String nome, Assinatura assinatura) {
        this.nome = nome;
        this.assinatura = assinatura;
    }

    public AssinaturaEstado getEstadoAssinatura() {
        return this.assinatura.getEstado();
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void assinar(Assinatura assinatura) {
        assinatura.addObserver(this);
    }

    @Override
    public void update(Observable assinatura, Object arg) {
        this.ultimaNotificacao = this.nome + " - Estado da assinatura: " + assinatura.toString();
    }
}
