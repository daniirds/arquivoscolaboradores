#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;

int main() {
    srand(time(0)); // Semente para geração de números aleatórios baseada no horário atual

    int numeroAleatorio = rand() % 100 + 1; // Gera um número aleatório entre 1 e 100
    int tentativa;
    int tentativasRestantes = 5;

    cout << "Bem-vindo ao jogo de adivinhacao!" << endl;
    cout << "Tente adivinhar o numero entre 1 e 100." << endl;

    while (tentativasRestantes > 0) {
        cout << "Digite sua tentativa: ";
        cin >> tentativa;

        if (tentativa == numeroAleatorio) {
            cout << "Parabens! Voce acertou o numero." << endl;
            break;
        } else if (tentativa < numeroAleatorio) {
            cout << "Tente novamente. O numero a ser adivinhado e maior." << endl;
        } else {
            cout << "Tente novamente. O numero a ser adivinhado e menor." << endl;
        }

        tentativasRestantes--;
        cout << "Tentativas restantes: " << tentativasRestantes << endl;
    }

    if (tentativasRestantes == 0) {
        cout << "Suas tentativas acabaram. O numero correto era: " << numeroAleatorio << endl;
    }

    return 0;
}