package br.ufpe.cin.residencia.aula.pilha;

public class OverflowStackException extends RuntimeException {
    public OverflowStackException(String msg) {
        super(msg);
    }
}
