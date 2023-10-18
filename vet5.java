 import java.util.Scanner;
public class vet5 {     

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Digite uma palavra: ");
            String palavra = scanner.next().toLowerCase();
             
            boolean ehPalindromo = new StringBuilder(palavra).reverse().toString().equals (palavra);
            
            if (ehPalindromo) {
            System.out.println("a palavra é um palidromo");
            } else {

            System.out.println("A palavra não é um palidromo");
            }
        }
    }
