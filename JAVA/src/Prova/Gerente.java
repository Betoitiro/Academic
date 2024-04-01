package Prova;

public class Gerente extends Funcionario{

    private String departamento;

    public Gerente(String nome, int idade, double salario, String cargo, String departamento) {
        super(nome, idade, salario, cargo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void ExibirGerente(){
        System.out.println(" Nome: " + getNome() + " idade: " + getIdade() + " Salario: " + getSalario() +
                " Cargo: " + getCargo() + " departamento: " + departamento);
    }

}
