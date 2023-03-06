

package fibonacci;

import java.util.Scanner;


public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se ele pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        int a = 0;
        int b = 1;
        int fibonacci = 0;
        
        while (fibonacci < numero) {
            fibonacci = a + b;
            a = b;
            b = fibonacci;
        }

        if (fibonacci == numero) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

}
