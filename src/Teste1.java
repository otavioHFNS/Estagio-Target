/* 1) Observe o trecho de código abaixo. Ao final do processamento, qual será o valor da variável SOMA?

int INDICE = 13, SOMA = 0, K = 0;
enquanto K < INDICE faça
{
K = K + 1;
SOMA = SOMA + K;
}
imprimir(SOMA);
 */

public class Teste1 {
    public static void main(String[] args) {
        int indice=13;
        int soma=0;
        int k=0;
        while (k<indice) {
            k = k + 1;
            soma = soma + k;
        }
        System.out.println(soma);
    }
}
