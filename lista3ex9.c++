#include <iostream>
#include <string>
#include <algorithm>

int main() {
    // Variáveis para armazenar os nomes dos aliados
    std::string aliado1, aliado2, aliado3;

    // Solicitar os nomes dos aliados ao usuário
    std::cout << "Digite o nome do primeiro aliado: ";
    std::getline(std::cin, aliado1);

    std::cout << "Digite o nome do segundo aliado: ";
    std::getline(std::cin, aliado2);

    std::cout << "Digite o nome do terceiro aliado: ";
    std::getline(std::cin, aliado3);

    // Colocar os nomes dos aliados em ordem alfabética
    std::string aliados[3] = {aliado1, aliado2, aliado3};
    std::sort(aliados, aliados + 3);

    // Exibir os nomes dos aliados em ordem alfabética
    std::cout << "Aliados do Batman em ordem alfabética: ";
    for (int i = 0; i < 3; i++) {
        std::cout << aliados[i];
        if (i < 2) {
            std::cout << ", ";
        }
    }
    std::cout << std::endl;

    return 0;
}
