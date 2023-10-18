import java.util.Scanner;
    public class divisibilidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        System.out.println(numero % 28 == 0 ? "O número é divisível por 4 e 7." : "O número não é divisível por 4 e 7.");
    }
}
