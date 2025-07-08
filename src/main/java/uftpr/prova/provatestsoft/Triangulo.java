package uftpr.prova.provatestsoft;

public class Triangulo {

    private int ladoA;
    private int ladoB;
    private int ladoC;

    public Triangulo(int ladoA, int ladoB, int ladoC) throws IllegalArgumentException {
        if (ladoA <= 0 || ladoB <= 0 || ladoC <= 0) {
            throw new IllegalArgumentException("Os lados devem ter valores positivos.");
        }
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        validarFormacaoTriangulo();
    }

    private void validarFormacaoTriangulo() throws IllegalArgumentException {
        if (!((ladoA + ladoB > ladoC) && (ladoA + ladoC > ladoB) && (ladoB + ladoC > ladoA))) {
            throw new IllegalArgumentException("A soma de dois lados deve ser maior que o terceiro lado para formar um triângulo.");
        }
    }

    public TipoTriangulo getTipoTriangulo() {
        if (ladoA == ladoB && ladoB == ladoC) {
            return TipoTriangulo.EQUILATERO;
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            return TipoTriangulo.ISOSCELES;
        } else {
            return TipoTriangulo.ESCALENO;
        }
    }

    public int getLadoA() {
        return ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }
}