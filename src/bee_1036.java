import java.util.Scanner;

/*
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. Se não for possível calcular as
raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.
 */

public class bee_1036 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, C;

        System.out.println("Digite o valor de A: ");
        A = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        B = sc.nextDouble();
        System.out.println("Digite o valor de C: ");
        C = sc.nextDouble();

        double delta = B * B - 4.0 * A * C;

        if (A == 0 || delta < 0.0) {
            System.out.println("Impossivel calcular");
        }
        else {
            double r1 = (-B + Math.sqrt(delta)) / (2.0 * A);
            double r2 = (-B - Math.sqrt(delta)) / (2.0 * A);

            System.out.printf("R1 = %.5f \n", r1);
            System.out.printf("R2 = %.5f \n", r2);

        }

    }
}
