import java.util.Scanner;
public class soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        int soma = Integer.toString(numero).chars().map(Character::getNumericValue).sum();
        System.out.println("Soma dos dígitos: " + soma);
    }
}
