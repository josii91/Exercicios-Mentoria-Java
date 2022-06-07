public class Produto {

    private String nome;
    private double preco;
    private String marca;
    private int quantidade;

    public Produto(String nome, double preco, String marca,  int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }



}





