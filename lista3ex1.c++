#include <iostream>
#include <string>

int main() {
    // Variável para armazenar o nome do comissário
    std::string nome_comissario;

    // Solicitar o nome do comissário ao usuário
    std::cout << "Digite o nome do Comissário: ";
    std::getline(std::cin, nome_comissario);

    // Exibir a mensagem com o Bat-Sinal
    std::cout << "Comissário " << nome_comissario << ", acione o Bat-Sinal!" << std::endl;

    return 0;
}
