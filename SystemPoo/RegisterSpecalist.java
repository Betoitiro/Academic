package SystemPoo;

public class RegisterSpecalist {
    private String name;
    private String crm;
    private String especialidade;


    public RegisterSpecalist(String nome, String crm, String especialidade) {
        this.name = nome;
        this.crm = crm;
        this.especialidade = especialidade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String ExibirDadosDoMedico(){
        return "Name" + name + "\n" +
                "Crm" + crm + "\n" +
                "Especialidade" + especialidade;
    }
}
