package org.example.fabricas;

import org.example.planosExecucao.OrientacaoAquecimento;
import org.example.planosExecucao.OrientacaoRecuperacao;
import org.example.planosExecucao.OrientacaoTreino;

public interface FabricaAbstrata {

    OrientacaoTreino createPlanoTreino();
    OrientacaoAquecimento createPlanoAquecimento();
    OrientacaoRecuperacao createPlanoRecuperacao();
}
