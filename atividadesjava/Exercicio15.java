public class Exercicio15 {
    
public static void main(String[] args ){
    int numero = 13; // declara numero
    int maiorDivisor = 1; //declara maior divisor 

    for (int i = 2; i<=numero; i++){ //loop for
        if (numero % i ==0){ //comando if 
            maiorDivisor = i;
        }
    }
    System.out.println("O maior divisor é:" + maiorDivisor );
}

}