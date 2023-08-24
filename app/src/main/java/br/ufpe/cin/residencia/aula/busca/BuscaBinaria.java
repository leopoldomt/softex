package br.ufpe.cin.residencia.aula.busca;

public class BuscaBinaria implements IAlgoritmoBusca<Integer> {
    @Override
    public int busca(Integer[] arr, Integer element) {
        int begin = 0;
        int end = arr.length - 1;
        int middle;
        while (begin <= end) {
            middle = (begin + end) / 2;
            if (arr[middle] < element) {
                begin = middle + 1;
            } else if (arr[middle] > element) {
                end = middle - 1;
            } else {
                return middle;
            }
        }

        return -1;
    }
}
