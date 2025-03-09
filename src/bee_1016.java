import java.util.Scanner;

/*
Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.

Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja, consegue se afastar um quilômetro a cada 2 minutos.

Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro.
 */

public class bee_1016 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int km, min;

        System.out.println("Digite a distancia que vc quer do carro Y para o X em KM: ");
        km = sc.nextInt();

        min = km * 2;

        System.out.println(min + " minutos");

    }
}
