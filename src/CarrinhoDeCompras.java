public class CarrinhoDeCompras {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Geladeira", 3000, "Consul",1);
        Produto produto2 = new Produto("Celular",2000,"Samsung",1);
        Produto produto3 = new Produto("Televisão", 4000,"Panasonic",1);
        Produto produto4 = new Produto("Notebook", 7000,"Dell",1);


        Pedido pedido1 = new Pedido();
        pedido1.adicionarItens(produto1, 2);
        pedido1.adicionarItens(produto3, 3);
        pedido1.adicionarItens(produto4, 1);
        pedido1.listarItens();
        System.out.println("Excluindo item geladeira");
        pedido1.removerItens(produto1);
        pedido1.listarItens();
        System.out.println("Removendo 1 televisão");
        pedido1.removerQuantidadeItem(produto3,1);
        pedido1.gerarRecibo();
    }

}
