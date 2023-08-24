package br.ufpe.cin.residencia.aula.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest {
    WebDriver driver;

    @BeforeEach
    void setup() {
        //precisa trocar para o caminho onde encontra o arquivo chromedriver no seu computador
        String caminhoChromeDriver = "/Users/leopoldomt/chromedriver";
        //Configurar ambiente (aqui não precisa mudar nada)
        System.setProperty("webdriver.chrome.driver", caminhoChromeDriver);
        driver = new ChromeDriver();
    }
    @AfterEach
    void tearDown() {
        driver.quit();
    }
    @Test
    void testaTituloSiteCIn() {
        String tituloEsperado = "CIn – UFPE.";
        driver.get("https://www.cin.ufpe.br");
        String tituloDoSite = driver.getTitle();
        assertEquals(tituloEsperado, tituloDoSite);
    }

    //
    @Test
    void testaBuscarNoticiasSiteCIn() {
        driver.get("https://portal.cin.ufpe.br/category/noticia/");
        WebElement campoBusca = driver.findElement(By.tagName("input"));
        campoBusca.sendKeys("softex");
//        campoBusca.sendKeys(Keys.RETURN);//mesma coisa que digitar enter no campo de busca
        WebElement botaoBusca = driver.findElement(By.className("search-submit"));
        botaoBusca.click();
        WebElement textoCabecalho = driver.findElement(By.tagName("h1"));
        String texto = textoCabecalho.getText();
        assertEquals(
                "Resultados de pesquisa para: softex",
                texto
        );
    }
}
