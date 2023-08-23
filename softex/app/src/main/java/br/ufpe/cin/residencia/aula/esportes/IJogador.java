package br.ufpe.cin.residencia.aula.esportes;

public interface IJogador {
    public int golsMarcados();

    public int totalCartoesAmarelos();

    public int totalCartoesVermelhos();

    public void marcarGol();

    public void levarCartaoAmarelo();

    public void levarCartaoVermelho();

    public int mediaGols();

    public int faltasRecebidas();

    public boolean lesionado();

    public void levouFalta();

    public boolean candidatoMelhorJogador();

    public boolean expulso();


}