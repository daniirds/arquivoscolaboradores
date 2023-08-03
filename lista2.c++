#include <iostream>

using namespace std;

double calcularPiLeibniz(int iteracoes) {
    double pi = 0.0;
    int sinal = 1;

    for (int i = 0; i < iteracoes; i++) {
        pi += sinal * (1.0 / (2 * i + 1));
        sinal = -sinal;
    }

    return 4 * pi;
}

int main() {
    int iteracoes;

    cout << "Digite o numero de iteracoes para calcular o valor aproximado de pi: ";
    cin >> iteracoes;

    if (iteracoes <= 0) {
        cout << "O numero de iteracoes deve ser maior que zero." << endl;
        return 1;
    }

    double piAproximado = calcularPiLeibniz(iteracoes);

    cout << "O valor aproximado de pi apos " << iteracoes << " iteracoes e: " << piAproximado << endl;

    return 0;
}
