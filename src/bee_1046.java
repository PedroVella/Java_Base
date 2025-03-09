import java.util.Scanner;

/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar
em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */

public class bee_1046 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inicio, fim, total;

        System.out.println("Digite a hora que começou a jogar: ");
        inicio = sc.nextInt();
        System.out.println("Digite a hora que parou de jogar: ");
        fim = sc.nextInt();

        if (inicio < fim) {
            total = fim - inicio;
        }
        else {
            total = 24 - inicio + fim;
        }

        System.out.println("O JOGO DUROU " + total + " HORA(S)");
    }
}
