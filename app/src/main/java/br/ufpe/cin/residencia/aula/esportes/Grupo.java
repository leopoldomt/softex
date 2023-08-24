package br.ufpe.cin.residencia.aula.esportes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Grupo {
    List<ITime> equipes;
    List<IPartida> partidas;


    public Grupo(List<ITime> equipes) {
        if (equipes.size()!=4) {
            throw new GrupoMalFormadoException();
        }
        else {
            this.partidas = new ArrayList<>();
            this.equipes = equipes;
        }
    }

    public void adicionarPartida(IPartida p) {
        this.partidas.add(p);
    }

    public ITime getPrimeiroColocado() {
        Collections.sort(equipes);
        return equipes.get(0);
    }

    public void imprimeTabela() {
        Collections.sort(this.equipes);
        for (ITime t : this.equipes) {
            StringBuilder sb = new StringBuilder();
            sb.append(t.getNome());
            sb.append('\t');
            sb.append(t.totalPontos());
            sb.append('\t');
            sb.append(t.totalVitorias());
            sb.append('\t');
            sb.append(t.totalEmpates());
            sb.append('\t');
            sb.append(t.totalDerrotas());
            sb.append('\t');
            sb.append(t.golsMarcados());
            sb.append('\t');
            sb.append(t.golsSofridos());
            sb.append('\t');
            sb.append(t.saldoGols());
            sb.append('\t');
            sb.append(t.totalCartoesAmarelos());
            sb.append('\t');
            sb.append(t.totalCartoesVermelhos());
            System.out.println(sb.toString());
        }
    }

}
