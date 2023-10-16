import java.util.Scanner;
public class quimica20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a configuração eletrônica: ");
        String configuracaoEletronica = scanner.nextLine();

        int totalEletrons = 0;
        for (int i = 0; i < configuracaoEletronica.length(); i++) {
            if (Character.isDigit(configuracaoEletronica.charAt(i))) {
                totalEletrons += Character.getNumericValue(configuracaoEletronica.charAt(i));
            }
        }

        System.out.println("O átomo possui " + totalEletrons + "elétrons.");
    }
}
