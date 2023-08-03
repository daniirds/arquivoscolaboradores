#include <iostream>

using namespace std;

void converterParaHorasMinSeg(int segundos, int& horas, int& minutos, int& segundosRestantes) {
    horas = segundos / 3600; // 1 hora tem 3600 segundos
    segundosRestantes = segundos % 3600;
    minutos = segundosRestantes / 60; // 1 minuto tem 60 segundos
    segundosRestantes %= 60;
}

int main() {
    int segundos;
    int horas, minutos, segundosRestantes;

    cout << "Digite uma quantidade de tempo em segundos: ";
    cin >> segundos;

    converterParaHorasMinSeg(segundos, horas, minutos, segundosRestantes);

    cout << "Equivalente a: ";
    if (horas > 0) {
        cout << horas << " hora(s) ";
    }
    if (minutos > 0) {
        cout << minutos << " minuto(s) ";
    }
    cout << segundosRestantes << " segundo(s)" << endl;

    return 0;
}
