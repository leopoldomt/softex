package br.ufpe.cin.residencia.aula.pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha<T> implements IPilha<T> {

    private int tamanhoMaximo;
    private LinkedList<T> pilha;

    public Pilha(int tamanho) {
        this.tamanhoMaximo = tamanho;
        this.pilha = new LinkedList<>();
    }

    public Pilha() {
        this(5);
    }

    @Override
    public int tamanho() {
        return this.pilha.size();
    }

    @Override
    public void inserir(T elemento) {
        if (this.pilha.size() < this.tamanhoMaximo) {
            this.pilha.addFirst(elemento);
        }
        else {
            throw new OverflowStackException("Overflow da pilha");
        }
    }

    @Override
    public T remover() {
        T elemento = this.topo();
        this.pilha.removeFirst();
        return elemento;
    }

    @Override
    public boolean vazia() {
        return this.pilha.isEmpty();
//        return this.pilha.size()==0;
    }

    @Override
    public T topo() {
        if (this.vazia()) {
            throw new UnderflowStackException("Underflow da pilha");
        }
        else {
            return this.pilha.peek();
        }
    }
}
