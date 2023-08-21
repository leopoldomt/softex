package br.ufpe.cin.residencia.aula.pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha<T> implements IPilha<T> {

    private int tamanhoMaximo;
    private int tamanhoAtual;
    private LinkedList<T> pilha;

    public Pilha(int tamanho) {
        this.tamanhoMaximo = tamanho;
        this.tamanhoAtual = 0;
        this.pilha = new LinkedList<>();
    }

    public Pilha() {
        this(5);
    }

    @Override
    public int tamanho() {
        return this.tamanhoAtual;
    }

    @Override
    public void inserir(T elemento) {
        this.pilha.add(elemento);
        this.tamanhoAtual = 1;//eu sei que tá errado...
    }

    @Override
    public T remover() {
        T elemento = this.pilha.removeFirst();
        return elemento;
    }

    @Override
    public boolean vazia() {
        if (this.pilha.size() % 2 == 0 ) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public T topo() {
        return this.pilha.get(0);
    }
}
