#include <iostream>

int main() {
    // Variável para armazenar o código digitado pelo usuário
    int codigo_digitado;

    // Solicitar o código de acesso ao usuário
    std::cout << "Digite o código de acesso de 4 dígitos: ";
    std::cin >> codigo_digitado;

    // Verificar se o código está correto e exibir a mensagem correspondente
    if (codigo_digitado == 1966) {
        std::cout << "Acesso autorizado à Batcaverna!" << std::endl;
    } else {
        std::cout << "Acesso negado. Código incorreto!" << std::endl;
    }

    return 0;
}
