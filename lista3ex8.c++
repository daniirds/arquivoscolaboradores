#include <iostream>

int main() {
    // Variáveis para armazenar o preço da máscara e a quantidade de dinheiro do Batman
    double preco_mascara, dinheiro_batman;

    // Solicitar o preço da máscara e a quantidade de dinheiro do Batman ao usuário
    std::cout << "Digite o preço da máscara: R$ ";
    std::cin >> preco_mascara;

    std::cout << "Digite a quantidade de dinheiro do Batman: R$ ";
    std::cin >> dinheiro_batman;

    // Verificar se o Batman tem dinheiro suficiente para comprar a máscara de reserva
    if (dinheiro_batman >= preco_mascara) {
        double dinheiro_restante = dinheiro_batman - preco_mascara;
        std::cout << "Compra realizada! Valor da compra: R$ " << preco_mascara << std::endl;
        std::cout << "Dinheiro restante: R$ " << dinheiro_restante << std::endl;
    } else {
        std::cout << "Batman não possui dinheiro suficiente para comprar a máscara de reserva." << std::endl;
    }

    return 0;
}
