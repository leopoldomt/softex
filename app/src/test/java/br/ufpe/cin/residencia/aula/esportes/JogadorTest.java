package br.ufpe.cin.residencia.aula.esportes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class JogadorTest {

    IJogador jogador;

    @BeforeEach
    void setUp() {
        jogador = mock(IJogador.class);
        when(jogador.golsMarcados()).thenReturn(0).thenReturn(1);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void golsMarcadosInicialmenteZero() {
        assertEquals(
                0,
                jogador.golsMarcados()
        );
    }

    @Test
    void marcarGolIncrementa() {
        int qtdeGolsMarcados = jogador.golsMarcados();
        jogador.marcarGol();
        assertEquals(
                qtdeGolsMarcados+1,
                jogador.golsMarcados()
        );
        jogador.marcarGol();
        assertEquals(
                qtdeGolsMarcados+2,
                jogador.golsMarcados()
        );
    }

    @Test
    void totalCartoesAmarelos() {
    }

    @Test
    void totalCartoesVermelhos() {
    }

    @Test
    void marcarGol() {
    }

    @Test
    void levarCartaoAmarelo() {
    }

    @Test
    void levarCartaoVermelho() {
    }

    @Test
    void mediaGols() {
    }
}