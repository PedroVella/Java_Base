import java.util.Scanner;

/*
Leia uma quantidade indeterminada de duplas de valores inteiros x e y.
Escreva para cada x e y uma mensagem que indique se esses valores foram digitados em ordem crescente ou decrescente.
 */

public class bee_1113 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        System.out.println("Digite o valor de X: ");
        x = sc.nextInt();
        System.out.println("Digite o valor Y: ");
        y = sc.nextInt();

        while (x != y) {
            if (x < y){
                System.out.println("Crescente");
            }
            else {
                System.out.println("Decrescente");
            }
            System.out.println("Digite o valor de X: ");
            x = sc.nextInt();
            System.out.println("Digite o valor Y: ");
            y = sc.nextInt();
        }
    }
}
