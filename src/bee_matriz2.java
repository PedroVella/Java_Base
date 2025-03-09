import java.util.Scanner;

/*
Ler um número N e depois uma matriz quadrada NxN com números inteiros. Depois, mostrar na tela a soma dos
elementos de cada linha da matriz.
 */

public class bee_matriz2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de N: ");
        int N = sc.nextInt();

        int[][] mat = new int[N][N];

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){

                System.out.println("Digite o valor da Matriz " + i + " " + j + ": ");
                mat[i][j] = sc.nextInt();
            }
        }

        int[] vet = new int[N];

        for (int i = 0; i < N; i++){
            int soma = 0;
            for (int j = 0; j < N; j++){
                soma += mat[i][j];
            }
            vet[i] = soma;
        }

        for (int i = 0; i < N; i++){
            System.out.println(vet[i]);
        }
    }
}
