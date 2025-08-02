public class exerc1 {
    public int multiplicacao1(int a, int b) {
        if (b == 0 || a == 0) {
            return 0;
        }
        return a + multiplicacao1(a, b - 1);
    }

    public int soma(int a, int b) {
        int resultado = 0;
        if (a > 0 || b < 0 ) {
            resultado = soma(a + 1, b - 1);
        }
        if (a < 0 || b > 0) {
            resultado = soma(a - 1, b + 1);
        }
        return resultado;

    }
}
