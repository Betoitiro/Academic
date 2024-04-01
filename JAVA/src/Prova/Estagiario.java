package Prova;

public class Estagiario {

    private  String nome;

    private int idade;

    private int periodo;

    public Estagiario(String nome, int idade, int periodo) {
        this.nome = nome;
        this.idade = idade;
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public void ExibirEstagiario(){
        System.out.println("nome: " + nome +
                " idade: " + idade + " Periodo: " + periodo );
    }
}
