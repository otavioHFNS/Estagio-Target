/*
 * Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a 
 * soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), 
 * escreva um programa na linguagem que desejar onde, informado um número, ele calcule 
 * a sequência de Fibonacci e retorne uma mensagem avisando se o número informado 
 * pertence ou não a sequência.
 */

 public class Teste2 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int numero = 13; 

        if (numero == 0 || numero == 1) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            int contador = 2; 
            int soma;

            while (true) {
                soma = a + b;
                a = b;
                b = soma;
                contador++;

                if (soma == numero) {
                    System.out.println(numero + " pertence à sequência de Fibonacci.");
                    break;
                } else if (soma > numero) {
                    System.out.println(numero + " não pertence à sequência de Fibonacci.");
                    break;
                }
            }
        }
    }
}
