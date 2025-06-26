package org.example;

import org.example.planosContratos.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IPlanoTest {

    @Test
    void deveRetornarValorPlano() {
        IPlano plano = new PlanoPremium(1000.0f);
        assertEquals(1000.0f, plano.getValorPlano());
    }

    @Test
    void deveRetornarValorPlanoComRelatorioSaude() {
        IPlano plano = new RelatorioSaudePreventiva(new PlanoPremium(1000.0f));
        assertEquals(1010.0f, plano.getValorPlano());
    }

    @Test
    void deveRetornarValorPlanoComAnaliseAvancadaDados() {
        IPlano plano = new AnaliseAvancadaDados(new PlanoPremium(1000.0f));
        assertEquals(1020.0f, plano.getValorPlano());
    }

    @Test
    void deveRetornarValorPlanoComRelatorioPerformance() {
        IPlano plano = new RelatorioPerformance(new PlanoPremium(1000.0f));
        assertEquals(1005.0f, plano.getValorPlano());
    }

    @Test
    void deveRetornarValorPlanoComSaudeMaisAnalise() {
        IPlano plano = new RelatorioSaudePreventiva(new AnaliseAvancadaDados(new PlanoPremium(1000.0f)));
        assertEquals(1030.0f, plano.getValorPlano());
    }

    @Test
    void deveRetornarValorPlanoComSaudeMaisPerformance() {
        IPlano plano = new RelatorioSaudePreventiva(new RelatorioPerformance(new PlanoPremium(1000.0f)));
        assertEquals(1015.0f, plano.getValorPlano());
    }

    @Test
    void deveRetornarValorPlanoComAnaliseMaisPerformance() {
        IPlano plano = new AnaliseAvancadaDados(new RelatorioPerformance(new PlanoPremium(1000.0f)));
        assertEquals(1025.0f, plano.getValorPlano());
    }

    @Test
    void deveRetornarValorPlanoCompleto() {
        IPlano plano = new RelatorioSaudePreventiva(new AnaliseAvancadaDados(new RelatorioPerformance(new PlanoPremium(1000.0f))));
        assertEquals(1035.0f, plano.getValorPlano());
    }

    @Test
    void deveRetornarEstruturaPlano() {
        IPlano plano = new PlanoPremium();
        assertEquals("Plano Premium", plano.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPlanoComSaude() {
        IPlano plano = new RelatorioSaudePreventiva(new PlanoPremium());
        assertEquals("Plano Premium/Relatório Saúde", plano.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPlanoComAnalise() {
        IPlano plano = new AnaliseAvancadaDados(new PlanoPremium());
        assertEquals("Plano Premium/Análise de Dados", plano.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPlanoComPerformance() {
        IPlano plano = new RelatorioPerformance(new PlanoPremium());
        assertEquals("Plano Premium/Relatório Performance", plano.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPlanoComSaudeMaisAnalise() {
        IPlano plano = new RelatorioSaudePreventiva(new AnaliseAvancadaDados(new PlanoPremium()));
        assertEquals("Plano Premium/Análise de Dados/Relatório Saúde", plano.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPlanoComSaudeMaisPerformance() {
        IPlano plano = new RelatorioSaudePreventiva(new RelatorioPerformance(new PlanoPremium()));
        assertEquals("Plano Premium/Relatório Performance/Relatório Saúde", plano.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPlanoComAnaliseMaisPerformance() {
        IPlano plano = new AnaliseAvancadaDados(new RelatorioPerformance(new PlanoPremium()));
        assertEquals("Plano Premium/Relatório Performance/Análise de Dados", plano.getEstrutura());
    }

    @Test
    void deveRetornarEstruturaPlanoCompleto() {
        IPlano plano = new RelatorioSaudePreventiva(new AnaliseAvancadaDados(new RelatorioPerformance(new PlanoPremium())));
        assertEquals("Plano Premium/Relatório Performance/Análise de Dados/Relatório Saúde", plano.getEstrutura());
    }
}