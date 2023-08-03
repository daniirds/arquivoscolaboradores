#include <iostream>
 
 int main () {
    int opcao;

    std::cout << "Digite uma opcao (1-3): ";
    std::cin >> opcao;

    switch (opcao) { 
        case 1:
           std::cout << "Opcao 1 selecionada." << std::endl;
           break;
        case 2:
           std::cout << " Opcao 2 selecionada." << std::endl;
        case 3:
           std::cout << " Opcao 3 selecionada." << std::endl;
           break;
        case 4:
            std::cout << " Opcao 4 selecionada." << std::endl
            break;

        default:
            std::cout << " Opcao invalida." << std::endl;
    }
    
    return 0;
 } 

