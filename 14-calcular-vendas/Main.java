package projjavacalcularvendas;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Vendedor objVendedor = new Vendedor();
        
        objVendedor.setNome(JOptionPane.showInputDialog("Insira o Nome do Vendedor: "));
        objVendedor.setValorTotalVendido(Float.parseFloat(JOptionPane.showInputDialog("Insira o valor total Vendido: ")));
        objVendedor.setMeta(Float.parseFloat(JOptionPane.showInputDialog("Insira a Meta: ")));
        
        JOptionPane.showMessageDialog(null, "\n"
                + objVendedor);
    }
}
