#include <iostream>

int main() {
    // Variáveis para armazenar a velocidade e a altitude desejadas
    int velocidade;
    int altitude;

    // Solicitar a velocidade e a altitude ao usuário
    std::cout << "Digite a velocidade desejada (em km/h): ";
    std::cin >> velocidade;

    std::cout << "Digite a altitude desejada (em metros): ";
    std::cin >> altitude;

    // Exibir a mensagem com as informações do voo do Batwing
    std::cout << "Batwing decolando a " << velocidade << " km/h a " << altitude << " metros do solo." << std::endl;

    return 0;
}
