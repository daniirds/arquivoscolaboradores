import java.util.Scanner;

public class quimica19 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a configuração eletron1ica:");
        String configuracaoEletronica = scanner.next();

        int UltimoSubnivel = Character.getNumericValue(configuracaoEletronica.charAt ( configuracaoEletronica.length()-2));
        System.out.println("O ultimo subnivel preenchido é " + UltimoSubnivel +"s.");
    }
}
