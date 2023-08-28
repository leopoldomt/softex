package br.ufpe.cin.residencia.aula.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorPOM {
    private WebDriver driver;
    private final static String SITE_CALCULADORA = "https://www.theonlinecalculator.com";
    public WebElement display, um, dois, tres, quatro, cinco, seis, sete, oito, nove, zero, soma, subtracao, divisao, multiplicacao, igualA, limpar;//... tem mais botões na calculadora online

    public CalculatorPOM(WebDriver d) {
        this.driver = d;
        this.driver.get(SITE_CALCULADORA);
        um = this.driver.findElement(By.name("one"));
        dois = this.driver.findElement(By.name("two"));
        tres = botaoPeloNome("three");
        quatro = botaoPeloNome("four");
        cinco = botaoPeloNome("five");
        seis = botaoPeloNome("six");
        sete = botaoPeloNome("seven");
        oito = botaoPeloNome("eight");
        nove = botaoPeloNome("nine");
        zero = botaoPeloNome("zero");
        soma = botaoPeloNome("add");
        subtracao = botaoPeloNome("subtract");
        divisao = botaoPeloNome("divide");
        multiplicacao = botaoPeloNome("multiply");
        igualA = botaoPeloNome("calculate");
        limpar = botaoPeloNome("clearButton");
        display = driver.findElement(By.cssSelector("input#display"));
    }

    public void somar(WebElement op1, WebElement op2) {
        op1.click();
        soma.click();
        op2.click();
        igualA.click();
    }

    public void somar(List<WebElement> op1, List<WebElement> op2) {
        for (WebElement op: op1){
            op.click();
        }
        soma.click();
        for (WebElement op: op2){
            op.click();
        }
        igualA.click();
    }

    public String resultadoVisivel() {
        return this.display.getAttribute("value");
    }

    public static void clicar(WebElement e) {
        e.click();
    }

    public void encerrar() {
        this.driver.quit();
    }

    public static void clicarBotoes(WebElement... elementos) throws InterruptedException {
        for (WebElement e : elementos) {
            e.click();
            Thread.sleep(300);
        }
    }



    private WebElement botaoPeloNome(String nome) {
        return this.driver.findElement(By.name(nome));
    }
}
