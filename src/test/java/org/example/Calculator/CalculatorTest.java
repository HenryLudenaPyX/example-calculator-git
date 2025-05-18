package org.example.Calculator;

import org.example.Calculator.Calculator;
import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc = null;

    //Se ejecuta una sola vez, antes que se ejecute clase
    @BeforeClass
    public static void setUpClass(){
        System.out.println("SetUpClass()");
    }

    //Ejecuta este metodo antes de los @Test
    @Before
    public void setUp(){
        calc = new Calculator();
        System.out.println("SetUp()");
    }
    @Test
    public void given_two_integers_when_addition_then_ok() {
        assertEquals(30, calc.add(10, 20));
        System.out.println("Test1()");
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok() {
        assertEquals(-10, calc.subtract(10, 20));
        System.out.println("Test2()");
    }

    //El expected le dice que se espera error aritmetico
    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_division_then_ok() {
        assertEquals(20, calc.division(10, 0));
        System.out.println("Test3()");
    }

    //Timeout: Espera un tiempo antes de dar un error
    @Test(timeout = 150)
    public void given_two_integers_when_multiplication_then_ok() {
        assertEquals(200, calc.multiply(10, 20));
        System.out.println("Test4()");
    }

    //Se ejecuta despues de cada prueba
    @After
    public void tearDown(){
        System.out.println("TearDown()");
        calc.setAns(0);
        calc = null;
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("TearDownClass()");
    }



}
