import java.util.Scanner;
public class Atv9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        double perimetro = 2 * raio * Math.PI;

        System.out.println("Aréa do círculo é: " + area);

        System.out.println("Perímetro do círculo é: " + perimetro);
        scanner.close();
    }
    
}
