import java.util.Scanner;

public class quimica7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a altura (em metros): ");

        double altura = input.nextDouble();

        System.out.println("Informe a aceleração devida à gravidade (em m/s2): ");
        double gravidade = input.nextDouble();

        double velocidadeFinal = Math.sqrt(2 * gravidade * altura);

        System.out.println("A velocidade final é " + velocidadeFinal + "m/s. ");

        input.close();
    }
}