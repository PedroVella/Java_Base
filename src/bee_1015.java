import com.sun.tools.javac.Main;

import java.util.Scanner;

/*
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2)
 e calcule a distância entre eles, mostrando 4 casas decimais.
 */

public class bee_1015 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x1, x2, y1, y2, distancia;


        System.out.println("Digite o Valor de X1: ");
        x1 = sc.nextDouble();
        System.out.println("Digite o Valor de Y1: ");
        y1 = sc.nextDouble();
        System.out.println("Digite o Valor de X2: ");
        x2 = sc.nextDouble();
        System.out.println("Digite o Valor de Y2: ");
        y2 = sc.nextDouble();

        distancia = Math.sqrt(Math.pow((x2 - x1), 2.0) + Math.pow((y2 - y1), 2.0));

        System.out.printf("Distancia: %.4f", distancia);

    }
}

