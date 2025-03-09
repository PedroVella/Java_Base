import java.util.Scanner;

/*
Ler dois números M e N, e depois ler uma matriz MxN de números inteiros, conforme exemplo. Em seguida, mostrar
na tela somente os números negativos da matriz.
 */

public class bee_matriz1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de M: ");
        int M = sc.nextInt();

        System.out.println("Digite o valor de N: ");
        int N = sc.nextInt();

        int[][] num = new int[M][N];

        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){

                System.out.println("Digite o valor da Matriz " + i + " " + j + ": ");
                num[i][j] = sc.nextInt();

            }
        }

        System.out.println("VALORES NEGATIVOS:");

        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++){

                if (num[i][j] < 0){
                    System.out.println(num[i][j]);
                }
            }
        }

    }
}
