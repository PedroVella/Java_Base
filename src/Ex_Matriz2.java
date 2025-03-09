import java.util.Scanner;

/*
Fazer um programa para ler dois números inteiros M e N. Em seguida, ler uma matriz
de M linhas e N colunas contendo números double. Gerar um vetor de modo que cada
elemento do vetor seja a soma dos elementos da linha correspondente da matriz.
Mostrar o vetor gerado.
 */

public class Ex_Matriz2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de M: ");
        int m = sc.nextInt();

        System.out.println("Digite o valor de N: ");
        int n = sc.nextInt();

        double[][] mat = new double[m][n];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){

                System.out.println("Digite o valor da Matriz " + i + " " + j + ": ");
                mat[i][j] = sc.nextDouble();
            }
        }

        double[] vet = new double[m];

        for (int i = 0; i < m; i++){

            double soma = 0.0;

            for (int j = 0; j < n; j++){

                soma += mat[i][j];

            }
            vet[i] = soma;
        }

        for (int i = 0; i < m; i++){
            System.out.printf("%.1f\n", vet[i]);
        }
    }
}
