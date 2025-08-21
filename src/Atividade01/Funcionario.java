package Atividade01;
// Consideramos 1 para manhã, dois para tarde e 3 para noite
//

public class Funcionario {
    private String nome;
    private int matricula;
    private double salarioBase;
    private int turno;
    private double salarioFinal;

    public double calcularSalario(){
        if(turno == 3){
            salarioFinal = salarioBase * 1.2;
        } else {
            salarioFinal = salarioBase;
        }
        return salarioFinal;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", turno=" + turno +
                ", salarioFinal=" + calcularSalario() +
                '}';
    }

    // Getters and setters


    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }
}
