import java.util.Scanner;

/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20]
e quantos estão fora do intervalo, mostrando essas informações.
 */

public class bee_1072 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, in = 0, out = 0;

        System.out.print("Digite o valor de N: ");
        N = sc.nextInt();

        for (int i = 0; i < N; i++){

            System.out.print("Digite um numero: ");
            int X = sc.nextInt();


            if (X >= 0 && X <= 20) {

                in += 1;
            }
            else {

                out += 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
