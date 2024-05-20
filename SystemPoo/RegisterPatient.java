package SystemPoo;

public class RegisterPatient {
    private String nome;
    
    private String email;
    
    private String telefone;
    
    private String motivoDaConsulta;

    public RegisterPatient() {
    }

    public RegisterPatient(String nome, String email, String telefone, String motivoDaConsulta) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.motivoDaConsulta = motivoDaConsulta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMotivoDaConsulta() {
        return motivoDaConsulta;
    }

    public void setMotivoDaConsulta(String motivoDaConsulta) {
        this.motivoDaConsulta = motivoDaConsulta;
    }

    public String exibirPaciente() {
        return "Nome: " + nome + "\n" +
                "Email: " + email + "\n" +
                "Telefone: " + telefone + "\n" +
                "Motivo da Consulta: " + motivoDaConsulta;
    }

}
