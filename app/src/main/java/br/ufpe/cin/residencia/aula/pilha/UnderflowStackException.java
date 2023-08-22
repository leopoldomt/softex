package br.ufpe.cin.residencia.aula.pilha;

public class UnderflowStackException extends RuntimeException {
    public UnderflowStackException(String msg) {
        super(msg);
    }
}
