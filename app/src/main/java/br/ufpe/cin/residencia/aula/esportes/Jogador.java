package br.ufpe.cin.residencia.aula.esportes;

public class Jogador implements IJogador {
    private String nome;
    private int golsMarcados;
    private int cartoesAmarelos;
    private int cartoesVermelhos;
    private int partidasJogadas;

    public Jogador(String nome) {
        this.nome = nome;
        this.golsMarcados = 0;
        this.cartoesAmarelos = 0;
        this.cartoesVermelhos = 0;
        this.partidasJogadas = 0;
    }

    @Override
    public int golsMarcados() {
        return this.golsMarcados;
    }

    @Override
    public int totalCartoesAmarelos() {
        return this.cartoesAmarelos;
    }

    @Override
    public int totalCartoesVermelhos() {
        return this.cartoesVermelhos;
    }

    @Override
    public void marcarGol() {
        this.golsMarcados++;
    }

    @Override
    public void levarCartaoAmarelo() {
        this.cartoesAmarelos++;
    }

    @Override
    public void levarCartaoVermelho() {
        this.cartoesVermelhos++;
    }

    @Override
    public int mediaGols() {
        return this.golsMarcados / this.partidasJogadas;
    }

}
