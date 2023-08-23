package br.ufpe.cin.residencia.aula.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SelectionSortTest {
    private int[] entradaDesordenada = {4, 3, 8, 5, 1, 9, 2, 6, 7};
    private int[] entradaOrdenada = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    private int[] randomArray;
    private final int TAMANHO = 50000;
    Sort algoritmoOrdenacao;
    @BeforeEach
    void setup() {
        algoritmoOrdenacao = new SelectionSort();
        entradaDesordenada = new int[]{4, 3, 8, 5, 1, 9, 2, 6, 7};
        Random r = new Random();
        randomArray = new int[TAMANHO];
        for (int i = 0 ; i<TAMANHO; i++) {
            randomArray[i] = r.nextInt();
        }
    }
    @Test
    void sortEntradaDesordenada() {
        algoritmoOrdenacao.sort(entradaDesordenada);
        assertArrayEquals(
                entradaOrdenada,
                entradaDesordenada
        );
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    void sortEntradaOrdenada() {
        int[] entrada = {1,2,3,4,5,6,7,8,9};
        algoritmoOrdenacao.sort(entrada);
        assertArrayEquals(
                entradaOrdenada,
                entrada
        );
    }

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    void testarRandomArray() {
        algoritmoOrdenacao.sort(randomArray);
        assertTrue(checaOrdenacao(randomArray));
    }

    private boolean checaOrdenacao(int[] dados) {
        for (int i = 0 ; i<TAMANHO-1; i++) {
            if (dados[i] > dados[i+1]) {
                return false;
            }
        }
        return true;
    }
}