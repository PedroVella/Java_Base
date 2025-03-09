import java.util.Scanner;

/*
Faço um programa que leia N números reais e armazene o vetor. Em seguida, imprimir todos os elementos do vetor
e mostrar na tela a soma e a média dos elementos do vetor.
 */

public class Ex_Vetor2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de N: ");
        int n = sc.nextInt();
        double[] vet = new double[n];

        for (int i = 0; i < n; i++){

            System.out.println("Digite um valor: ");
            vet[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++){

            System.out.print(vet[i] + " ");
        }
        System.out.println();

        double soma = 0.0;

        for (int i = 0; i < n; i++){

            soma += vet[i];
        }

        System.out.printf("Soma: %.2f\n", soma);

        double media = soma / n;

        System.out.printf("Média: %.2f", media);
    }
}
