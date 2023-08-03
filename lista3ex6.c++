#include <iostream>

int main() {
    // Variáveis para armazenar as coordenadas X e Y digitadas pelo usuário
    int coordenada_x, coordenada_y;

    // Solicitar as coordenadas X e Y ao usuário
    std::cout << "Digite a coordenada X (horizontal): ";
    std::cin >> coordenada_x;

    std::cout << "Digite a coordenada Y (vertical): ";
    std::cin >> coordenada_y;

    // Verificar se as coordenadas estão dentro dos limites da cidade
    if (coordenada_x >= -100 && coordenada_x <= 100 && coordenada_y >= -50 && coordenada_y <= 50) {
        std::cout << "Localização possível do esconderijo do Coringa." << std::endl;
    } else {
        std::cout << "Coordenadas fora dos limites da cidade." << std::endl;
    }

    return 0;
}
