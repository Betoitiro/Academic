package Prova;

public class App {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Humberto", 17, 5000, "programador backend");
        f1.pagamento();
        f1.pagamentoBeneficente();

        Gerente g1 = new Gerente("Jp", 23,2500, "Gerente", "A");
        g1.ExibirGerente();

        Estagiario e1 = new Estagiario("Uchoa", 19, 3);
        e1.ExibirEstagiario();
    }
}
