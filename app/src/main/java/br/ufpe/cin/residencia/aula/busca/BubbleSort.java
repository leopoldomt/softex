package br.ufpe.cin.residencia.aula.busca;

public class BubbleSort implements Sort {
    @Override
    public void sort(int[] elementos) {
        int n = elementos.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (elementos[j - 1] > elementos[j]) {
                    temp = elementos[j - 1];
                    elementos[j - 1] = elementos[j];
                    elementos[j] = temp;
                }
            }
        }

    }
}
