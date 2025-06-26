package org.example.planosExecucao;

import org.example.fabricas.FabricaAbstrata;

public class Orientacao {

    private OrientacaoTreino orientacaoTreino;

    public Orientacao(FabricaAbstrata fabrica) {
        this.orientacaoTreino = fabrica.createPlanoTreino();
        this.orientacaoAquecimento = fabrica.createPlanoAquecimento();
        this.orientacaoRecuperacao = fabrica.createPlanoRecuperacao();
    }

    private OrientacaoAquecimento orientacaoAquecimento;
    private OrientacaoRecuperacao orientacaoRecuperacao;

    public String emitirPlanoTreino() {
        return this.orientacaoTreino.emitir();
    }

    public String emitirPlanoAquecimento() {
        return this.orientacaoAquecimento.emitir();
    }

    public String emitirPlanoRecuperacao() {
        return this.orientacaoRecuperacao.emitir();
    }
}
