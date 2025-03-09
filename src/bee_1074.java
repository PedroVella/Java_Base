import java.util.Scanner;

/*
Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida.
Para cada valor lido, mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD),
positivo (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0), embora
a descrição correta seja (EVEN NULL), pois por definição zero é par, seu programa deverá imprimir apenas NULL.
 */

public class bee_1074 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de N: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++){
            System.out.println("Digite um valor");
            int x = sc.nextInt();

            if (x == 0){
                System.out.println("NULL");
            }
            else if (x % 2 == 0) {
                System.out.print("EVEN ");
            }
            else {
                System.out.print("ODD ");
            }

            if (x > 0){
                System.out.println("POSITIVE");
            }
            else if (x < 0) {
                System.out.println("NEGATIVE");
            }
        }

    }
}
