package br.ufpe.cin.residencia.aula.busca;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuscaLinearTest {

    BuscaLinear buscaLinear;
    Integer[] arrayEntrada;

    @BeforeEach
    void setUp() {
        buscaLinear = new BuscaLinear();
        arrayEntrada = new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12};
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void buscarElemento_1() {
        int posicaoEsperada = 0;
        int posicaoObtida = buscaLinear.busca(arrayEntrada, 1);
        assertEquals(
                posicaoEsperada,
                posicaoObtida,
                "Houve alguma diferença..."
        );
    }

    @Test
    void buscarElemento_4() {
        int posicaoEsperada = 3;
        int posicaoObtida = buscaLinear.busca(arrayEntrada, 4);
        assertEquals(
                posicaoEsperada,
                posicaoObtida,
                "Houve alguma diferença..."
        );
    }

    @Test
    void buscarElemento_12() {
        int posicaoEsperada = 11;
        int posicaoObtida = buscaLinear.busca(arrayEntrada, 12);
        assertEquals(
                posicaoEsperada,
                posicaoObtida,
                "Houve alguma diferença..."
        );
    }

    @Test
    void buscarElementoInexistente() {
        int posicaoEsperada = -1;
        int posicaoObtida = buscaLinear.busca(arrayEntrada, 23);
        assertEquals(
                posicaoEsperada,
                posicaoObtida,
                "Houve alguma diferença..."
        );
    }
}