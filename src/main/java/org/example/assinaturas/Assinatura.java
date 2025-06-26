package org.example.assinaturas;

import org.example.planosContratos.IPlano;
import java.util.Observable;

public class Assinatura extends Observable {
    private AssinaturaEstado estado;
    private float valorTotal;

    public Assinatura(IPlano plano) {
        this.estado = AssinaturaEstadoAtiva.getInstance();
        this.valorTotal = plano.getValorPlano();
    }

    public boolean ativar() {
        return estado.assinaturaEstadoAtiva(this);
    }

    public boolean inativar() {
        return estado.assinaturaEstadoInativa(this);
    }

    public boolean cancelar() {
        return estado.assinaturaEstadoCancelada(this);
    }

    protected void setEstado(AssinaturaEstado novoEstado) {
        this.estado = novoEstado;
        setChanged();
        notifyObservers();
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public AssinaturaEstado getEstado() {
        return estado;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Assinatura{Estado=" + estado.getEstado() + '}';
    }
}
