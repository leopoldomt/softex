package br.ufpe.cin.residencia.aula.fila;

public interface IFila<T> {
    //adiciona um elemento ao fim da fila
    void enqueue(T element);//análogo ao push/inserir da pilha

    //remover e retornar um elemento do início da fila
    T dequeue(); //análogo ao pop/remover da pilha

    //retorna o elemento do início da fila sem removê-lo
    T first(); //análogo ao peek/top/topo da pilha

    //checa se fila está vazia
    boolean empty();

    //quantidade de elementos na fila
    int size();
}
