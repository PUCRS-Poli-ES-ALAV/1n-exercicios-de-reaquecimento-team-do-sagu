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
    }
}