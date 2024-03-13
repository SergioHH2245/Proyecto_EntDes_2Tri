import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void sumar() {
        double sum1=10.0;
        double sum2=19.897;
        double expResult= 29.897;
        double result= Main.sumar(sum1, sum2);
        assertEquals(expResult, result);

    }

    @org.junit.jupiter.api.Test
    void restar() {
    }

    @org.junit.jupiter.api.Test
    void multiplicar() {
    }

    @org.junit.jupiter.api.Test
    void dividir() {
    }
}