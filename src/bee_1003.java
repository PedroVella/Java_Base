import java.util.Scanner;

/*Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas
 e atribua à variável SOMA. A seguir escrever o valor desta variável.*/

public class bee_1003 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, soma;

        System.out.println("Digite o valor inteiro de A: ");
        A = sc.nextInt();
        System.out.println("Digite o valor inteiro de B: ");
        B = sc.nextInt();

        soma = A + B;

        System.out.println("SOMA = " + soma);

    }
}
