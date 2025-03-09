import java.util.Scanner;

/*
Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto
 de C e D
 */

public class bee_1007 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A, B, C, D, dif;

        System.out.println("Digite o valor de A: ");
        A = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        B = sc.nextInt();
        System.out.println("Digite o valor de C: ");
        C = sc.nextInt();
        System.out.println("Digite o valor de D: ");
        D = sc.nextInt();

        dif = (A * B - C * D);

        System.out.println("DIFERENCA = " + dif);

    }
}
