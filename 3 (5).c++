#include <iostream>
#include <cmath>

bool ehDivisivelPor3(int num) {
    return (num % 3) == 0;
}

bool ehQuadradoPerfeito(int num) {
    int raiz = sqrt(num);
    return (raiz * raiz) == num;
}

bool temSomaDigitosMenorIgual10(int num) {
    int soma = 0;
    while (num > 0) {
        soma += num % 10;
        num /= 10;
    }
    return soma <= 10;
}

int encontrarNumeroMagico(int limiteInferior, int limiteSuperior) {
    for (int num = limiteInferior; num <= limiteSuperior; num++) {
        if (ehDivisivelPor3(num) && ehQuadradoPerfeito(num) && temSomaDigitosMenorIgual10(num)) {
            return num;
        }
    }
    return -1; // Caso não encontre nenhum número mágico no intervalo
}

int main() {
    int limiteInferior, limiteSuperior;

    std::cout << "Digite o limite inferior do intervalo: ";
    std::cin >> limiteInferior;

    std::cout << "Digite o limite superior do intervalo: ";
    std::cin >> limiteSuperior;

    int numeroMagico = encontrarNumeroMagico(limiteInferior, limiteSuperior);

    if (numeroMagico != -1) {
        std::cout << "O menor número mágico dentro do intervalo [" << limiteInferior << ", " << limiteSuperior << "] é: " << numeroMagico << std::endl;
    } else {
        std::cout << "Não há números mágicos no intervalo [" << limiteInferior << ", " << limiteSuperior << "]." << std::endl;
    }

    return 0;
}
