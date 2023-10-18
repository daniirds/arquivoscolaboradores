import java.util.Arrays;
public class vet3 {
    public static void main(String[] args) {
        int[] array = {4, 7, 2, 1};
        trocaPosicoes(array, 1, 2);

    System.out.println("Array após troca: " + array.toString());
    }

    public static void trocaPosicoes(int[] array, int post1, int post2) {
        int temp = array[post1];
        array[post1] = array[post2];
        array[post2] = temp;
    }
}
