import java.util.Scanner;

/*
Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D
for maior que a soma de A e B e se C e D, ambos, forem positivos e se a variável A for par escrever a mensagem
"Valores aceitos", senão escrever "Valores nao aceitos".
 */

public class bee_1035 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c, d;

        System.out.println("Digite o valor de A: ");
        a = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        b = sc.nextInt();
        System.out.println("Digite o valor de C: ");
        c = sc.nextInt();
        System.out.println("Digite o valor de D: ");
        d = sc.nextInt();



        if (b > c && d > a && c + d > a + b && c >= 0 && d >= 0 && a % 2 == 0) {
            System.out.println("Valores aceitos");
        }
        else {
            System.out.println("Valores não aceitos");
        }
    }
}
