package org.example.fabricas;

import org.example.planosExecucao.*;

public class FabricaEmagrecimento implements FabricaAbstrata {

    private FabricaEmagrecimento(){}

    private static FabricaEmagrecimento instance = new FabricaEmagrecimento();
    public static FabricaEmagrecimento getInstance() {
        return instance;
    }

    @Override
    public OrientacaoTreino createPlanoTreino() {
        return new OrientacaoTreinoEmagrecimento();
    }

    @Override
    public OrientacaoAquecimento createPlanoAquecimento() {
        return new OrientacaoAquecimentoParaEmagrecimento();
    }

    @Override
    public OrientacaoRecuperacao createPlanoRecuperacao() {
        return new OrientacaoRecuperacaoEmagrecimento();
    }
}
