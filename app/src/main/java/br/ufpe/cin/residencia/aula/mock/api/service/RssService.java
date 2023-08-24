package br.ufpe.cin.residencia.aula.mock.api.service;

import java.util.List;

public interface RssService {
    List<String> getNoticias(String link);
    void deletarNoticia(String titulo);
}
