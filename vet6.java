import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class vet6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os números separados por espaços: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] numStrings = input.split(" ");
        List<Integer> numeros = new ArrayList<>();

        for (String numStr : numStrings) {
            int numero = Integer.parseInt(numStr);
            numeros.add(numero);
        }

        HashSet<Integer> conjuntoUnico = new HashSet<>(numeros);
        List<Integer> listaSemRepetidos = new ArrayList<>(conjuntoUnico);

        System.out.println("Lista original: " + numeros);
        System.out.println("Lista sem elementos repetidos: " + listaSemRepetidos);
    }
}
```