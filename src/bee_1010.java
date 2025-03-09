import java.util.Locale;
import java.util.Scanner;

/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código
de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.
 */

public class bee_1010 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int cod1, num1, cod2, num2;
        double valor1, valor2, total;

        System.out.println("Digite, com espacamento, respectivamente, o codigo da peca 1, a quantidade da pecas 1 e valor da peca 1: ");
            cod1 = sc.nextInt();
            num1 = sc.nextInt();
            valor1 = sc.nextDouble();
        System.out.println("Digite, com espacamento, respectivamente, o codigo da peca 2, a quantidade da pecas 2 e valor da peca 2: ");
            cod2 = sc.nextInt();
            num2 = sc.nextInt();
            valor2 = sc.nextDouble();

        total = (num1 * valor1) + (num2 * valor2);


        System.out.printf("VALOR A PAGAR: R$ %.2f \n", total);
    }
}
