package org.example;

import org.example.fabricas.FabricaHipertrofia;
import org.example.planosExecucao.Orientacao;
import org.example.treinos.Exercicio;
import org.example.treinos.Treino;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreinoTest {
    private Treino treino;
    private Exercicio exercicioAdicionado;

    @BeforeEach
    void setUp() {
        Orientacao orientacao = new Orientacao(FabricaHipertrofia.getInstance());
        treino = new Treino("Treino Funcional", orientacao);
        exercicioAdicionado = new Exercicio("Agachamento com Barra", 40, 12, 3);
        exercicioAdicionado.setDescricao("Exercício para quadríceps e glúteos");

        treino.adicionarExercicio(exercicioAdicionado);
    }

    @Test
    void listaDeveConterUmExercicio() {
        assertEquals(1, treino.getExercicios().size());
    }

    @Test
    void deveConterNomeDoExercicioAdicionado() {
        assertEquals("Agachamento com Barra", treino.getExercicios().get(0).getNome());
    }

    @Test
    void deveConterCargaCorreta() {
        assertEquals(40, treino.getExercicios().get(0).getCarga());
    }

    @Test
    void deveConterRepeticoesCorretas() {
        assertEquals(12, treino.getExercicios().get(0).getRepeticoes());
    }

    @Test
    void deveConterSeriesCorretas() {
        assertEquals(3, treino.getExercicios().get(0).getSeries());
    }

    @Test
    void deveConterDescricaoCorretaDoExercicio() {
        assertEquals("Exercício para quadríceps e glúteos", treino.getExercicios().get(0).getDescricao());
    }

    @Test
    void descricaoDoTreinoDeveSerFuncional() {
        assertEquals("Treino Funcional", treino.getDescricao());
    }
}