package Atividade02;

// TRABALHAREMOS COM 1 = LIGADA E 0 = DESLIGADA

import java.util.Scanner;

public class Maquina {
    private int identificacao;
    private int capacidadeMaximaPorHora;
    private int status;

    @Override
    public String toString() {
        return "Maquina{" +
                "identificacao=" + identificacao +
                ", capacidadeMaximaPorHora=" + capacidadeMaximaPorHora +
                ", status=" + status +
                '}';
    }

    public void ligarDesligarMaquina(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 para ligar a maquina e 0 para desligar");
        int ligarOuDesligar = scanner.nextInt();
       switch (ligarOuDesligar){
           case 0:
               System.out.println("Maquina Desligada");
               status = 0;
               break;
           case 1:
               System.out.println("Maquina Ligada");
               status = 1;
               break;
           default:
               System.out.println("Opção invalida");
               break;
       }

    }

        public void calcularProducaoDiaria(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a quantidade de horas trabalhada?");
        int horasTrabalhadas = scanner.nextInt();

        int producaoDiaria = capacidadeMaximaPorHora * horasTrabalhadas;
            System.out.println("Produção Diaria: " + producaoDiaria);
    }


    // GETTERS AND SETTERS


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCapacidadeMaximaPorHora() {
        return capacidadeMaximaPorHora;
    }

    public void setCapacidadeMaximaPorHora(int capacidadeMaximaPorHora) {
        this.capacidadeMaximaPorHora = capacidadeMaximaPorHora;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }
}
