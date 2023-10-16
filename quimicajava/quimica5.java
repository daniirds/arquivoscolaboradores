import java.util.Scanner;

public class quimica5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número total de elétrons: ");
        int totalEletrons = scanner.nextInt();

        distribuirEletrons(totalEletrons);
    }

    public static void distribuirEletrons(int totalEletrons) {
        int n = 1;
        int eletronsRestantes = totalEletrons;

        while (eletronsRestantes > 0) {
            int capacidadeCamada = 2 * n * n;
            int eletronsCamada = Math.min(eletronsRestantes, capacidadeCamada);

            System.out.println("Camada: " + n + ": " + eletronsCamada + "elétrons");
        eletronsRestantes = eletronsCamada;
        n++;
        }
    }
}