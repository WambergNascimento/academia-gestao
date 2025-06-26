package org.example.fabricas;

import org.example.planosExecucao.*;

public class FabricaHipertrofia  implements FabricaAbstrata {

    private FabricaHipertrofia(){}

    private static FabricaHipertrofia instance = new FabricaHipertrofia();
    public static FabricaHipertrofia getInstance() {
        return instance;
    }
    @Override
    public OrientacaoTreino createPlanoTreino() {
        return new OrientacaoTreinoHipertrofia();
    }

    @Override
    public OrientacaoAquecimento createPlanoAquecimento() {
        return new OrientacaoAquecimentoHipertrofia();
    }

    @Override
    public OrientacaoRecuperacao createPlanoRecuperacao() {
        return new OrientacaoRecuperacaoHipertrofia();
    }
}
