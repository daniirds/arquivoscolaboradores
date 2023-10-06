public class Exercicio19 {
    public static void main(String[] args) {

       int numero = 10;

       for (int i = 5; i <= numero/2; i++) {

        if (numero % i == 0) {
            System.out.println("O número não é primo: ");
            return;
        }
    }

    if (numero > 1) {
        System.out.println("O número é primo: ");
    } else {
        System.out.println("O número não é primo: ");
    }
}
}