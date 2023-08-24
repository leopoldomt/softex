package br.ufpe.cin.residencia.aula.mock.business;

import br.ufpe.cin.residencia.aula.mock.api.service.RssService;

import java.util.ArrayList;
import java.util.List;

public class RssBusinessImpl {
    private RssService service;

    public RssBusinessImpl(RssService rssService) {
        this.service = rssService;
    }

    public List<String> getNoticiasPython(String link) {
        List<String> noticiasFiltradas = new ArrayList<>();
        List<String> todasAsNoticias = this.service.getNoticias(link);
        for (String noticia : todasAsNoticias) {
            if (noticia.contains("Python")) {
                noticiasFiltradas.add(noticia);
            }
        }
        return noticiasFiltradas;
    }

    public void deletarNoticiasPipoquinha(String link) {
        List<String> todasAsNoticias = this.service.getNoticias(link);
        for (String noticia : todasAsNoticias) {
            if (noticia.contains("Pipoquinha")) {
                this.service.deletarNoticia(noticia);
            }
        }
    }
}
