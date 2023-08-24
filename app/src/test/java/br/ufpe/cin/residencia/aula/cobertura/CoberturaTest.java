package br.ufpe.cin.residencia.aula.cobertura;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CoberturaTest {
    Cobertura classUnderTest;

    @BeforeEach
    void setupClassUnderTest() {
        classUnderTest = new Cobertura();
    }

    @Test
    void f_TTT() {
        int resultado = classUnderTest.f(
                12,
                true, true, true
        );
        assertEquals(12, resultado);
    }

    @Test
    void f_FTT() {
        int resultado = classUnderTest.f(
                12,
                false, true, true
        );
        assertEquals(11, resultado);
    }

    @Test
    void f_FFF() {
        int resultado = classUnderTest.f(
                12,
                false, false, false
        );
        assertEquals(0, resultado);
    }

    //foo(0,2)
    @Test
    void foo_0_2() {
        int resultado = classUnderTest.foo(0,2);
        assertEquals(0, resultado);
    }

    //foo(4,0)
    @Test
    void foo_4_2() {
        int resultado = classUnderTest.foo(4,2);
        assertEquals(2, resultado);
    }

    @Test
    void foo_4_0() {
        int resultado = classUnderTest.foo(4,0);
        assertEquals(1, resultado);
    }

    @Test
    void foo_0_0() {
        int resultado = classUnderTest.foo(0,0);
        assertEquals(1, resultado);
    }

    @Test void m_2() {
        int resultado = classUnderTest.m(2);
        assertEquals(10, resultado);
    }

    @Test void m_3() {
        int resultado = classUnderTest.m(3);
        assertEquals(10, resultado);
    }

    @ParameterizedTest
    @ValueSource(ints = {0,1,2,3,4,5,6,7,8,9,10})
    void test_m_com_i_menor_que_10(int value) {
        int resultado = classUnderTest.m(value);
        assertEquals(10, resultado);
    }

    @ParameterizedTest
    @ValueSource(ints = {10,11,12,13,14,15,16,17,18,19,50,32,44,88,90,100})
    void test_m_com_i_maior_que_10(int value) {
        int resultado = classUnderTest.m(value);
        assertEquals(value, resultado);
    }

    @Test void m_12() {
        int resultado = classUnderTest.m(12);
        assertEquals(12, resultado);
    }

    @Test void fun_a_T() {
        int resultado = classUnderTest.fun(true);
        assertEquals(100, resultado);
    }

    @Test void fun_a_F() {
        assertThrows(
                ArithmeticException.class,
                () -> classUnderTest.fun(false)
        );
    }
}