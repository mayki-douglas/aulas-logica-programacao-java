package projjavaprodutodesafio5;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        Produto objProduto1 = new Produto();
        Produto objProduto2 = new Produto();

        objProduto1.setNome(JOptionPane.showInputDialog("Insira o Nome do Produto 1: "));
        objProduto1.setDescricao(JOptionPane.showInputDialog("Insira a Descrição do Produto: "));
        objProduto1.setQuantidade(Double.parseDouble(JOptionPane.showInputDialog("Digite a Quantidade: ")));
        objProduto1.setValorUnitario(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor: ")));

        objProduto2.setNome(JOptionPane.showInputDialog("Insira o nome do Produto 2: "));
        objProduto2.setDescricao(JOptionPane.showInputDialog("Insira a Descrição do Produto: "));
        objProduto2.setQuantidade(Double.parseDouble(JOptionPane.showInputDialog("Informe a Quantidade: ")));
        objProduto2.setValorUnitario(Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor do Produto: ")));

        JOptionPane.showMessageDialog(null, "Informações dos Produtos: \n"
                + "Nome: " + objProduto1.getNome() + "\n"
                + "Descrição: " + objProduto1.getDescricao() + "\n"
                + "Quantidade: " + objProduto1.getQuantidade() + "\n"
                + "Valor Unitário: " + objProduto1.getValorUnitario() + "\n"
                + "Valor total do Produto 1: " + objProduto1.calcularValorTotal() + "\n\n"
                + "Nome: " + objProduto2.getNome() + "\n"
                + "Descrição: " + objProduto2.getDescricao() + "\n"
                + "Quantidade: " + objProduto2.getQuantidade() + "\n"
                + "Valor Unitário: " + objProduto2.getValorUnitario() + "\n"
                + "Valor total do Produto 2: " + objProduto2.calcularValorTotal());
    }
}
