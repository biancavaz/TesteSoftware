public class Item {

    private String nome;
    private Double preco;
    public Item (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getnome (){
        return this.nome;
    }

    public double getpreco (){
        return this.preco;
    }
}
