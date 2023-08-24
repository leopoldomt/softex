package br.ufpe.cin.residencia.aula.esportes;

public interface ITime extends Comparable<ITime> {

    public String getNome();

    public int golsMarcados();

    public int golsSofridos();

    public int saldoGols();

    public int totalCartoesAmarelos();

    public int totalCartoesVermelhos();

    public int totalVitorias();

    public int totalEmpates();

    public int totalDerrotas();

    public int totalPontos();

    public void marcarGol(IJogador j, ITime oponente);

    public void levarGol();

    public void levarCartaoAmarelo(IJogador j);

    public void levarCartaoVermelho(IJogador j);

    public void vencerJogo();

    public void perderJogo();

    public void empatarJogo();
}