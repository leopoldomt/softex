package br.ufpe.cin.residencia.aula.pilha;

public interface IPilha<T> {
    int tamanho();
    void inserir(T element);
    T remover();
    boolean vazia();
    T topo();
}
