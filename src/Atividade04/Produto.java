package Atividade04;

public class Produto {
    private int codigo;
    private String nome;
    private double peso;
    private double precoCusto;

    private double cacularPrecoVenda(){
        double precoVenda = precoCusto * 1.3;
        return precoVenda;
    }

    public void imprimirDados(){
        System.out.println("*** Dados da Conta ***");
        System.out.println("Código: " +this.codigo);
        System.out.println("Nome: " +this.nome);
        System.out.println("Peso: " +this.peso);
        System.out.println("Preço custo: " +this.precoCusto);
        System.out.println("Preço venda: " + this.cacularPrecoVenda());
    }

    //GET AND SET


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }
}
