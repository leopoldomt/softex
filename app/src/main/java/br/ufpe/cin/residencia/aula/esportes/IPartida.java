package br.ufpe.cin.residencia.aula.esportes;

public interface IPartida {
    public int golsMarcados(ITime t);

    public int golsSofridos(ITime t);

    public int totalCartoesAmarelos(ITime t);

    public int totalCartoesVermelhos(ITime t);

    public void marcarGol(ITime t, IJogador j);

    public void levarCartaoAmarelo(ITime t, IJogador j);

    public void levarCartaoVermelho(ITime t, IJogador j);

    public void iniciarPartida();

    public void encerrarPartida();
}