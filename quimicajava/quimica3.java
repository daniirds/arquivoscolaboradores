import java.util.Scanner;
public class quimica3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a massa em gramas: ");
        double massaEmGramas = scanner.nextDouble();

        System.out.println("Digite a massa molar em g/mol: ");
        double massaMolar = scanner.nextDouble();

        double quantidadeDeMols = massaEmGramas / massaMolar;
        System.out.println("A quantidade de mols é: " + quantidadeDeMols);

        scanner.close();
    }
}
