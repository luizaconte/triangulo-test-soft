package uftpr.prova.provatestsoft;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrianguloTest {

    @Test
    void testGetters() {
        Triangulo triangulo = new Triangulo(3, 4, 5);
        assertEquals(3, triangulo.getLadoA());
        assertEquals(4, triangulo.getLadoB());
        assertEquals(5, triangulo.getLadoC());
    }

    @Test
    void testTrianguloEscalenoValido() {
        Triangulo triangulo = new Triangulo(3, 4, 5);
        assertEquals(TipoTriangulo.ESCALENO, triangulo.getTipoTriangulo());
    }

    @Test
    void testTrianguloIsoscelesValido() {
        Triangulo triangulo = new Triangulo(5, 5, 3);
        assertEquals(TipoTriangulo.ISOSCELES, triangulo.getTipoTriangulo());
    }

    @Test
    void testTrianguloEquilateroValido() {
        Triangulo triangulo = new Triangulo(7, 7, 7);
        assertEquals(TipoTriangulo.EQUILATERO, triangulo.getTipoTriangulo());
    }

    @Test
    void testTrianguloIsoscelesPermutacao1() {
        Triangulo triangulo = new Triangulo(5, 5, 3);
        assertEquals(TipoTriangulo.ISOSCELES, triangulo.getTipoTriangulo());
    }

    @Test
    void testTrianguloIsoscelesPermutacao2() {
        Triangulo triangulo = new Triangulo(5, 3, 5);
        assertEquals(TipoTriangulo.ISOSCELES, triangulo.getTipoTriangulo());
    }

    @Test
    void testTrianguloIsoscelesPermutacao3() {
        Triangulo triangulo = new Triangulo(3, 5, 5);
        assertEquals(TipoTriangulo.ISOSCELES, triangulo.getTipoTriangulo());
    }

    @Test
    void testTrianguloComUmLadoZero() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new Triangulo(1, 2, 0);
        });
        assertEquals("Os lados devem ser positivos.", thrown.getMessage());
    }

    @Test
    void testTrianguloComLadoAZero() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new Triangulo(0, 5, 5);
        });
        assertEquals("Os lados devem ter valores positivos.", thrown.getMessage());
    }

    @Test
    void testTrianguloComLadoANegativo() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new Triangulo(-1, 5, 5);
        });
        assertEquals("Os lados devem ter valores positivos.", thrown.getMessage());
    }

    @Test
    void testTrianguloComLadoBZero() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new Triangulo(5, 0, 5);
        });
        assertEquals("Os lados devem ter valores positivos.", thrown.getMessage());
    }

    @Test
    void testTrianguloComLadoBNegativo() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new Triangulo(5, -1, 5);
        });
        assertEquals("Os lados devem ter valores positivos.", thrown.getMessage());
    }

    @Test
    void testTrianguloComLadoCZero() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new Triangulo(5, 5, 0);
        });
        assertEquals("Os lados devem ter valores positivos.", thrown.getMessage());
    }

    @Test
    void testTrianguloComLadoCNegativo() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new Triangulo(5, 5, -1);
        });
        assertEquals("Os lados devem ter valores positivos.", thrown.getMessage());
    }

    @Test
    void testTrianguloComTodosLadosZero() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new Triangulo(0, 0, 0);
        });
        assertEquals("Os lados devem ter valores positivos.", thrown.getMessage());
    }

    @Test
    void testTrianguloComDoisLadosZero() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new Triangulo(0, 0, 5);
        });
        assertEquals("Os lados devem ter valores positivos.", thrown.getMessage());
    }

    @Test
    void testTrianguloComDoisLadosNegativos() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new Triangulo(-1, -1, 5);
        });
        assertEquals("Os lados devem ter valores positivos.", thrown.getMessage());
    }

    @Test
    void testTrianguloComUmLadoNegativo() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new Triangulo(1, 2, -3);
        });
        assertEquals("Os lados do triângulo devem ser positivos.", thrown.getMessage());
    }

    @Test
    void testTrianguloSomaLadosIgualTerceiroLadoPermutacao1() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new Triangulo(1, 2, 3);
        });
        assertEquals("A soma de dois lados deve ser maior que o terceiro lado para formar um triângulo.", thrown.getMessage());
    }

    @Test
    void testTrianguloSomaLadosIgualTerceiroLadoPermutacao2() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new Triangulo(2, 3, 1);
        });
        assertEquals("A soma de dois lados deve ser maior que o terceiro lado para formar um triângulo.", thrown.getMessage());
    }

    @Test
    void testTrianguloSomaLadosIgualTerceiroLadoPermutacao3() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new Triangulo(3, 1, 2);
        });
        assertEquals("A soma de dois lados deve ser maior que o terceiro lado para formar um triângulo.", thrown.getMessage());
    }

    @Test
    void testTrianguloSomaLadosMenorTerceiroLadoPermutacao1() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new Triangulo(1, 2, 5);
        });
        assertEquals("A soma de dois lados deve ser maior que o terceiro lado para formar um triângulo.", thrown.getMessage());
    }

    @Test
    void testTrianguloSomaLadosMenorTerceiroLadoPermutacao2() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new Triangulo(5, 1, 2);
        });
        assertEquals("A soma de dois lados deve ser maior que o terceiro lado para formar um triângulo.", thrown.getMessage());
    }

    @Test
    void testTrianguloSomaLadosMenorTerceiroLadoPermutacao3() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new Triangulo(2, 5, 1);
        });
        assertEquals("A soma de dois lados deve ser maior que o terceiro lado para formar um triângulo.", thrown.getMessage());
    }

    @Test
    void testTrianguloComTresLadosZero() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            new Triangulo(0, 0, 0);
        });
        assertEquals("Os lados do triângulo devem ser valores positivos.", thrown.getMessage());
    }
}
