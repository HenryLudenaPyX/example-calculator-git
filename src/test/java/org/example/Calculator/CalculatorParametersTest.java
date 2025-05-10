package org.example.Calculator;

import org.example.Calculator.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

//Siempre ejecutandose (indicar que es parametrizado)
@RunWith(value = Parameterized.class)
public class CalculatorParametersTest {
    private int a, b, expected;

    @Parameterized.Parameters
    //Varios parametros (casos de prueba) para ejecutar en pruebas
    public static Iterable<Object[]> parameters() {
        List<Object[]> objects = new ArrayList<Object[]>();
        //Parametro a, b, valor esperado
        objects.add(new Object[] { 2, 4, 6});
        objects.add(new Object[] { 1, 8, 9});
        objects.add(new Object[] { 2, 5, 7});
        objects.add(new Object[] { 7, 3, 10});
        objects.add(new Object[] { 22, 4, 26});
        objects.add(new Object[] { 12, 14, 26});
        return objects;
    }

    public CalculatorParametersTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void given_two_integers_when_addition_then_ok() {
        Calculator c = new Calculator();
        int actual = c.add(a, b);
        assertEquals(expected, actual);
    }

}