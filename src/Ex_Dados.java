import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma casa decimal,
bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida, o programa deve mostrar o valor
da área do terreno, bem como o valor do preço do terreno, ambos com duas casas decimais.
 */

public class Ex_Dados {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Locale.setDefault(Locale.US);


            System.out.println("Digite a largura do terreno:");
            double largura = sc.nextDouble();
            System.out.println("Digite o comprimento do terreno:");
            double comprimento = sc.nextDouble();
            System.out.println("Digie o valor do metro quadrado:");
            double metro = sc.nextDouble();


                double area = largura * comprimento;
                double preco = area * metro;

            System.out.println("\nA largura do terreno e: " + largura);
            System.out.println("O comprimento do terreno e: " + comprimento);
            System.out.println("O valor do metro quadrado e: " + metro);
            System.out.println("A area do terreno e " + area);
            System.out.println("O preco do terreno e: " + preco);
            

        }

}
