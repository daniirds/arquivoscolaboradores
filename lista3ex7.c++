#include <iostream>

int main() {
    // Variáveis para armazenar a quantidade de Bat-Saqueadores e o valor unitário
    int quantidade;
    double valor_unitario;

    // Solicitar a quantidade de Bat-Saqueadores e o valor unitário ao usuário
    std::cout << "Digite a quantidade de Bat-Saqueadores que deseja comprar: ";
    std::cin >> quantidade;

    std::cout << "Digite o valor unitário de cada moeda: ";
    std::cin >> valor_unitario;

    // Calcular o valor total da compra
    double valor_total = quantidade * valor_unitario;

    // Exibir o valor total da compra na tela
    std::cout << "Valor total da compra: R$ " << valor_total << std::endl;

    return 0;
}
