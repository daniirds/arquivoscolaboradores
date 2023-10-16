import java.util.Scanner;
public class quimica8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a distância percorrida (em metros): ");
        double distancia = input.nextDouble();

        System.out.println("Informe o  tempo gasto (em segundos): ");
        double tempo = input.nextDouble();

        double velocidadeMedia = distancia / tempo;

        System.out.println("A velocidade média é " + velocidadeMedia + "m/s.");

        input.close();
    }
    
}
