#include <iostream>

using namespace std;

bool ehNumeroTriangular(int numero) {
    if (numero <= 0) {
        return false;
    }

    int soma = 0;
    int i = 1;

    while (soma < numero) {
        soma += i;
        i++;
    }

    return soma == numero;
}

int main() {
    int numero;

    cout << "Digite um numero inteiro positivo: ";
    cin >> numero;

    if (ehNumeroTriangular(numero)) {
        cout << numero << " e um numero triangular." << endl;
    } else {
        cout << numero << " nao e um numero triangular." << endl;
    }

    return 0;
}
