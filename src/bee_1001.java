import java.util.Scanner;

/*
Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado na
variável X. Imprima X conforme exemplo apresentado abaixo.
 */

public class bee_1001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int A, B, X;

        System.out.println("Digite o valor de A: ");
        A = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        B = sc.nextInt();

        X = A + B;

        System.out.println("X = " + X);

    }
}
