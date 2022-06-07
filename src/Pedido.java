import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Produto> itens = new ArrayList<>();

    public void adicionarItens(Produto item, int quantidade) {
        this.itens.add(item);
        item.setQuantidade(quantidade);
    }

    public void removerItens(Produto item) {
        this.itens.remove(item);
    }

    public void removerQuantidadeItem(Produto item, int quantidade) {
       int quantidadeFinal = item.getQuantidade() - quantidade;
       item.setQuantidade(quantidadeFinal);
    }

    public void listarItens() {
        System.out.println("Quantidade X Produtos x Valor Uni. x Valor total");
        for(Produto item:itens){
            System.out.println(item.getQuantidade() + "x -" + item.getNome() + " (" +
                    item.getMarca() + "): R$ " + item.getPreco() + " - R$ " +
                    item.getPreco() * item.getQuantidade());
        }
    }
     public int calcularQuantidadeTotalItens() {
         int quantidadeTotalItens = 0;
         for (int i = 0; i < itens.size(); i++) {
             quantidadeTotalItens += itens.get(i).getQuantidade();
         }   return quantidadeTotalItens;

}
    public double calcularValorItens() {
        double soma = 0;
        for (Produto produto : itens) {
            soma += produto.getPreco() * produto.getQuantidade();
        }
        return soma;
    }

    public void gerarRecibo(){
        System.out.println("==== Obrigado pela sua compra! ====");
        listarItens();
        System.out.println("Total itens: " + calcularQuantidadeTotalItens());
        System.out.println("Total: R$" + calcularValorItens());
        System.out.println("==== Tenha um ótimo dia e volte sempre! ====");
    }
}

