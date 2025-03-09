import java.util.Scanner;

/*
Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.
 */

public class Ex_For2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X, Y;

        System.out.println("Digite o valor de X: ");
        X = sc.nextInt();
        System.out.println("Digite o valor de Y: ");
        Y = sc.nextInt();

        int min, max;

        if (X < Y) {
            min = X;
            max = Y;
        }
        else {
            min = Y;
            max = X;
        }

        int soma = 0;
        for (int i = min + 1; i < max; i++){
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println(soma);
    }
}
