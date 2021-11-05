package projjavaprodutoatividade1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        Produto objProduto1 = new Produto();
        Produto objProduto2 = new Produto();
        Produto objProduto3 = new Produto();
        
        objProduto1.nome = JOptionPane.showInputDialog("Informe o Nome do Produto 1: ");
        objProduto1.descricao = JOptionPane.showInputDialog("Informe a Descrição do Produto 1");
        objProduto1.valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor do produto 1: "));
        
        objProduto2.nome = JOptionPane.showInputDialog("Informe o Nome do Produto 2: ");
        objProduto2.descricao = JOptionPane.showInputDialog("Informe a Descfrição do Produto 2: ");
        objProduto2.valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do Produto 2: "));
        
        objProduto3.nome = JOptionPane.showInputDialog("Informe o nome do Produto 3: ");
        objProduto3.descricao = JOptionPane.showInputDialog("Informe a Descrição do Produto 3: ");
        objProduto3.valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor do Produto 3: "));
        
        JOptionPane.showMessageDialog(null, "Dados do Produto 1\n"
                +"Nome: "+objProduto1.nome+"\n"
                +"Descrição: "+objProduto1.descricao+"\n"
                +"Valor: "+objProduto1.valor);
        
        JOptionPane.showMessageDialog(null, "Dados do Produto 2\n"
                +"Nome: "+objProduto2.nome+"\n"
                +"Descrição: "+objProduto2.descricao+"\n"
                +"Valor: "+objProduto2.valor);
        
        JOptionPane.showMessageDialog(null, "Dados do Produto 3 \n"
                +"Nome: "+objProduto3.nome+"\n"
                +"Descrição: "+objProduto3.descricao+"\n"
                +"Valor: "+objProduto3.valor);
    }
}
