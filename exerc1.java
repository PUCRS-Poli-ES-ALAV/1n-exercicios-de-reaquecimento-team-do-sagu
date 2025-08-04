public class exerc1 {
    public int multiplicacao1(int a, int b) {
        if (b == 0 || a == 0) {
            return 0;
        }
        return a + multiplicacao1(a, b - 1);
    }

    public int soma(int a, int b) {
        if(b == 0) {
            return a;
        }if(a == 0) {
            return b;
        }
        return soma(a + 1, b - 1);
    }

    public double somaFracao(double denominador){
        if (denominador == 0) {
            return 0;
        }
        return 1.0 / denominador + somaFracao(denominador - 1);
    }

    public String inverteString(String str){
        if (str.isEmpty()) {
            return str;
        }
        return inverteString(str.substring(1)) + str.charAt(0);
    }

    public int geradorDeSequencia(int n){
        if(n<=0){
            return 0;
        } else if(n == 1) {
            return 1;
        } else if(n == 2) {
            return 1;
        }
        return 2*geradorDeSequencia(n-1) + 3*geradorDeSequencia(n-2);
    }

    public boolean ehPalindrome(String str){
        int inicio = 0;

        int fim = str.length()-1;
        if(inicio<fim){
            if(str.charAt(inicio) != str.charAt(fim)){
                return false;
            }
            return ehPalindrome(str.substring(inicio + 1, fim));
        } else {
            return true;
        }
    }

}
