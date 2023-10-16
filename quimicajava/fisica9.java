import java.util.Scanner;
public class fisica9 {

    public static void main(String[] args, Scanner input) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a corrente (em volts): ");
        double tensao = input.nextDouble();

        System.out.println("Informe a corrente (em amperes): ");
        double corrente = input.nextDouble();
        double resistencia = tensao / corrente;

        System.out.println("A resistência é " + resistencia + "ohms. ");

        input.close();
    }
}