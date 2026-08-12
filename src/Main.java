public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Caixa de Ferramentas", 150.00);
        System.out.println("Produto: " + produto.getNome() + " | Preco: " + produto.getPreco() + " | Estoque: " + produto.getQuantidadeEmEstoque());

        FuncProducao funcProd = new FuncProducao("Carlos", 2500.00, "Manha");
        funcProd.trabalhar();

        Gestor gestor = new Gestor("Ana", 5000.00);
        gestor.trabalhar();
    }
}
