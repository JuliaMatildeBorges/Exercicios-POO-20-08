package Atividade06;

import java.util.Scanner;

public class MateriaPrima {
    private String nome;
    private int quantidadeEmEstoque;
    private String fornecedor;

    @Override
    public String toString() {
        return "MateriaPrima{" +
                "Nome='" + nome + '\'' +
                ", Quantidade Em Estoque=" + quantidadeEmEstoque +
                ", Fornecedor='" + fornecedor + '\'' +
                '}';
    }

    public void adicionarAoEstoque(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade para adicionar ao estoque");
        int quantidadeAdicionar = scanner.nextInt();
        this.quantidadeEmEstoque +=quantidadeAdicionar;
        System.out.println("Estoque atual: " + quantidadeEmEstoque);
    }

    public void retirarEstoque(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade que deseja retirar do estoque");
        int retirarEstoque = scanner.nextInt();
        if (retirarEstoque > quantidadeEmEstoque){
            System.out.println("Quantidade insuficiente");
        } else {
            quantidadeEmEstoque-=retirarEstoque;
        }
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }

    public void verificarEstoque(){
        System.out.println((quantidadeEmEstoque < 100) ? "Necessario reabastecer" : "Não é necessario reabastecer");
    }


    // GETTER AND SETTER


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
}
