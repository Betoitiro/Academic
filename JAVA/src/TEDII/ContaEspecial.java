package TEDII;

public class ContaEspecial {
    double limite;

    boolean sacar(double valor) {
        if (this.saldo >= valor ) {
            this.saldo = this.saldo - (valor * 0.09)    ;
            return true;
        } else {

            return false;
        }
    }
}
