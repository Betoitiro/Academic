package AtividadeRecrutamento;

public class Produto {

    private String name;

    private String Description;

    private double price;

    public Produto(String name, String description, double price) {
        this.name = name;
        Description = description;
        this.price = price;
    }

    public Produto(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
