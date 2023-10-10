import java.util.Scanner;
public class Atv10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + "é um número par.");
        } else {
            System.out.println( numero + "é um número ímpar.");
        }
        scanner.close();
    }
    
}
