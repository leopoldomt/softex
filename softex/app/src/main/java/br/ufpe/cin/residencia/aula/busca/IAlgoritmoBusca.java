package br.ufpe.cin.residencia.aula.busca;

public interface IAlgoritmoBusca<T> {
    // input = {1,2,3,4,5,6}
    //search(input, 5) ==> 4
    //search(input, 15) ==> -1
    int busca(T arr[], T element);
}
