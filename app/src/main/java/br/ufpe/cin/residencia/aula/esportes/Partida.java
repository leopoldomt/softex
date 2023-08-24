package br.ufpe.cin.residencia.aula.esportes;

import java.util.HashMap;
import java.util.Map;

public class Partida implements IPartida {

    ITime t1, t2;
    Map<ITime, EstatisticasPartida> estatisticasPartida;

    public Partida(ITime t1, ITime t2) {
        this(t1, t2, new HashMap<>());
    }
    public Partida(ITime t1, ITime t2, Map<ITime, EstatisticasPartida> estatisticasPartida) {
        this.t1 = t1;
        this.t2 = t2;
        this.estatisticasPartida = estatisticasPartida;
    }

    @Override
    public int golsMarcados(ITime t) {
        //gols marcados durante a partida apenas
        return t.golsMarcados();
    }

    @Override
    public int golsSofridos(ITime t) {
        return t.golsSofridos();
    }

    @Override
    public int totalCartoesAmarelos(ITime t) {
        return t.totalCartoesAmarelos();
    }

    @Override
    public int totalCartoesVermelhos(ITime t) {
        return t.totalCartoesVermelhos();
    }

    @Override
    public void marcarGol(ITime t, IJogador j) {
        estatisticasPartida.get(t).marcarGol();
        t.marcarGol(j, t2);
        if (t.equals(t1)) {
            t2.levarGol();
        }
        else {
            t1.levarGol();
        }
    }

    @Override
    public void levarCartaoAmarelo(ITime t, IJogador j) {
        estatisticasPartida.get(t).levarAmarelo();
        t.levarCartaoAmarelo(j);
    }

    @Override
    public void levarCartaoVermelho(ITime t, IJogador j) {
        estatisticasPartida.get(t).levarVermelho();
        t.levarCartaoVermelho(j);
    }

    @Override
    public void iniciarPartida() {
        //inicializar o placar
        estatisticasPartida.put(t1, new EstatisticasPartida());
        estatisticasPartida.put(t2, new EstatisticasPartida());

    }

    @Override
    public void encerrarPartida() {
        //com base no placar final, incrementar vitorias/empates/derrotas
        int golsT1 = estatisticasPartida.get(t1).getGols();
        int golsT2 = estatisticasPartida.get(t2).getGols();

        if (golsT1>golsT2) {
            t1.vencerJogo();
            t2.perderJogo();
        }
        else if (golsT2>golsT1) {
            t2.vencerJogo();
            t1.perderJogo();
        }
        else {
            t1.empatarJogo();
            t2.empatarJogo();
        }
    }
}
