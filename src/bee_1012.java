import java.util.Scanner;

/*
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */

public class bee_1012 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        System.out.printf("Digite o valor de A: ");
        A = sc.nextDouble();
        System.out.printf("Digite o valor de B: ");
        B = sc.nextDouble();
        System.out.printf("Digite o valor de C: ");
        C = sc.nextDouble();

        triangulo = A * C / 2.0;
        circulo = C * C * 3.14159;
        trapezio = (A + B) * C / 2.0;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f \n", triangulo);
        System.out.printf("CIRCULO: %.3f \n", circulo);
        System.out.printf("TRAPEZIO: %.3f \n", trapezio);
        System.out.printf("QUADRADO: %.3f \n", quadrado);
        System.out.printf("RETANGULO: %.3f \n", retangulo);



    }
}
