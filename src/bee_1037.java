import java.util.Scanner;

/*
Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos
([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum destes
intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

O símbolo ( representa "maior que". Por exemplo:
[0,25]  indica valores entre 0 e 25.0000, inclusive eles.
(25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000
 */

public class bee_1037 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num;

        System.out.println("Digite um numero: ");
        num = sc.nextDouble();

        if (num < 0.0 || num > 100.0) {
            System.out.println("Fora de intervalo");
        }
        else if (num <= 25) {
            System.out.println("Intervalo (0,25]");
        }
        else if (num <= 50) {
            System.out.println("Intervalo (25,50]");
        }
        else if (num <= 75) {
            System.out.println("Intervalo (50,75]");
        }
        else {
            System.out.println("Intervalo (75,100]");
        }
    }
}
