import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int resultadoFatorial = 1;
       StringBuilder multiplicador = new StringBuilder();

       System.out.println("Digite um número para saber o fatorial: ");
       int fatorialNumero = scanner.nextInt();

       while (fatorialNumero < 0) {
        System.out.println("Não é possível calcular fatorial de número negativo");
        fatorialNumero = scanner.nextInt();
       }

       for (int i = fatorialNumero; i > 1; i--) {
        resultadoFatorial *= i;
        multiplicador.append(i).append("x");
       }

       if (fatorialNumero == 0) {
        System.out.println(fatorialNumero + "! = " + resultadoFatorial);
       } else if (fatorialNumero == 1){
        System.out.println(fatorialNumero + "! = " + resultadoFatorial);
       } else {
        System.out.println(fatorialNumero + "! = " + multiplicador + "1 = " + resultadoFatorial);
       }
       scanner.close();
    }
    
}
