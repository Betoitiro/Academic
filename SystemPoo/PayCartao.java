package SystemPoo;

public class PayCartao extends Pay{
    private String debitoCredito;
    private String numeroDoCartao;
    private int cvv;
    private String validade;

    public PayCartao(String debitoCredito, String numerodocartao, int cvv, String validade) {
        this.debitoCredito = debitoCredito;
        this.numeroDoCartao = numerodocartao;
        this.cvv = cvv;
        this.validade = validade;
    }

    public String getDebitoCredito() {
        return debitoCredito;
    }

    public void setDebitoCredito(String debitoCredito) {
        this.debitoCredito = debitoCredito;
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
}
