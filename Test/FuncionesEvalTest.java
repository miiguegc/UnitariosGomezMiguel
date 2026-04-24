import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FuncionesEvalTest {

    @Test
    void contarApariciones() {
        assertEquals(2, FuncionesEval.contarApariciones(new int[]{1, 2, 3, 1, 4}, 1));
        assertEquals(0, FuncionesEval.contarApariciones(new int[]{5, 6, 7}, 2));
        assertEquals(0, FuncionesEval.contarApariciones(new int[]{}, 5));
    }

    @Test
    void testEncontrarMayor() {
        assertEquals(5, FuncionesEval.encontrarMayor(new int[]{1, 3, 2, 5, 4}));
        assertEquals(-1, FuncionesEval.encontrarMayor(new int[]{-1, -2, -3, -4}));
        assertEquals(10, FuncionesEval.encontrarMayor(new int[]{10}));
        assertThrows(IllegalArgumentException.class, () -> FuncionesEval.encontrarMayor(new int[]{}));
        assertThrows(IllegalArgumentException.class, () -> FuncionesEval.encontrarMayor(null));
    }

    @Test
    void testEsPerfecto() {
        assertTrue(FuncionesEval.esPerfecto(6), "6 es perfecto");
        assertTrue(FuncionesEval.esPerfecto(28), "28 es perfecto");
        assertFalse(FuncionesEval.esPerfecto(10), "10 no es perfecto");
        assertFalse(FuncionesEval.esPerfecto(1), "1 no es perfecto");


        assertThrows(ArithmeticException.class, () -> FuncionesEval.esPerfecto(0));
        assertThrows(ArithmeticException.class, () -> FuncionesEval.esPerfecto(-6));
    }

    @Test
    void testGetTipoClima() {
        assertEquals("Frio", FuncionesEval.getTipoClima(5.0));
        assertEquals("Templado", FuncionesEval.getTipoClima(15.0));
        assertEquals("Caluroso", FuncionesEval.getTipoClima(30.0));
        assertEquals("Templado", FuncionesEval.getTipoClima(10.0));
    }

    @Test
    void testInvertirArray() {
        assertArrayEquals(new int[]{3, 2, 1}, FuncionesEval.invertirArray(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1}, FuncionesEval.invertirArray(new int[]{1}));
        assertArrayEquals(new int[]{}, FuncionesEval.invertirArray(new int[]{}));
    }
}