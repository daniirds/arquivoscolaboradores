public class Exercicio25 {
    public static void main(String[] args) {
        int n = 10;
        int primeiro = 0, segundo = 1;
        System.out.println("Sequência de Filobonacci: " + primeiro + ", " + segundo);

        for (int i = 2; i < n; i++) {
            int proximo = primeiro + segundo;
            System.out.println(", " + proximo);
            primeiro = segundo;
            segundo = primeiro;
        }
    }
    
}
