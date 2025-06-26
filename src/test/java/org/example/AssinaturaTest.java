package org.example;

import org.example.assinaturas.Assinatura;
import org.example.assinaturas.AssinaturaEstadoAtiva;
import org.example.assinaturas.AssinaturaEstadoCancelada;
import org.example.assinaturas.AssinaturaEstadoInativa;
import org.example.planosContratos.PlanoBasic;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssinaturaTest {
    private Assinatura assinatura;

    @BeforeEach
    void setUp() {
        assinatura = new Assinatura(new PlanoBasic());
    }

    @Test
    void naoDeveAtivarClienteAtivo() {
        assertFalse(assinatura.ativar());
    }

    @Test
    void estadoDevePermaneceAtivo() {
        assinatura.ativar();
        assertEquals(AssinaturaEstadoAtiva.getInstance(), assinatura.getEstado());
    }

    @Test
    void deveInativarClienteAtivo() {
        assertTrue(assinatura.inativar());
    }

    @Test
    void deveInativarClienteAtivoEstadoFicaInativo() {
        assinatura.inativar();
        assertEquals(AssinaturaEstadoInativa.getInstance(), assinatura.getEstado());
    }

    @Test
    void deveCancelarClienteAtivo() {
        assertTrue(assinatura.cancelar());
    }

    @Test
    void deveCancelarClienteAtivoEstadoFicaCancelado() {
        assinatura.cancelar();
        assertEquals(AssinaturaEstadoCancelada.getInstance(), assinatura.getEstado());
    }

    @Test
    void naoDeveAtivarClienteCancelado() {
        assinatura.cancelar();
        assertFalse(assinatura.ativar());
    }

    @Test
    void naoDeveAtivarClienteCanceladoEstadoDeveContinuarCancelado() {
        assinatura.cancelar();
        assinatura.ativar();
        assertEquals(AssinaturaEstadoCancelada.getInstance(),assinatura.getEstado());
    }

    @Test
    void naoDeveInativarClienteInativo() {
        assinatura.inativar();
        assertFalse(assinatura.inativar());
    }

    @Test
    void deveAtivarClienteInativo() {
        assinatura.inativar();
        assertTrue(assinatura.ativar());
    }

    @Test
    void deveAtivarClienteInativoEstadoFicaAtivo() {
        assinatura.inativar();
        assinatura.ativar();
        assertEquals(AssinaturaEstadoAtiva.getInstance(), assinatura.getEstado());
    }

    @Test
    void deveCancelarClienteInativo() {
        assinatura.inativar();
        assertTrue(assinatura.cancelar());
    }

    @Test
    void deveCancelarClienteInativoEstadoFicaCancelado() {
        assinatura.inativar();
        assinatura.cancelar();
        assertEquals(AssinaturaEstadoCancelada.getInstance(), assinatura.getEstado());
    }

    @Test
    void naoDeveCancelarClienteCancelado() {
        assinatura.cancelar();
        assertFalse(assinatura.cancelar());
    }

}
