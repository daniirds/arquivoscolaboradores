import java.util.Scanner;
public class perimetroQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o comprimento do lado do quadrado: ");

        double lado = scanner.nextInt();
        double calculo = 4 * lado;

        System.out.println("O perímetro do quadrado é: " + calculo);
    }
}