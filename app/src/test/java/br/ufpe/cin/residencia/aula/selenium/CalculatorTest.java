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

    WebElement um, dois, tres, quatro, cinco, seis, sete;//...
    WebElement mais, menos, multiplica, divide, igualA, display;

    @BeforeEach
    void setup() {
        //precisa trocar para o caminho onde encontra o arquivo chromedriver no seu computador
        String caminhoChromeDriver = "/Users/leopoldomt/chromedriver";
        //Configurar ambiente (aqui não precisa mudar nada)
        System.setProperty("webdriver.chrome.driver", caminhoChromeDriver);
        driver = new ChromeDriver();
        driver.get(SITE_CALCULADORA);
        dois = driver.findElement(By.name("two"));
        mais = driver.findElement(By.name("add"));
        igualA = driver.findElement(By.name("calculate"));
        display = driver.findElement(By.cssSelector("input#display"));
        String um = "um";

    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void testaDoisMaisDois() throws InterruptedException {
        dois.click();
        Thread.sleep(500);
        mais.click();
        Thread.sleep(500);
        dois.click();
        Thread.sleep(500);
        igualA.click();
        Thread.sleep(500);
        String valorEsperado = "4";
        String valorCalculado = display.getAttribute("value");
        assertEquals(valorEsperado, valorCalculado);
        //display.getText() não funciona, pois estamos tratando de uma tag
        //<input value="4" />
        //getText() serve para pegar o texto que está entre a abertura e o
        //fechamento, por ex.: <p>algum texto</p>
    }


}
