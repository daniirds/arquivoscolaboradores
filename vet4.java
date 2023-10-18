import java.util.Scanner;
public class vet4 {
    public static int somaDigitos(int numero) {
        int soma = 0;
        while (numero > 0) {
            soma += numero % 10;
            numero /= 10;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");

        if (scanner.hasNext()) {
            int numero = scanner.nextInt();
            int resultado = somaDigitos(numero);
            System.out.println("Soma dos dígitos: " + resultado);
        }
        else {
            System.out.println("Digite um número inteiro.");
        }
    }
}
