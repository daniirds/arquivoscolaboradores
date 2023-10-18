import java.util.Arrays;

public class vet8 {
    // Função para ordenar uma lista de números inteiros usando o Bubble Sort
    public static void bubbleSort(int[] lista) {
        int n = lista.length;
        boolean trocou;
        
        do {
            trocou = false;
            for (int i = 1; i < n; i++) {
                if (lista[i - 1] > lista[i]) {
                    // Troca os elementos se estiverem fora de ordem
                    int temp = lista[i - 1];
                    lista[i - 1] = lista[i];
                    lista[i] = temp;
                    trocou = true;
                }
            }
        } while (trocou);
    }

    public static void main(String[] args) {
        int[] lista = {5, 2, 8, 1, 9, 3};

        System.out.println("Lista original: " + Arrays.toString(lista));
        
        bubbleSort(lista); // Chama a função para ordenar a lista
        
        System.out.println("Lista ordenada: " + Arrays.toString(lista));
    }
}