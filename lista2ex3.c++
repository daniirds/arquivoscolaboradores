#include <iostream>

using namespace std;

int main() {
    int numero;
    int contagemPares = 0;
    int contagemImpares = 0;

    cout << "Digite uma sequencia de numeros inteiros (digite 0 para encerrar):" << endl;

    do {
        cin >> numero;

        if (numero != 0) {
            if (numero % 2 == 0) {
                contagemPares++;
            } else {
                contagemImpares++;
            }
        }
    } while (numero != 0);

    cout << "Quantidade de numeros pares: " << contagemPares << endl;
    cout << "Quantidade de numeros impares: " << contagemImpares << endl;

    return 0;
}
