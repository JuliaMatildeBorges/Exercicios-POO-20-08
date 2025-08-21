package Atividade02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Maquina maquina1 = new Maquina();
        maquina1.setIdentificacao(1);
        maquina1.setCapacidadeMaximaPorHora(20);

        maquina1.ligarDesligarMaquina();
        maquina1.calcularProducaoDiaria();
        maquina1.toString();




    }
}
