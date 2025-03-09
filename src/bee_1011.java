import java.util.Scanner;

/*
Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R). A fórmula para
calcular o volume é: (4/3) * pi * R3. Considere (atribua) para pi o valor 3.14159.
*/

public class bee_1011 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double raio, volume;
        double pi = 3.14159;

        System.out.println("Digite o raio da esfera: ");
        raio = sc.nextDouble();

        volume = (double) 4/3 * pi * Math.pow(raio, 3.0);

        System.out.printf("VOLUME = %.3f \n", volume);
    }
}
