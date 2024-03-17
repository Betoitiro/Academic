package TEDII;

public class AppConta {
    public static void main(String[] args) {
        /*
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Conta contaespecial = new Conta();
        conta1.numero = 1;
        conta1.saldo = 10000;
        conta1.depositar(10021);
        conta2.numero = 2;
        conta2.saldo = 20000;
        conta2.depositar(20021);

        System.out.println("Numero da conta 1:" + conta1.numero);
        System.out.println("Numero do saldo 1:" + conta1.saldo);
        System.out.println("Numero da conta 2:" + conta2.numero);
        System.out.println("Numero do saldo 2:" + conta2.saldo);

        */

        ContaEspecial Ce = new ContaEspecial();
        //Atributo herdado
        Ce.depositar(5000);
        System.out.println(Ce.saldo);
        //Atributo dele
        Ce.sacar(4000);
        System.out.println(Ce.saldo);

        ContaInvestimento Ci = new ContaInvestimento();

        Ci.depositar(1000);
        Ci.taxa = 10;
        Ci.prazo = 5;
        System.out.println(Ci.saldo);


    }


}

