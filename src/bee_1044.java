import java.util.Scanner;

/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",
indicando se os valores lidos são múltiplos entre si.
 */

public class bee_1044 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o valor de A:");
        a = sc.nextInt();
        System.out.println("Digite o valor de B:");
        b = sc.nextInt();

        if (a % b == 0  || b % a == 0){
            System.out.println("São multiplos");
        }
        else {
            System.out.println("Não são multiplos");
        }
    }
}
