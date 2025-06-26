package org.example;

import org.example.assinaturas.Assinatura;
import org.example.planosContratos.PlanoBasic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoObserverTest {

    @Test
    void deveNotificarAlunoAposAlterarParaInativa() {
        Assinatura assinatura = new Assinatura(new PlanoBasic());
        Aluno aluno = new Aluno("Donald Trump", assinatura);
        aluno.assinar(assinatura);
        assinatura.inativar();
        assertEquals(
                "Donald Trump - Estado da assinatura: Assinatura{Estado=assinaturaEstadoInativa}",
                aluno.getUltimaNotificacao()
        );
    }

    @Test
    void deveNotificarAlunoAposAssinaturaCancelada() {
        Assinatura assinatura = new Assinatura(new PlanoBasic());
        Aluno aluno = new Aluno("Vladimir Putin", assinatura);
        aluno.assinar(assinatura);
        assinatura.cancelar();
        assertEquals(
                "Vladimir Putin - Estado da assinatura: Assinatura{Estado=assinaturaEstadoCancelada}",
                aluno.getUltimaNotificacao()
        );
    }

    @Test
    void deveNotificarAlunoQuandoTrocaDeInativaParaAtiva() {
        Assinatura assinatura = new Assinatura(new PlanoBasic());
        Aluno aluno = new Aluno("Emmanuel Macron", assinatura);
        aluno.assinar(assinatura);
        assinatura.inativar();
        assinatura.ativar();
        assertEquals(
                "Emmanuel Macron - Estado da assinatura: Assinatura{Estado=assinaturaEstadoAtiva}",
                aluno.getUltimaNotificacao()
        );
    }

    @Test
    void naoDeveNotificarQuandoCanceladaNaoVoltaParaAtiva() {
        Assinatura assinatura = new Assinatura(new PlanoBasic());
        Aluno aluno = new Aluno("Javier Milei", assinatura);
        aluno.assinar(assinatura);
        assinatura.cancelar();
        String ultima = aluno.getUltimaNotificacao();
        assertFalse(assinatura.ativar());
        assertEquals(ultima, aluno.getUltimaNotificacao());
    }
}