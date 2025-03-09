import java.util.Scanner;

/*
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano.
Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de
duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 */

public class bee_1115 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva a coordenada X: ");
        int x = sc.nextInt();
        System.out.println("Escreva a coordenada de Y: ");
        int y = sc.nextInt();

        while (x != 0 && y != 0){

            if (x > 0 && y > 0) {
                System.out.println("\nPrimeiro \n");
            }
            else if (x < 0 && y > 0) {
                System.out.println("\nSegundo \n");
            }
            else if (x < 0) {
                System.out.println("\nTerceiro \n");
            }
            else {
                System.out.println("\nQuarto \n");
            }
            System.out.println("Escreva a coordenada X: ");
            x = sc.nextInt();
            System.out.println("Escreva a coordenada de Y: ");
            y = sc.nextInt();
        }
    }
}
