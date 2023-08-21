/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package br.ufpe.cin.residencia.aula;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(
                classUnderTest.getGreeting(),
                "Deveria vir algo diferente de nulo"
        );
    }


    @Test void appGreetingSays() {
        App classUnderTest = new App();
        String msg = classUnderTest.getGreeting();
        assertEquals(
                "Olá, mundo!",
                msg,
                "A mensagem de saudação deveria ser 'Olá, mundo!'"
        );
    }
}
