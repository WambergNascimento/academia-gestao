package org.example;

import org.example.fabricas.FabricaAbstrata;
import org.example.fabricas.FabricaEmagrecimento;
import org.example.fabricas.FabricaHipertrofia;
import org.example.planosExecucao.Orientacao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrientacaoTest {

    @Test
    void deveEmitirPlanoTreinoHipertrofia() {
        FabricaAbstrata fabrica = FabricaHipertrofia.getInstance();
        Orientacao orientacao = new Orientacao(fabrica);
        assertEquals("Orientação de Treino para Hipertrofia", orientacao.emitirPlanoTreino());
    }

    @Test
    void deveEmitirPlanoTreinoEmagrecimento() {
        FabricaAbstrata fabrica = FabricaEmagrecimento.getInstance();
        Orientacao orientacao = new Orientacao(fabrica);
        assertEquals("Orientação de Treino para Emagrecimento", orientacao.emitirPlanoTreino());
    }

    @Test
    void deveEmitirPlanoAquecimentoHipertrofia() {
        FabricaAbstrata fabrica = FabricaHipertrofia.getInstance();
        Orientacao orientacao = new Orientacao(fabrica);
        assertEquals("Orientação de Aquecimento para Hipertrofia", orientacao.emitirPlanoAquecimento());
    }


    @Test

    void deveEmitirPlanoAquecimentoEmagrecimento() {
        FabricaAbstrata fabrica = FabricaEmagrecimento.getInstance();
        Orientacao orientacao = new Orientacao(fabrica);
        assertEquals("Orientação de Aquecimento para Emagrecimento", orientacao.emitirPlanoAquecimento());
    }

    @Test
    void deveEmitirPlanoRecuperacaoHipertrofia() {
        FabricaAbstrata fabrica = FabricaHipertrofia.getInstance();
        Orientacao orientacao = new Orientacao(fabrica);
        assertEquals("Orientação de Recuperação para Hipertrofia", orientacao.emitirPlanoRecuperacao());
    }

    @Test
    void deveEmitirPlanoRecuperacaoEmagrecimento() {
        FabricaAbstrata fabrica = FabricaEmagrecimento.getInstance();
        Orientacao orientacao = new Orientacao(fabrica);
        assertEquals("Orientação de Recuperação para Emagrecimento", orientacao.emitirPlanoRecuperacao());
    }

//    @Test
//    void deveRetornarEstadoAssinaturaAtivaAluno() {
//        FabricaAbstrata fabrica = FabricaHipertrofia.getInstance();
//        TipoPlano plano = new PlanoBasic();
//        Assinatura assinatura = new Assinatura(plano);
//        Aluno aluno = new Aluno(fabrica, "Chico Anísio",assinatura);
//
//        assertEquals(AssinaturaEstadoAtiva.getInstance(), aluno.getEstadoAssinatura());
//    }


}