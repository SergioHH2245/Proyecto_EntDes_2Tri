import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void sumar() {
        double sum1 = 10.0;
        double sum2 = 19.897;
        double expResult = 29.897;
        double result = Main.sumar(sum1, sum2);
        assertEquals(expResult, result);

        sum1 = 43;
        sum2 = 22;
        expResult = 65.0;
        result = Main.sumar(sum1, sum2);
        assertEquals(expResult, result);

    }

    @ParameterizedTest(name = "Si la primera cifra es {0} y la segunda es {1}, el resultado es {2} ")
    @CsvSource({"5, 15, 20.0"})
    void pruebaSuma(double sum1, double sum2, double expRresult) {
        assertEquals(expRresult, Main.sumar(sum1, sum2), 0.1);
    }


    @org.junit.jupiter.api.Test
    void restar() {
        double rest1 = 25.5;
        double rest2 = 15.0;
        double expResult = 10.5;
        double result = Main.restar(rest1, rest2);
        assertEquals(expResult, result);

        rest1 = 43;
        rest2 = 22;
        expResult = 21.0;
        result = Main.restar(rest1, rest2);
        assertEquals(expResult, result);

    }

    @ParameterizedTest(name = "Si la primera cifra es {0} y la segunda es {1}, el resultado es {2} ")
    @CsvSource({"96, 13, 83.0"})
    void pruebaResta(double rest1, double rest2, double expResult) {
        assertEquals(expResult, Main.restar(rest1, rest2), 0.1);
    }


    @org.junit.jupiter.api.Test
    void multiplicar() {
    }

    @org.junit.jupiter.api.Test
    void dividir() {
    }
}