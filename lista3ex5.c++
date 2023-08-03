#include <iostream>

int main() {
    // Variável para armazenar a distância do inimigo em metros
    double distancia_inimigo;

    // Solicitar a distância do inimigo ao usuário
    std::cout << "Digite a distância do inimigo (em metros): ";
    std::cin >> distancia_inimigo;

    // Verificar a distância e exibir a mensagem correspondente
    if (distancia_inimigo <= 100) {
        std::cout << "Perigo muito próximo! Prepare-se para o combate!" << std::endl;
    } else {
        std::cout << "Inimigo detectado, mas ainda não é uma ameaça iminente." << std::endl;
    }

    return 0;
}
