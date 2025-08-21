package Atividade06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MateriaPrima materiaPrima  = new MateriaPrima();

        materiaPrima.setNome("Madeira");
        materiaPrima.setQuantidadeEmEstoque(150);
        materiaPrima.setFornecedor("Maderias do Gil");

        System.out.println(materiaPrima.toString());
        materiaPrima.adicionarAoEstoque();
        materiaPrima.retirarEstoque();
        materiaPrima.verificarEstoque();
    }
}
