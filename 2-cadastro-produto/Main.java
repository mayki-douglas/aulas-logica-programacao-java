package projjavaproduto;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String [] args){
        Produto objProduto1 = new Produto();
        Produto objProduto2 = new Produto();
        
        objProduto1.nome = "Sabonete";
        objProduto1.descricao = "Produto de Higiene";
        objProduto1.valorUnitario = 2.99;
        objProduto1.quantidade = 10;
        
        
        objProduto2.nome = "Papel Toalha";
        objProduto2.descricao = "Produto de Higiene";
        objProduto2.valorUnitario = 4.50;
        objProduto2.quantidade = 20;
        
        JOptionPane.showMessageDialog(null, "Dados do Produto 1\n"
                + "Nome: "+objProduto1.nome+"\n"
                + "Descrição: "+objProduto1.descricao+"\n"
                + "Valor Unitário: "+objProduto1.valorUnitario+"\n"
                + "Quantidade: "+objProduto1.quantidade);
    }
}
