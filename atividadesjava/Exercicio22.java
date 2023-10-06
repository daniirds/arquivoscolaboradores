public class Exercicio22 {
    public static void main(String[] args) {

        double x = 5;
        double f = x;

        while (x > 1) {

            f = f*(x - 1);
            x--;

            System.out.println(f);
        }
    }

}
