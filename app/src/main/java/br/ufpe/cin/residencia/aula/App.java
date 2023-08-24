/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package br.ufpe.cin.residencia.aula;

import br.ufpe.cin.residencia.aula.esportes.*;

import java.util.ArrayList;
import java.util.List;

public class App {
    public String getGreeting() {
        return "Olá mundo!";
    }

    public static void main(String[] args) {
//        System.out.println(new App().getGreeting());

        IJogador lovis = new Jogador("Lovis");//Wagner?
        IJogador neymar = new Jogador("Neymar");
        IJogador bala = new Jogador("Carlinhos Bala");
        IJogador kuki = new Jogador("Kuki");
        IJogador cacarato = new Jogador("Caça Rato");
        IJogador rosendrink = new Jogador("Rosenbrick");
        IJogador vampeta = new Jogador("Vampeta");
        IJogador pele = new Jogador("Pelé");

        List<IJogador> jogadoresSoftex = new ArrayList<>();
        jogadoresSoftex.add(lovis);
        jogadoresSoftex.add(pele);
        List<IJogador> jogadoresTabajara = new ArrayList<>();
        jogadoresTabajara.add(kuki);
        jogadoresTabajara.add(neymar);
        List<IJogador> jogadoresSantaCruz = new ArrayList<>();
        jogadoresSantaCruz.add(cacarato);
        jogadoresSantaCruz.add(rosendrink);
        List<IJogador> jogadoresRetro = new ArrayList<>();
        jogadoresRetro.add(vampeta);
        jogadoresRetro.add(bala);
        ITime softex = new Time("Softex", jogadoresSoftex);
        ITime tabajara = new Time("Tab.", jogadoresTabajara);
        ITime santinha = new Time("Santa", jogadoresSantaCruz);
        ITime retro = new Time("Retro", jogadoresRetro);
        List<ITime> equipes = new ArrayList<>();
        equipes.add(softex);
        equipes.add(tabajara);
        equipes.add(santinha);
        equipes.add(retro);
        Grupo grupo = new Grupo(equipes);
        grupo.imprimeTabela();
        System.out.println("------------------------------");

        IPartida softex_vs_tabajara = new Partida(softex, tabajara);
        softex_vs_tabajara.iniciarPartida();
        softex_vs_tabajara.marcarGol(softex,lovis);
        softex_vs_tabajara.levarCartaoAmarelo(softex,lovis);
        softex_vs_tabajara.marcarGol(softex,lovis);
        softex_vs_tabajara.levarCartaoVermelho(softex,lovis);
        softex_vs_tabajara.marcarGol(tabajara,kuki);
        softex_vs_tabajara.encerrarPartida();

        IPartida softex_vs_santa = new Partida(softex, santinha);
        IPartida softex_vs_retro = new Partida(softex, retro);
        IPartida tabajara_vs_santa = new Partida(tabajara, santinha);
        IPartida tabajara_vs_retro = new Partida(tabajara, retro);
        IPartida santa_vs_retro = new Partida(santinha, retro);

        grupo.imprimeTabela();
        System.out.println("------------------------------");


    }
}
