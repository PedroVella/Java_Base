import java.util.Scanner;

/*
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha,
inclusive o X, se for o caso.
 */

public class bee_1067 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X;

        System.out.print("Digite o valor de X: ");
        X = sc.nextInt();

        for (int i = 1; i <= X; i++) {
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
