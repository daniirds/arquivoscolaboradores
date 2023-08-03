#include <iostream>

int main() {
    // Variáveis para armazenar a quantidade de heróis e vilões capturados
    int num_herois;
    int num_viloes;

    // Solicitar a quantidade de heróis e vilões capturados ao usuário
    std::cout << "Digite a quantidade de heróis capturados: ";
    std::cin >> num_herois;

    std::cout << "Digite a quantidade de vilões capturados: ";
    std::cin >> num_viloes;

    // Determinar quem capturou mais e exibir a mensagem correspondente
    if (num_herois > num_viloes) {
        std::cout << "Batman capturou mais heróis!" << std::endl;
    } else if (num_herois < num_viloes) {
        std::cout << "Batman capturou mais vilões!" << std::endl;
    } else {
        std::cout << "Batman capturou a mesma quantidade de heróis e vilões!" << std::endl;
    }

    return 0;
}
