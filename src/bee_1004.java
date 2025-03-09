import java.util.Scanner;

/*Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores
e atribua esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente. */

public class bee_1004 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, PROD;

        System.out.println("Digite o valor de A:");
        A = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        B = sc.nextInt();

        PROD = A * B;

        System.out.println("PROD = " + PROD);


    }
}
