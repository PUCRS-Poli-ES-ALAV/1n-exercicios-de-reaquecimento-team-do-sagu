import java.util.*;

public class Main {
    public static void main(String[] args) {
        exerc1 calc = new exerc1();
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = in.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int b = in.nextInt();
        
        int resultado = calc.multiplicacao1(a, b);
        int somaResultado = calc.soma(a, b);
        System.out.println("Resultado da multiplicação: " + resultado);
        System.out.println("Resultado da soma: " + somaResultado);


        System.out.print("Digite o denominador da fração: ");
        double denominador = in.nextDouble();

        double resultadoFracao = calc.somaFracao( denominador);
        System.out.println("Resultado da soma da fração: " + resultadoFracao);

        System.out.print("Digite uma string para inverter: ");
        String str = in.nextLine();
        in.nextLine();
        String resultadoInversao = calc.inverteString(str);
        System.out.println("Resultado da inversão da string: " + resultadoInversao);
        System.out.println("Digite uma palavra para verificar se é palíndromo: ");
        String palavra = in.nextLine();
        boolean resultadoPalindromo = calc.ehPalindrome(palavra);
        System.out.println("A palavra é um palíndromo? " + resultadoPalindromo);
    }
}