package br.ufpe.cin.residencia.aula.mock.business;

import br.ufpe.cin.residencia.aula.mock.api.service.RssService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RssBusinessImplTest {

    RssBusinessImpl regraNegocio;
    RssService rssService;
    List<String> noticias;

    @BeforeEach
    void setUp() {
        noticias = new ArrayList<>();
        noticias.add("Nova versao de Python lançada!");
        noticias.add("Conheça tudo sobre Python 4!");
        noticias.add("Java é melhor que Python?");
        noticias.add("MC Pipoquinha faz show no Faustão");
        noticias.add("Briga de boxe com Leopoldo vs. Henrique, WO!");
        noticias.add("Campeonato de troca de fraldas, Leopoldo vs. Henrique");
        noticias.add("Aprenda Python em 24 horas");
        rssService = mock(RssService.class);
        regraNegocio = new RssBusinessImpl(rssService);
//        when(rssService.getNoticias("globo.com")).thenReturn(noticias);
        when(rssService.getNoticias(Mockito.anyString())).thenReturn(noticias);
//        System.out.println(rssService.getNoticias("qualquer coisa"));
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getNoticiasPython() {
        List<String> noticias = regraNegocio.getNoticiasPython("globo.com");
        assertEquals(
                4,
                noticias.size()
        );
    }

    @Test
    void getNoticiasPythonOutroSite() {
        List<String> noticias = regraNegocio.getNoticiasPython("uol.com.br");
        assertEquals(
                0,
                noticias.size()
        );
    }

    @Test
    void verificarQueServiceFoiChamado() {
        List<String> noticias = regraNegocio.getNoticiasPython("uol.com.br");
        verify(rssService).getNoticias("uol.com.br");
    }

    @Test
    void verificarDelete() {
        regraNegocio.deletarNoticiasPipoquinha("globo.com");
        verify(rssService).deletarNoticia("MC Pipoquinha faz show no Faustão");
        verify(rssService, never()).deletarNoticia("Campeonato de troca de fraldas, Leopoldo vs. Henrique");
    }
}