package br.ufpe.cin.residencia.aula.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    WebDriver driver;
    private final static String SITE_CALCULADORA = "https://www.theonlinecalculator.com";


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
    void testaOperacao() {
        driver.get(SITE_CALCULADORA);

    }

    
}
