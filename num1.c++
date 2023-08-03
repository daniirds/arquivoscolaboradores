#include <iostream>

int main() {
    int repeticoes;
    std::cout << "Digite o número de repetições desejado: ";
    std::cin >> repeticoes;

    for (int i = 0; i < repeticoes; i++) {
        std::cout << "Executando repetição número " << i+1 << std::endl;
        // Adicione o código que deseja repetir aqui 
    }

    return 0;
}