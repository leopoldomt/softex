package br.ufpe.cin.residencia.aula.pilha;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilhaTest {

    @Test
    void tamanho() {
        IPilha<Integer> pilha = new Pilha<>();
        int tamanhoOriginal = pilha.tamanho();
        pilha.inserir(12);
        int novoTamanho = tamanhoOriginal+1;
        assertEquals(
                novoTamanho,
                pilha.tamanho(),
                "Tamanho deveria ser incrementado em 1 após uma inserção"
        );
    }

    @Test
    void tamanhoAumentaEmDois() {
        IPilha<Integer> pilha = new Pilha<>();
        int tamanhoOriginal = pilha.tamanho();
        pilha.inserir(12);
        pilha.inserir(13);
        int novoTamanho = tamanhoOriginal+2;
        assertEquals(
                novoTamanho,
                pilha.tamanho(),
                "Tamanho deveria ser incrementado em 2 após duas inserções"
        );
    }

    @Test
    void inserir() {
    }

    @Test
    void remover() {
    }

    @Test
    void vazia() {
    }

    @Test
    void topo() {
    }
}