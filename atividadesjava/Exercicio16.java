public class Exercicio16 {
    
public static void main(String[] args ){
    int numero = 13; // declara numero
    int menorDivisor = 1; //declara maior divisor 

    for (int i = 2; i<=numero; i++){ //loop for
        if (numero % i ==0){ //comando if 
            menorDivisor = i;
        }
    }
    System.out.println("O menor divisor é:" + menorDivisor );
}

}