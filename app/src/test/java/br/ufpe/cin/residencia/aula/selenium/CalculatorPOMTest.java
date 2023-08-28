package br.ufpe.cin.residencia.aula.selenium;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

import static br.ufpe.cin.residencia.aula.selenium.CalculatorPOM.clicar;
import static br.ufpe.cin.residencia.aula.selenium.CalculatorPOM.clicarBotoes;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CalculatorPOMTest {
    CalculatorPOM pom;

    @BeforeAll
    void setupClass() {
//        //precisa trocar para o caminho onde encontra o arquivo chromedriver no seu computador
//        String caminhoChromeDriver = "/Users/leopoldomt/chromedriver";
//        //Configurar ambiente (aqui não precisa mudar nada)
//        System.setProperty("webdriver.chrome.driver", caminhoChromeDriver);
        pom = new CalculatorPOM(new ChromeDriver());
    }

    @AfterAll
    void tearDownClass() {
        pom.encerrar();
    }

    @AfterEach
    void tearDown() {
        clicar(pom.limpar);
    }

    @Test
    void testaDoisMaisDois() throws InterruptedException {
        pom.dois.click();
        Thread.sleep(500);
        clicar(pom.soma);
        Thread.sleep(500);
        clicar(pom.dois);
        Thread.sleep(500);
        clicar(pom.igualA);
        Thread.sleep(500);
        String valorEsperado = "4";
        assertEquals(valorEsperado, pom.resultadoVisivel());
        //display.getText() não funciona, pois estamos tratando de uma tag
        //<input value="4" />
        //getText() serve para pegar o texto que está entre a abertura e o
        //fechamento, por ex.: <p>algum texto</p>
    }

    @Test
    void testaDoisMaisTresPOM() throws InterruptedException {
        pom.somar(pom.dois, pom.tres);
        Thread.sleep(1000);
        String valorEsperado = "5";
        assertEquals(valorEsperado, pom.resultadoVisivel());
    }
    @Test
    void testaVinteDoisMaisTrezentosCinquentaTresPOM() throws InterruptedException {
        List<WebElement> esquerda = new ArrayList<>();
        List<WebElement> direita = new ArrayList<>();
        esquerda.add(pom.dois); esquerda.add(pom.dois);
        direita.add(pom.tres); direita.add(pom.cinco);direita.add(pom.tres);
        pom.somar(esquerda, direita);
        Thread.sleep(1000);
        String valorEsperado = "375";
        assertEquals(valorEsperado, pom.resultadoVisivel());
    }
    @Test
    void testaNoveVezesDois() throws InterruptedException {
        pom.nove.click();
        Thread.sleep(500);
        clicar(pom.multiplicacao);
        Thread.sleep(500);
        clicar(pom.dois);
        Thread.sleep(500);
        clicar(pom.igualA);
        Thread.sleep(500);
        String valorEsperado = "18";
        assertEquals(valorEsperado, pom.resultadoVisivel());
        //display.getText() não funciona, pois estamos tratando de uma tag
        //<input value="4" />
        //getText() serve para pegar o texto que está entre a abertura e o
        //fechamento, por ex.: <p>algum texto</p>
    }

//    4+8+15+16+23+42-37*2 = 142
    @Test void testeMaisLongo() throws InterruptedException {
//        clicar(pom.quatro);
//        clicar(pom.soma);
//        clicar(pom.oito);//...
        clicarBotoes(
                pom.quatro,
                pom.soma,
                pom.oito,
                pom.soma,
                pom.um, pom.cinco,
                pom.soma,
                pom.um, pom.seis,
                pom.soma,
                pom.dois, pom.tres,
                pom.soma,
                pom.quatro, pom.dois,
                pom.subtracao,
                pom.tres, pom.sete,
                pom.multiplicacao,
                pom.dois,
                pom.igualA);
        Thread.sleep(1000);
        String valorEsperado = "142";
        assertEquals(valorEsperado, pom.resultadoVisivel());
    }
//            (300/2)*5 = 750


}
