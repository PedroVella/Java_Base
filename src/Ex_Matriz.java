import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro N e uma matriz quadrada de ordem N
contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade
de valores negativos da matriz.
*/

public class Ex_Matriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de N: ");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){

                System.out.println("Digite o valor da Matriz " + i + " " + j + ": ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("DIAGONAL PRINCIPAL:");

        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int cont = 0;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){

                if (mat[i][j] < 0){
                    cont++;
                }
            }
        }

        System.out.println("QUANTIDADE DE NEGATIVOS = " + cont);
    }
}
