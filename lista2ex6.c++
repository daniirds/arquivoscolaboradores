#include <iostream>

using namespace std;

bool ehPrimo(int numero) {
    if (numero <= 1) {
        return false;
    }

    for (int i = 2; i * i <= numero; i++) {
        if (numero % i == 0) {
            return false;
        }
    }

    return true;
}

int main() {
    int numero;

    cout << "Digite um numero inteiro: ";
    cin >> numero;

    cout << "Numeros primos menores ou iguais a " << numero << ": ";

    for (int i = 2; i <= numero; i++) {
        if (ehPrimo(i)) {
            cout << i << " ";
        }
    }

    cout << endl;

    return 0;
}
