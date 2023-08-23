package br.ufpe.cin.residencia.aula.busca;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuscaBinariaTest {

    BuscaBinaria buscaBinaria;
    Integer[] arrayEntrada;

    @BeforeEach
    void setUp() {
        buscaBinaria = new BuscaBinaria();
        arrayEntrada = new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12};
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void buscarElemento_1() {
        int posicaoEsperada = 0;
        int posicaoObtida = buscaBinaria.busca(arrayEntrada, 1);
        assertEquals(
                posicaoEsperada,
                posicaoObtida,
                "Houve alguma diferença..."
        );
    }

    @Test
    void buscarElemento_10() {
        int posicaoEsperada = 9;
        int posicaoObtida = buscaBinaria.busca(arrayEntrada, 10);
        assertEquals(
                posicaoEsperada,
                posicaoObtida,
                "Houve alguma diferença..."
        );
    }
    @Test
    void buscarElemento_11() {
        int posicaoEsperada = 10;
        int posicaoObtida = buscaBinaria.busca(arrayEntrada, 11);
        assertEquals(
                posicaoEsperada,
                posicaoObtida,
                "Houve alguma diferença..."
        );
    }
    @Test
    void buscarElemento_4() {
        int posicaoEsperada = 3;
        int posicaoObtida = buscaBinaria.busca(arrayEntrada, 4);
        assertEquals(
                posicaoEsperada,
                posicaoObtida,
                "Houve alguma diferença..."
        );
    }



    @Test
    void buscarElementoInexistente() {
        int posicaoEsperada = -1;
        int posicaoObtida = buscaBinaria.busca(arrayEntrada, 23);
        assertEquals(
                posicaoEsperada,
                posicaoObtida,
                "Houve alguma diferença..."
        );
    }

    @Test
    void buscarElemento_12() {
        int posicaoEsperada = 11;
        int posicaoObtida = buscaBinaria.busca(arrayEntrada, 12);
        assertEquals(
                posicaoEsperada,
                posicaoObtida,
                "Houve alguma diferença..."
        );
    }
}