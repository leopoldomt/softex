package br.ufpe.cin.residencia.aula.busca;

public class BuscaLinear implements IAlgoritmoBusca<Integer> {
    @Override
    public int busca(Integer[] arr, Integer element) {
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
