package br.ufpe.cin.residencia.aula.esportes;

import java.util.ArrayList;
import java.util.List;

public class Time implements ITime {

    private String nome;

    List<IJogador> jogadores;
    private int golsMarcados = 0;
    private int golsSofridos = 0;
    private int cartoesAmarelos = 0;
    private int cartoesVermelhos = 0;

    private int totalVitorias = 0;
    private int totalEmpates = 0;
    private int totalDerrotas = 0;

    public Time(String nome) {
        this(nome, new ArrayList<IJogador>());
    }

    public Time(String nome, List<IJogador> jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void adicionarJogador(IJogador j) {
        this.jogadores.add(j);
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public int golsMarcados() {
        return this.golsMarcados;
    }

    @Override
    public int golsSofridos() {
        return this.golsSofridos;
    }

    @Override
    public int saldoGols() {
        return this.golsMarcados - this.golsSofridos;
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
    public int totalVitorias() {
        return this.totalVitorias;
    }

    @Override
    public int totalEmpates() {
        return this.totalEmpates;
    }

    @Override
    public int totalDerrotas() {
        return this.totalDerrotas;
    }

    @Override
    public int totalPontos() {
        return (this.totalVitorias * 3) + this.totalEmpates;
    }

    @Override
    public void marcarGol(IJogador j, ITime oponente) {
        j.marcarGol();
        this.golsMarcados++;
    }

    @Override
    public void levarGol() {
        this.golsSofridos++;
    }

    @Override
    public void levarCartaoAmarelo(IJogador j) {
        j.levarCartaoAmarelo();
        this.cartoesAmarelos++;
    }

    @Override
    public void levarCartaoVermelho(IJogador j) {
        j.levarCartaoVermelho();
        this.cartoesVermelhos++;
    }

    @Override
    public void vencerJogo() {
        this.totalVitorias++;
    }

    @Override
    public void perderJogo() {
        this.totalDerrotas++;
    }

    @Override
    public void empatarJogo() {
        this.totalEmpates++;
    }

    @Override
    public int compareTo(ITime o) {
        if (this.totalPontos() > o.totalPontos()) {
            return -1;
        } else if (this.totalPontos() < o.totalPontos()) {
            return 1;
        } else {
            if (this.saldoGols() > o.saldoGols()) {
                return -1;
            } else if (this.saldoGols() < o.saldoGols()) {
                return 1;
            } else {
                if (this.golsMarcados() > o.golsMarcados()) {
                    return -1;
                } else if (this.golsMarcados() < o.golsMarcados()) {
                    return 1;
                } else {
                    if (this.totalCartoesAmarelos() < o.totalCartoesAmarelos()) {
                        return -1;
                    } else if (this.totalCartoesAmarelos() > o.totalCartoesAmarelos()) {
                        return 1;
                    } else {
                        if (this.totalCartoesVermelhos() < o.totalCartoesVermelhos()) {
                            return -1;
                        } else if (this.totalCartoesVermelhos() > o.totalCartoesVermelhos()) {
                            return 1;
                        } else {
                            return 0;
                        }
                    }
                }
            }
        }
    }
}
