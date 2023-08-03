#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

// Função para remover espaços de uma string
string removeEspacos(string str) {
    str.erase(remove(str.begin(), str.end(), ' '), str.end());
    return str;
}

// Função para converter string para letras minúsculas
string toLowerCase(string str) {
    transform(str.begin(), str.end(), str.begin(), ::tolower);
    return str;
}

int main() {
    string palavra;

    cout << "Digite uma palavra ou frase: ";
    getline(cin, palavra);

    string palavraSemEspacos = removeEspacos(palavra);
    string palavraLowerCase = toLowerCase(palavraSemEspacos);

    // Inverte a string
    string palavraInvertida = palavraLowerCase;
    reverse(palavraInvertida.begin(), palavraInvertida.end());

    if (palavraLowerCase == palavraInvertida) {
        cout << "A palavra/frase digitada e um palindromo." << endl;
    } else {
        cout << "A palavra/frase digitada nao e um palindromo." << endl;
    }

    return 0;
}
