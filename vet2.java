import java.util.Arrays;
public class vet2 {
    public static void main(String[] args) {
        int[] numero;
        numero =  (2, 3, 6, 8, 10, 11);
        int soma = 0;
        for (int i = 0; i < numero.length; i++) {
            soma += numero[i];
        }
        System.out.println("A soma dos elementos é: " + soma);
    }
}
