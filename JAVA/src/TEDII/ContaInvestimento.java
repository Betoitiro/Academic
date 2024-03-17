package TEDII;
public class ContaInvestimento extends Conta {
    double taxa;
    int prazo;

    boolean sacar(double valor) {
        if (this.taxa >= valor) {
            this.taxa = this.taxa - valor;
            return true;
        } else {
            return false;
        }
    }

    boolean depositar(double valor) {
        if (this.taxa >= 0) {
            this.taxa += this.taxa + valor;
            return true;
        } else {
            return false;
        }
    }

    boolean aplicaRendimento(double taxa) {
        if (this.taxa >= 0) {
            this.taxa = this.taxa * taxa;
            return true;
        }   else {
            return false;
        }
    }

}
