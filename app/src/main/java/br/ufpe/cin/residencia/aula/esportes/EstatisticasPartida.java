package br.ufpe.cin.residencia.aula.esportes;

public class EstatisticasPartida {
    public Integer getGols() {
        return gols;
    }

    public void setGols(Integer gols) {
        this.gols = gols;
    }

    public Integer getCartoesAmarelos() {
        return cartoesAmarelos;
    }

    public void setCartoesAmarelos(Integer cartoesAmarelos) {
        this.cartoesAmarelos = cartoesAmarelos;
    }

    public Integer getCartoesVermelhos() {
        return cartoesVermelhos;
    }

    public void setCartoesVermelhos(Integer cartoesVermelhos) {
        this.cartoesVermelhos = cartoesVermelhos;
    }

    private Integer gols = 0;
    private Integer cartoesAmarelos = 0;
    private Integer cartoesVermelhos = 0;

    public void marcarGol() {
        this.gols++;
    }
    public void levarAmarelo() {
        this.cartoesAmarelos++;
    }
    public void levarVermelho() {
        this.cartoesVermelhos++;
    }
}
