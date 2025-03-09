import java.util.Scanner;

/*
Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:
1 x N = N      2 x N = 2N        ...       10 x N = 10N
 */

public class Ex_For {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;

        System.out.println("Digite o valor de N:");
        N = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int produto = i * N;
            System.out.println(i + " x " + N + " = " + produto);
        }
    }
}
