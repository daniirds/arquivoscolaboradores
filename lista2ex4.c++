#include <iostream>

using namespace std;

int main() {
    int numero;
    int somaDigitos = 0;

    cout << "Digite um numero inteiro positivo: ";
    cin >> numero;

    // Verifica se o número é positivo
    if (numero < 0) {
        cout << "O numero digitado nao e positivo." << endl;
        return 1;
    }

    // Calcula a soma dos dígitos
    int tempNumero = numero;
    while (tempNumero > 0) {
        int digito = tempNumero % 10;
        somaDigitos += digito;
        tempNumero /= 10;
    }

    cout << "A soma dos digitos de " << numero << " e: " << somaDigitos << endl;

    return 0;
}
