import java.util.Scanner;

public class vet7 {
    // Função para contar as vogais em uma string
    public static int contarVogais(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        int numeroVogais = contarVogais(frase);
        System.out.println("Número de vogais: " + numeroVogais);
        scanner.close();
    }
}