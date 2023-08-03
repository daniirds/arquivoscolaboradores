#include <iostream>
#include <fstream>
#include <string>

int main() {
    // Variável para armazenar o nome do arquivo de código-fonte
    std::string nome_arquivo;

    // Solicitar o nome do arquivo de código-fonte ao usuário
    std::cout << "Digite o nome do arquivo de código-fonte (com extensão .cpp): ";
    std::getline(std::cin, nome_arquivo);

    // Converter std::string para const char*
    const char* nome_arquivo_cstr = nome_arquivo.c_str();

    // Verificar se o arquivo existe
    std::ifstream arquivo(nome_arquivo_cstr);
    if (arquivo) {
        arquivo.close();
        std::cout << "Compilando " << nome_arquivo << "..." << std::endl;
    } else {
        std::cout << "Arquivo não encontrado." << std::endl;
    }

    return 0;
}



