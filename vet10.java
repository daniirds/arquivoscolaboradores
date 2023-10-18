import java.util.Scanner;

public class vet10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite as notas separadas por espaços: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] notaStrings = input.split(" ");
        double soma = 0.0;

        for (String notaStr : notaStrings) {
            double nota = Double.parseDouble(notaStr);
            soma += nota;
        }

        double media = soma / notaStrings.length;
        System.out.println("Média das notas: " + media);
    }
}